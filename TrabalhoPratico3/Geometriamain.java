package TrabalhoPratico3;


public class Geometriamain
{
   
public static void main (String [] args) {

    FormasGeometricas fg = new Retangulo(6, 10);

    System.out.println("Perímetro do retângulo: " + fg.calculoPerimetro());
    System.out.println("Área do retângulo: " + fg.calculoArea());
    
    
    fg = new Quadrado (15,15);
    System.out.println("Perímetro do quadrado: " + fg.calculoPerimetro());
    System.out.println("Área do quadrado: " + fg.calculoArea());
    System.out.println("Soma dos lados do quadrado: " + fg.calculoLado());
    
    fg = new Circulo(8);
    System.out.println("Perímetro do círculo: " + fg.calculoPerimetro());
    System.out.println("Área do círculo: " + fg.calculoArea());
}
}
