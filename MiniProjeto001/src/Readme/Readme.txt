# Mini Projeto 001
## Prof: Thiago Rodrigues Medeiros
## Aluno: Aryosvalldo Cleef de Souza

A. Depois de criar as classes do diagrama (UML.jpg) com seus atributos encapsulados e m�todos, crie uma classe principal com o m�todo main() e desenvolva a l�gica a seguir:
B. O Sistema dever� possuir um menu para cadastro de contas, listagem das contas e acessar uma conta.

----------------------------------------
> Gerenciamento de Contas
>> 1 � Cadastrar Conta
>> 2 � Listar Contas
>> 3 � Acessar uma Conta
>> 4 � Sair
----------------------------------------

1. No item 1 do menu, dever� ser pedido todos os dados para cadastrar uma conta e adicionar essa conta criada em uma ag�ncia.
2. No item 2 do menu, dever� ser listada todas as contas da ag�ncia.
2.1. Se a ag�ncia n�o possuir nenhuma conta exibir uma mensagem ao usu�rio
3. No item 3 do menu, dever� ser pedido o n�mero de determinada conta para que se possa realizar as suas opera��es. Essas opera��es dever�o ser descritas em outro menu.
3.1. Se n�o existir uma conta com o n�mero informado dever� ser retornado uma mensagem avisando esse erro ao usu�rio.
4. No item 4 do menu, o sistema dever� encerrar o programa e exibir a mensagem. Obrigado por utilizar o banco �Unip� Bank�.

C. Todas as contas devem pertencer a uma �nica Ag�ncia. Dessa forma uma ag�ncia deve ser criada no in�cio do programa e todas as contas criadas devem ser adicionadas a ela.
D. O menu de acesso a uma conta dever� possuir as op��es abaixo:

----------------------------------------
> Conta n�: 45254
>> 1 � Realizar Saque
>> 2 � Realizar Deposito
>> 3 � Realizar Transfer�ncia
>> 4 � Extrato Banc�rio
>> 5 � Sair
----------------------------------------

1. No item 1 do menu, dever� ser pedido um valor de saque e efetuar essa opera��o na conta escolhida.
1.1. Se o valor do saque for maior que o saldo da conta uma mensagem dever� ser exibida ao usu�rio informando esse erro.
2. No item 2 do menu, dever� ser pedido um valor de deposito e efetuar essa opera��o na conta escolhida.
3. No item 3 do menu, dever� ser pedido um valor de transfer�ncia e o n�mero de uma conta e efetuar essa opera��o na conta escolhida.
3.1. Depois do n�mero da conta que receber� a transfer�ncia for digitado, ser� necess�rio pesquisar na ag�ncia se a conta existe. Se a conta n�o existir, uma mensagem dever� ser exibida ao usu�rio informando essa situa��o.
4. No item 4 do menu, dever� ser exibida todas as movimenta��es realizadas na conta escolhida.
5. No item 5 do menu, o sistema dever� voltar para o menu gerenciamento de contas.

E. A cada momento que o usu�rio realizar um saque, deposito ou transfer�ncia, um movimento deve ser criado e adicionado no ArrayList de movimentos da conta.
F. Encontre duas exce��es que podem ocorrer durante a execu��o do programa e crie classes personalizadas para exce��es herdando de exception. Depois trate as mesmas dentro do c�digo.