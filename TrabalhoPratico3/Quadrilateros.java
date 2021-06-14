package TrabalhoPratico3;

public abstract class  Quadrilateros {
    private int altura;
    private int base;
    private int lado;
    private double calculoPerimetro;
    private double calculoTamanholados;
      
    public double calculoTamanholados() {
        return lado * 4;
        }
        
    public double calculoPerimetro() {
        return 2 * (altura + base);
        }
}

/*2) Crie uma classe abstrata para representar quadriláteros. 
Seu construtor deve receber os tamanhos dos 4 lados. Além disso, 
já implemente nesta classe o método de 'cálculo do perímetro*/