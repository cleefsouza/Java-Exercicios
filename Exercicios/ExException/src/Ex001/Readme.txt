Exercic�o:

Considere o problema de convers�o de temperaturas entre Celsius e Fahrenheit em
Java.

a) Crie duas exce��es, TemperatureException que herda de Exception e
FahrenheitException que herda de TemperatureException.
b) Crie uma classe utilit�ria (Utils) com um m�todo para converter temperaturas em
graus Fahrenheit para graus Celsius (toCelsius()), ambas representadas em pontoflutuante
(double). Por�m, caso o valor a ser convertido seja menor que zero
absoluto (-459,67�F) deve-se lan�ar a exce��o FahrenheitException. A formula para
convers�o � dada por: C = 5 (f - 32) / 9