package model;

import controller.ISomar;

/**
 *
 * @author cleefsouza
 */
public class Principal {

	public static void main(String[] args) {

		/*
		 * implementa��o padr�o
		 */
		Somar padrao = new Somar();
		padrao.somar(5, 5);

		/*
		 * lambda n�o implementado
		 */
		ISomar sem_lambda = new ISomar() {
			@Override
			public void somar(int a, int b) {
				System.out.println("Resultado: " + (a + b));
			}
		};
		sem_lambda.somar(10, 10);

		/*
		 * lambda implementado
		 */
		ISomar com_lambda = (a, b) -> System.out.println("Resultado: " + (a + b));
		com_lambda.somar(15, 15);

	}
}