package Fabrica;



public class CarroExemploaula5
{
    //Aqui declaramos as variáveis
   private String Marca;
   private int anoFab;
   private float chashi;
   private int velocimetro;
   
   public CarroExemploaula5(){
       /*esse
        * é um comentário longo
        * precisa
        */
       Marca = "Fiat";
       anoFab = 2011;
       chashi = 12345678;
   }
   
   public void acelerar(int velocidade){
       velocimetro = velocimetro+velocidade; 
       //velocimetro += velocidade
   }
   
   public int getVelocimentro(){
       return velocimetro;
   }
   
   public void freiar(){
       velocimetro--; 
   }
}
