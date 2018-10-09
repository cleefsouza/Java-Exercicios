package ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * 
 * @author cleefsouza
 *
 */
public class ConnectionStart {

	Connection con = null;

	public Connection getConnection() {
		try {
			String url = "jdbc:sqlite:C:/sqlite/introducao_jdbc.db"; // URL
																		// database
			// Criando conex�o
			this.con = DriverManager.getConnection(url);
			System.out.println("Conex�o com sqlite estabelecida.");

		} catch (SQLException e) {
			System.err.println("Erro ao estabelecer conex�o.\n" + e.getMessage());
		}
		return this.con;
	}
}
