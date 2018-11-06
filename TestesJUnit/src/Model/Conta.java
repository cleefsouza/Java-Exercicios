package Model;

/**
 * 
 * @author cleefsouza
 *
 */

public class Conta {
	String numeroConta;
	double saldo;

	// Construtores
	public Conta() {

	}

	public Conta(String num, double sal) {
		this.numeroConta = num;
		this.saldo = sal;
	}

	/*
	 * M�todos
	 */

	public double getSaldo() {
		return this.saldo;
	}

	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor < 0) {
			throw new IllegalArgumentException("N�o � permitido saldo negativo!");
		} else if (valor > this.saldo) {
			throw new SaldoInsuficienteException("Saldo insuficiente!");
		} else {
			this.saldo -= valor;
		}
	}

	public void depositar(double valor) throws DepositoNegativoException {
		if (valor < 0) {
			throw new DepositoNegativoException("N�o � permitido valores negativos!");
		} else {
			this.saldo += valor;
		}
	}
}
