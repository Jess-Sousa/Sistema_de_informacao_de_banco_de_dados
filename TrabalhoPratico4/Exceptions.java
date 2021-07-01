package TrabalhoPratico4;



public class Exceptions
{
/*
 * 
 *
 Objetivo: Praticar conceitos de Exceções (throws, try-catch,
 Criar sua Própria Exceção) e Verificação de Entradas 

Problema: Um programa que pega os valores de 2 arrays (arrayA e arrayB)
 e imprime a divisão dos valores desses arrays


1) Em uma classe, defina como atributos os 2 arrays com 10 posições e 
também métodos para recuperar (getArrayA() e getArrayB) e
 alterar esses arrays (setArrayA() e setArrayB). Crie também 2 métodos 
 (setArraANaPosicao e setArrayBNaPosicao), que recebem como parâmetro um 
 valor int e uma posição, e colocam esse valor na respectiva posição do array.
 Nesses métodos, você deve implementar a verificação da entrada (posição) para
 garantir que é válido para o array

2) Implemente um método que calcula e imprime a divisão de 2 números. 
Esse método deve ter como assinatura ´'calcula (int a, int b)' . 
Nele você deve capturar e tratar a exceção do tipo ArithmeticException. 
No tratamento, você pode por exemplo, imprimir uma mensagem dizendo que não
 é possível dividir por zero.    

3) Agora crie uma nova exceção que é disparada quando a divisão do 'calcula
(int a, int b)' resulta em 0. Chame essa exceção de 
ExcecaoDivisaoResultadoZero e faça com o que método 'calcula' lance (throw) 
essa exceção quando o resultado da divisão por 'a' por 'b' for igual a zero.
 Lembre-se que como você criou uma exceção nova, é interessante você 
 sobrescrever a mensagem da sua nova exceção para uma mensagem mais apropriada.

4) Para finalizar, crie um método CalculaDivisaoArrays que chama o 
método calcula para cada posição correspondente dos arrays arrayA e arrayB. 
Ou seja, ele divide arrayA[0] por arrayB[0], arrayA[1] por arrayB[1] 
até a última posição do array.
Repare que nesse método, você vai ter que tratar a exceção que 
pode ser lançada no item 3. Logo, use aqui o bloco try-catch-finally. 
No caso do finally, você deve usar para imprimir os valores (a e b) que 
foram usados na divisão
*/
}

