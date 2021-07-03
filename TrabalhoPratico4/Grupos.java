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
        System.out.print("Posi��o inv�lida, pois � menor que 0 dentro do Array");
        return;
    }
    else if(posicao>9){
        System.out.print("Posi��o inv�lida, pois � maior que 9 dentro do Array");
        return;
    }
    this.ArrayA[posicao]=valor;
    }
    
    public void setValorPosicaoBrrayA(int posicao, int valor){
    if(posicao < 0){
        System.out.print("Posi��o inv�lida, pois � menor que 0 dentro do Array");
        return;
    }
    else if(posicao>9){
        System.out.print("Posi��o inv�lida, pois � maior que 9 dentro do Array");
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
        //System.out.println("Posi��o do Array Inv�lida");
        // catch (Throwable e){
        // System.out.println(Ocorreu um erro); e
  
   /* 1) Em uma classe, defina como atributos os 2 arrays com 10 posi��es e 
    tamb�m m�todos para recuperar (getArrayA() e getArrayB) e alterar esses 
    arrays (setArrayA() e setArrayB). Crie tamb�m 2 m�todos 
    (setArraANaPosicao e setArrayBNaPosicao), que recebem como par�metro 
    um valor int e uma posi��o, e colocam esse valor na respectiva posi��o 
    do array. Nesses m�todos, voc� deve implementar a verifica��o da entrada 
    (posi��o)
    para garantir que � v�lido para o array
    */

    

 //public static void main (String [] args){