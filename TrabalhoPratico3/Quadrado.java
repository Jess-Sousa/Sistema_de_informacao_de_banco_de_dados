package TrabalhoPratico3;


public class  Quadrado extends Quadrilateros implements FormasGeometricas
{
    private int lado;
    private double calculoTamanholados;
    private int altura;
    private int base;

public Quadrado (int lado,double calculoTamanholados){
}  
    
public void setlado (int lado){
        this.lado = lado;
        }
    
public int getLado() {
        return lado;
        }

public void setaltura (int altura){
    this.altura = altura;
    }
    
public int getaltura() {
        return altura;
    }
    
public void setbase (int base){
    this.base = base;
    }
    
public int getbase() {
        return base;
    }
    
public double Tamanholados() {
        return lado;
        }
       
public double calculoPerimetro() {
        return 2 * (altura + base);
       }
       
public double calculoArea() {
        return altura * base;
    }
}

/*3) Crie Classes para representar retângulos e quadrados. 
A classe Retângulo deve receber o tamanho da base e da altura 
no construtor da classe. 
Já a classe Quadrado deve receber apenas o tamanho do lado;*/
