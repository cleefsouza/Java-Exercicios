package Model;

import java.util.ArrayList;

/**
 * @author cleefsouza
 *
 */

public class Main {
	public static void main(String[] args) {

		// Gerente
		Gerente gerente = new Gerente();
		gerente.setNome("Cleef Souza");
		gerente.setSalario(12000);
		gerente.setUsuario("admin");
		gerente.setSenha("password");

		// Secret�ria
		Secretaria secretaria = new Secretaria();
		secretaria.setNome("Geovana Alves");
		secretaria.setSalario(1800);
		secretaria.setNumeroRamal(242);

		// Telefonista
		Telefonista telefonista = new Telefonista();
		telefonista.setNome("Roseana Aires");
		telefonista.setSalario(970);
		telefonista.setCodigoEstacao(0025);

		// Console
		System.out.println("## Gerente\n" + "# Nome: " + gerente.getNome() + "\n" + "Sal�rio: " + gerente.getSalario()
				+ "\n" + "Bonifica��o: " + gerente.calcularBonificacao() + "\n" + "Usu�rio: " + gerente.getUsuario()
				+ "\n" + "Senha: " + gerente.getSenha() + "\n" + "-------------------------");

		System.out.println("## Secretaria\n" + "# Nome: " + secretaria.getNome() + "\n" + "Sal�rio: "
				+ secretaria.getSalario() + "\n" + "Bonifica��o: " + secretaria.calcularBonificacao() + "\n" + "Ramal: "
				+ secretaria.getNumeroRamal() + "\n" + "-------------------------");

		System.out.println("## Telefonista\n" + "# Nome: " + telefonista.getNome() + "\n" + "Sal�rio: "
				+ telefonista.getSalario() + "\n" + "Bonifica��o: " + telefonista.calcularBonificacao() + "\n"
				+ "Esta��o: " + telefonista.getCodigoEstacao() + "\n" + "-------------------------");
	}
}
