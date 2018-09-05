package Ex001;

public class Utils {
	/*
	 * M�todos
	 */

	public double toCelsius(double fahrenheit) throws FahrenheitException {
		double celsius = (5 * (fahrenheit - 32)) / 9;
		if (celsius < -459.67) { // Tratando a exce��o
			throw new FahrenheitException("Resultado menor que zero absoluto!"); // Recebe a mensagem que ser� enviada para a superclasse
		} else {
			return celsius;
		}		
	}
}
