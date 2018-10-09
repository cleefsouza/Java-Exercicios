package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.Pessoa;

/**
 * 
 * @author cleefsouza
 *
 */
public class PessoaDAO {
	Connection con = null; // Variavel para receber conxe�o

	// Construtor inicia conex�o
	public PessoaDAO() {
		this.con = new ConnectionFactory.ConnectionStart().getConnection();
	}

	/*
	 * M�todos
	 */

	// Inserir
	public void inserir(Pessoa p) {
		String sql = "insert into pessoa(cpf, nome, rg, idade) values(?, ?, ?, ?);";
		try (PreparedStatement pstm = this.con.prepareStatement(sql)) {
			// Preparando elemento
			pstm.setString(1, p.getCpf());
			pstm.setString(2, p.getNome());
			pstm.setString(3, p.getRg());
			pstm.setInt(4, p.getIdade());

			// Executando query
			pstm.execute();
			System.out.println("Pessoa inserida com sucesso.");
		} catch (SQLException e) {
			System.err.println("Erro ao inserir pessoa.\n" + e.getMessage());
		}
	}

	// Listar
	public List<Pessoa> listar() {
		List<Pessoa> lista = null;
		String sql = "select * from pessoa;";
		try (Statement pstm = this.con.createStatement(); ResultSet rs = pstm.executeQuery(sql)) {

			Pessoa p;
			lista = new ArrayList<>();
			while (rs.next()) {
				p = new Pessoa();
				p.setCpf(rs.getString("cpf"));
				p.setNome(rs.getString("nome"));
				p.setRg(rs.getString("rg"));
				p.setIdade(rs.getInt("idade"));
				// Inserindo na lista
				lista.add(p);
			}
		} catch (SQLException e) {
			System.err.println("Erro ao inserir pessoa.\n" + e.getMessage());
		}
		return lista;
	}

	// Remover
	public void remover(String scpf) {
		String sql = "delete from pessoa where cpf = ?";
		try (PreparedStatement pstm = this.con.prepareStatement(sql)) {
			pstm.setString(1, scpf);
			pstm.execute(); // Executando remo��o
			System.out.println("Pessoa removida com sucesso!");
		} catch (SQLException e) {
			System.err.println("Erro ao remover pessoa.\n" + e.getMessage());
		}
	}

	// Alterar
	public void alterar(String scpf) {
		String sql = "update set pessoa cpf = ?, nome = ?, rg = ?, idade = ? where cpf = ?";
		Pessoa p;
		try (PreparedStatement pstm = this.con.prepareStatement(sql)) {
			// Preparando elemento
			p = new Pessoa();
			pstm.setString(1, p.getCpf());
			pstm.setString(2, p.getNome());
			pstm.setString(3, p.getRg());
			pstm.setInt(4, p.getIdade());
			pstm.setString(5, scpf);
		} catch (SQLException e) {
			System.err.println("Erro ao atualizar pessoa.\n" + e.getMessage());
		}
	}

	// Buscar por CPF
	public Pessoa buscarPorCpf(String scpf) {
		String sql = "select * from pessoa where cpf = "+scpf;
		Pessoa p = null;
		try (Statement stm = this.con.createStatement()) {
			
			ResultSet rs = stm.executeQuery(sql);
			p = new Pessoa();
			while (rs.next()) {
				p.setCpf(rs.getString("cpf"));
				p.setNome(rs.getString("nome"));
				p.setRg(rs.getString("rg"));
				p.setIdade(rs.getInt("idade"));
			}
		} catch (SQLException e) {
			System.err.println("Erro ao buscar pessoa pelo cpf.\n" + e.getMessage());
		}

		if (p.equals(null)) {
			System.err.println("Esta pessoa n�o est� cadastrada na nossa base de dados.");
		} else {
			System.out.println("----------------- RETORNO DA BUSCA\n" + "Nome: " + p.getNome() + "\n" + "CPF: "
					+ p.getCpf() + "\n" + "RG: " + p.getRg() + "\n" + "Idade: " + p.getIdade());
		}
		return p;
	}

	// Buscar por RG
	public Pessoa buscarPorRg(String srg) {
		return null;
	}

	// Buscar por nome
	public Pessoa buscarPorNome(String snome) {
		return null;
	}
}
