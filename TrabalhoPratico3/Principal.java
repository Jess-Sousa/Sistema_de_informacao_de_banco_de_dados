package TrabalhoPratico3;


public class Principal
{

public static void main (String [] args) {

    Retangulo  retangulo = new Retangulo(10,5);
    retangulo.setaltura(10);
    retangulo.setbase(5);
    
    System.out.println("Tamanho da altura no ret�ngulo: " +retangulo.Tamanhoaltura());
    System.out.println("Tamanho da base no ret�ngulo: " +retangulo.Tamanhobase());
    System.out.println("Per�metro do ret�ngulo: " + retangulo.calculoPerimetro());
    System.out.println("�rea do ret�ngulo: " + retangulo.calculoArea());
    
    
    Quadrado quadrado = new Quadrado (5,5);
    quadrado.setlado(5);
    quadrado.setaltura(5);
    quadrado.setbase(5);
    
    System.out.println("Tamanho do lado no quadrado: " +quadrado.Tamanholados());
    System.out.println("Per�metro do quadrado: " +quadrado.calculoPerimetro());
    System.out.println("�rea do quadrado: " +quadrado.calculoArea());
    
    Circulo circulo = new Circulo();
    System.out.println("Tamanho do raio no circulo: " + circulo.Tamanhoraio());
    System.out.println("Per�metro do c�rculo: " + circulo.calculoPerimetro());
    System.out.println("�rea do c�rculo: " + circulo.calculoArea());

}
}
