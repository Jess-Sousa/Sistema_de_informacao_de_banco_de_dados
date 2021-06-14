package TrabalhoPratico3;


public class teste
{
       public int tamanholadosquadrado;

public static void main (String [] args) {

    Retangulo  retangulo = new Retangulo(10,5);
    
    System.out.println("Perímetro do retângulo: " + retangulo.calculoPerimetro());
    System.out.println("Área do retângulo: " + retangulo.calculoArea());
    
    
    Quadrado quadrado = new Quadrado (5,5);
    quadrado.setlado(5);
    quadrado.setaltura(5);
    quadrado.setbase(5);
    
    System.out.println("Tamanho do lado no quadrado: " +quadrado.Tamanholados());
    System.out.println("Perímetro do quadrado: " +quadrado.calculoPerimetro());
    System.out.println("Área do quadrado: " +quadrado.calculoArea());
    
    Circulo circulo = new Circulo();
    System.out.println("Tamanho do raio no circulo: " + circulo.calculoTamanholados());
    System.out.println("Perímetro do círculo: " + circulo.calculoPerimetro());
    System.out.println("Área do círculo: " + circulo.calculoArea());

}
}
