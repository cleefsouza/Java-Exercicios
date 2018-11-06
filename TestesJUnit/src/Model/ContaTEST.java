package Model;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author cleefsouza
 *
 */

public class ContaTEST {

	/*
	 * M�todos de Teste
	 */

	@Test(expected = IllegalArgumentException.class)
	public void saldoValorNegativo() throws SaldoInsuficienteException {
		// Cen�rio de teste
		Conta conta = new Conta("123-4", 100);

		// Realizando a��o
		conta.sacar(-50);
	}

	@Test(expected = SaldoInsuficienteException.class)
	public void saldoValorInsuficiente() throws SaldoInsuficienteException {
		// Cen�rio de teste
		Conta conta = new Conta("123-4", 100);

		// Realizando a��o
		conta.sacar(200);
	}

	@Test
	public void realizandoSaque() throws SaldoInsuficienteException {
		// Cen�rio de teste
		Conta conta = new Conta("123-4", 100);

		// Realizando a��o
		conta.sacar(50);
		Assert.assertEquals(50, conta.getSaldo(), 0.00001);
	}

	@Test(expected = DepositoNegativoException.class)
	public void depositoNegativo() throws DepositoNegativoException {
		// Cen�rio de teste
		Conta conta = new Conta("123-4", 100);

		// Realizando a��o
		conta.depositar(-1);
	}
}