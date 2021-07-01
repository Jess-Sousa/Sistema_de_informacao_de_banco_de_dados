package TrabalhoPratico4;



public class Exceptions
{
/*
 * 
 *
 Objetivo: Praticar conceitos de Exce��es (throws, try-catch,
 Criar sua Pr�pria Exce��o) e Verifica��o de Entradas 

Problema: Um programa que pega os valores de 2 arrays (arrayA e arrayB)
 e imprime a divis�o dos valores desses arrays


1) Em uma classe, defina como atributos os 2 arrays com 10 posi��es e 
tamb�m m�todos para recuperar (getArrayA() e getArrayB) e
 alterar esses arrays (setArrayA() e setArrayB). Crie tamb�m 2 m�todos 
 (setArraANaPosicao e setArrayBNaPosicao), que recebem como par�metro um 
 valor int e uma posi��o, e colocam esse valor na respectiva posi��o do array.
 Nesses m�todos, voc� deve implementar a verifica��o da entrada (posi��o) para
 garantir que � v�lido para o array

2) Implemente um m�todo que calcula e imprime a divis�o de 2 n�meros. 
Esse m�todo deve ter como assinatura �'calcula (int a, int b)' . 
Nele voc� deve capturar e tratar a exce��o do tipo ArithmeticException. 
No tratamento, voc� pode por exemplo, imprimir uma mensagem dizendo que n�o
 � poss�vel dividir por zero.    

3) Agora crie uma nova exce��o que � disparada quando a divis�o do 'calcula
(int a, int b)' resulta em 0. Chame essa exce��o de 
ExcecaoDivisaoResultadoZero e fa�a com o que m�todo 'calcula' lance (throw) 
essa exce��o quando o resultado da divis�o por 'a' por 'b' for igual a zero.
 Lembre-se que como voc� criou uma exce��o nova, � interessante voc� 
 sobrescrever a mensagem da sua nova exce��o para uma mensagem mais apropriada.

4) Para finalizar, crie um m�todo CalculaDivisaoArrays que chama o 
m�todo calcula para cada posi��o correspondente dos arrays arrayA e arrayB. 
Ou seja, ele divide arrayA[0] por arrayB[0], arrayA[1] por arrayB[1] 
at� a �ltima posi��o do array.
Repare que nesse m�todo, voc� vai ter que tratar a exce��o que 
pode ser lan�ada no item 3. Logo, use aqui o bloco try-catch-finally. 
No caso do finally, voc� deve usar para imprimir os valores (a e b) que 
foram usados na divis�o
*/
}

