package TrabalhoPratico3;


public class  Quadrado  implements FormasGeometricas
{
    private int altura;
    private int base;
    private int lado;
    private int calculoLados;
    
public Quadrado (int lado) {
        this.lado= lado;
    }
    
public int getLado() {
        return lado;
    }
    
public Quadrado (int altura, int base) {
        this.altura = altura;
        this.base = base;
    }
    
public int getAltura() {
        return altura;
    }
    
public int getBase() {
        return base;
    }
    
public float calculoPerimetro() {
        return 2 * (altura + base);
    }
    
public float calculoArea() {
        return altura * base;}

public int calculoLado() {
        return lado * 4;
        }
}

/*3) Crie Classes para representar retângulos e quadrados. 
A classe Retângulo deve receber o tamanho da base e da altura 
no construtor da classe. 
Já a classe Quadrado deve receber apenas o tamanho do lado;*/
