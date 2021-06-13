package TrabalhoPratico3;


public class teste
{
       public int tamanholadosquadrado;

public static void main (String [] args) {

    Retangulo  f1 = new Retangulo(3,5);
    f1.setbase(3);
    f1.setaltura(5);
    System.out.println("Perímetro do retângulo: " + f1.calculoPerimetro());
    System.out.println("Área do retângulo: " + f1.calculoArea());
    
    
    Quadrado f2 = new Quadrado (5,5);
    f2.setlado(5);
    System.out.println("Perímetro do quadrado: " + f2.calculoPerimetro());
    System.out.println("Área do quadrado: " + f2.calculoArea());
    //System.out.println("Soma dos lados do quadrado: " + f2.setlado(5) *(4));
    
    Circulo f3 = new Circulo(3);
    System.out.println("Perímetro do círculo: " + f3.calculoPerimetro());
    System.out.println("Área do círculo: " + f3.calculoArea());
    //System.out.println("Soma dos raios do circulo: " + calculoRaios());

}
}
