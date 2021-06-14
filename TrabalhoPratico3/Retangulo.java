package TrabalhoPratico3;

public class Retangulo extends Quadrilateros implements FormasGeometricas {
    private int altura;
    private int base;
    private int Tamanhoaltura;
    private int Tamanhobase;
    
    public Retangulo(int Tamanhoaltura, int Tamanhobase) {
        this.Tamanhoaltura = Tamanhoaltura;
        this.Tamanhobase = Tamanhobase;
    }
    
    public Retangulo () {
    Tamanhoaltura = 10;
    Tamanhobase = 5;
    }
    
    public double Tamanhoaltura() {
        return altura;
    }
    
    public double Tamanhobase() {
        return base;
    }
    
    public void setaltura (int altura){
    this.altura = altura;
    }
    
    public void setbase (int base){
    this.base = base;
    }
    
    public int getaltura() {
        return altura;
    }
    
    public int getBase() {
        return base;
    }
    
    public double calculoPerimetro() {
        return 2 * (altura + base);
    }
    
    public double calculoArea() {
        return altura * base;
    }
}

/*3) Crie Classes para representar ret�ngulos e quadrados. 
A classe Ret�ngulo deve receber o tamanho da base e da altura
no construtor da classe. 
J� a classe Quadrado deve receber apenas o tamanho do lado;*/