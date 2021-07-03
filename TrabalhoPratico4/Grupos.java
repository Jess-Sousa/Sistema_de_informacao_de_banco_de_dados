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
    
    public void setArrayANaPosicao(int posicao, int valor){
    this.ArrayA[posicao]= valor; 
 }
    
    public void setArrayBNaPosicao(int posicao, int valor){
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
    
    public static void main  (String [] args)  throws Exception {
    
    int[] a ={12,15,16,18,20,22,24,26,28,0};
    int[] b = {2,3,0,2,5,5,3,0,2,30};
    
    for (int i=0; i<a.length; i++){
        try{
            
        if (a[i] == 0){
        //nova exception
        throw new Exception("ExcecaoDivisaoResultadoZero");
        }
        
        System.out.println(a[i] + "/" + b[i] + "="+ (a[i]/b[i]));
        }
        
        catch(ArithmeticException e){
        System.out.println("Erro ao dividir por zero");
        } 
        
         catch(Exception e){
        System.out.println("Resultado Nulo devido ao resultado ser 0");
        }
        
        finally {
         System.out.println("valores de a e b são esses respectivamente: ");
        }
 }
}
}
