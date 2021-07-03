package TrabalhoPratico4;
import java.util.Arrays;

public class Grupos
{
    int [] ArrayA = new int[10];
    int [] ArrayB = new int[10];
    
    public int setArrayA (int posicao, int valor ){
    return ArrayA[posicao]=valor;
    }
    
    public int getArrayA(int posicao){
    return ArrayA[posicao];
    }
    
    public int setArrayB (int posicao, int valor ){
    return ArrayB[posicao]=valor;
    }
    
    public int getArrayB(int posicao){
    return ArrayB[posicao];
    }
    
    public void setArrayANaPosicao(int valor, int posicao){
    this.ArrayA[posicao]= valor; 
    }
    
    public void setArrayBNaPosicao(int valor, int posicao){
    this.ArrayB[posicao]= valor; 
    }
    
    public void setValorPosicaoArrayA(int posicao, int valor){
    if(posicao < 0){
        System.out.print("Posição inválida, pois é menor que 0 dentro do Array");
        return;
    }
    else if(posicao>9){
        System.out.print("Posição inválida, pois é maior que 9 dentro do Array");
        return;
    }
    this.ArrayA[posicao]=valor;
    }
    
    public void setValorPosicaoBrrayA(int posicao, int valor){
    if(posicao < 0){
        System.out.print("Posição inválida, pois é menor que 0 dentro do Array");
        return;
    }
    else if(posicao>9){
        System.out.print("Posição inválida, pois é maior que 9 dentro do Array");
        return;
    }
    this.ArrayB[posicao]=valor;
    }
    
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
  

    
    
    //catch(ArrayIndexOutOfBoundsException e){
        //System.out.println("Posição do Array Inválida");
        // catch (Throwable e){
        // System.out.println(Ocorreu um erro); e
  
   /* 1) Em uma classe, defina como atributos os 2 arrays com 10 posições e 
    também métodos para recuperar (getArrayA() e getArrayB) e alterar esses 
    arrays (setArrayA() e setArrayB). Crie também 2 métodos 
    (setArraANaPosicao e setArrayBNaPosicao), que recebem como parâmetro 
    um valor int e uma posição, e colocam esse valor na respectiva posição 
    do array. Nesses métodos, você deve implementar a verificação da entrada 
    (posição)
    para garantir que é válido para o array
    */

    

 //public static void main (String [] args){