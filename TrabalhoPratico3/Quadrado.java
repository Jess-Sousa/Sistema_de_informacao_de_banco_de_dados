package TrabalhoPratico3;


public class  Quadrado extends Quadrilateros implements FormasGeometricas
{
    private int lado;
    private int altura;
    private int base;
    private double calculoLados;
    private int tamanholadosquadrado;

    
public Quadrado (int lado) {
        this.lado= lado;
    }
    
public void setlado (int lado){
        this.lado = lado;}
    
public int getLado() {
        return lado;
    }
    
public Quadrado (int altura, int base) {
        this.altura = altura;
        this.base = base;
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
        return altura * base;}

public void setTamanholadosquadrado (int tamanholadosquadrado) {
         this.tamanholadosquadrado = tamanholadosquadrado;
         }

public int getTamanholadosquadrado () {
        return tamanholadosquadrado = base + base+ altura +altura;
        }
        //ta faltando calcular a soma dos lados
}

/*3) Crie Classes para representar retângulos e quadrados. 
A classe Retângulo deve receber o tamanho da base e da altura 
no construtor da classe. 
Já a classe Quadrado deve receber apenas o tamanho do lado;*/
