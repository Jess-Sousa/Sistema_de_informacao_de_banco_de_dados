package TrabalhoPratico4;


public class PosicaonoArays extends Grupos{
    
 public static void main (String [] args){
        
    Grupos PosicaoA = new Grupos();
    PosicaoA.setArrayANaPosicao(0,12);
    PosicaoA.setArrayANaPosicao(1,14);
    PosicaoA.setArrayANaPosicao(2,16);
    PosicaoA.setArrayANaPosicao(3,18);
    PosicaoA.setArrayANaPosicao(4,20);
    PosicaoA.setArrayANaPosicao(5,22);
    PosicaoA.setArrayANaPosicao(6,24);   
    PosicaoA.setArrayANaPosicao(7,26);
    PosicaoA.setArrayANaPosicao(8,28);
    PosicaoA.setArrayANaPosicao(9,0);
  
    Grupos PosicaoB = new Grupos();
  
    PosicaoB.setArrayANaPosicao(0,2);
    PosicaoB.setArrayANaPosicao(1,3);
    PosicaoB.setArrayANaPosicao(2,0);
    PosicaoB.setArrayANaPosicao(3,2);
    PosicaoB.setArrayANaPosicao(4,5);
    PosicaoB.setArrayANaPosicao(5,5);
    PosicaoB.setArrayANaPosicao(6,3);
    PosicaoB.setArrayANaPosicao(7,0);
    PosicaoB.setArrayANaPosicao(8,2);
    PosicaoB.setArrayANaPosicao(9,30);
    }
}

/*public class Exceptions extends Grupos {
  
    private int a;
    private int b;
    
    public Exceptions (int a, int b){
    super();
    this.a = a;
    this.b = b;
    
}
@Override 
public String toString(){
return "ExcecaoDivisaoResultadoZero []";
}

/* PosicaoA/B.setArrayANaPosicao(10,0); posicao erro
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


