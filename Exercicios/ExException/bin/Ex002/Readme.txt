Exercic�o:

Considere os problemas de saque e deposito em uma conta bancaria.

a) Crie uma classe conta com os atributos saldo, limite e n�mero.
Tamb�m implemente os m�todos sacar (decrementa determinado valor do saldo), depositar (incrementa determinado valor no saldo)
e obterSaldo (acessa o valor do saldo encapsulado).

b) Crie duas Exce��es, SaldoNegativoException e ValorException. Ambas devem herdar da classe Exception.

c) Reescreva os m�todos sacar e depositar da classe conta, lan�ando uma exce��o SaldoNegativoException se o valor
do saque for maior que o saldo em conta corrente e lan�ando um ValorException se o valor do deposito for menor ou igual a zero.

d) Teste os m�todos para ver se as exce��es est�o sendo lan�adas e trate-as.