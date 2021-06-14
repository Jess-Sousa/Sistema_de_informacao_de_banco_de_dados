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

/*2) Crie uma classe abstrata para representar quadril�teros. 
Seu construtor deve receber os tamanhos dos 4 lados. Al�m disso, 
j� implemente nesta classe o m�todo de 'c�lculo do per�metro*/