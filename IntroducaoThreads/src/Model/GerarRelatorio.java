package Model;

/**
 * 
 * @author cleefsouza
 *
 */
public class GerarRelatorio implements Runnable {

	@Override
	public void run() {
		System.err.println("inicio do relat�rio");
		for (int i = 0; i <= 10; i++) {
			System.out.println("relat�rio: " + i);
		}
		System.err.println("fim do relat�rio");
	}
}