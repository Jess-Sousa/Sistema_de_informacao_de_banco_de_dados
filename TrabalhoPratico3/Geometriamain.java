package TrabalhoPratico3;


public class Geometriamain
{
   
public static void main (String [] args) {

    FormasGeometricas fg = new Retangulo(6, 10);

    System.out.println("Per�metro do ret�ngulo: " + fg.calculoPerimetro());
    System.out.println("�rea do ret�ngulo: " + fg.calculoArea());
    
    
    fg = new Quadrado (15,15);
    System.out.println("Per�metro do quadrado: " + fg.calculoPerimetro());
    System.out.println("�rea do quadrado: " + fg.calculoArea());
    System.out.println("Soma dos lados do quadrado: " + fg.calculoLado());
    
    fg = new Circulo(8);
    System.out.println("Per�metro do c�rculo: " + fg.calculoPerimetro());
    System.out.println("�rea do c�rculo: " + fg.calculoArea());
}
}
