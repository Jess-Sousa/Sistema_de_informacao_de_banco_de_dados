package TrabalhoPratico3;

public class Retangulo implements FormasGeometricas {
    private int altura;
    private int base;

    public Retangulo(int altura, int base) {
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
        return altura * base;
    }
}

/*3) Crie Classes para representar retângulos e quadrados. 
A classe Retângulo deve receber o tamanho da base e da altura
no construtor da classe. 
Já a classe Quadrado deve receber apenas o tamanho do lado;*/