package Ex003;

public class IdadeException extends Exception{

	public IdadeException(String msg) {
		super(msg); // Recebe mensagem que ser� passada para a superclasse
		System.out.println("Passando pela classe idade esception!");
	}

}
