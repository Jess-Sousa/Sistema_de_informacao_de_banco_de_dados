package TrabalhoPratico3;

public class Circulo implements FormasGeometricas {
    public static float PI = 3.14f;
    private int raio;
    private double Tamanhoraio;
    
    public Circulo(int raio, float PI){
    this.raio = raio;
    this.PI = PI;
    }
    
    public Circulo(int raio, float PI,double Tamanhoraio){
    this.raio = raio;
    this.PI = PI;
    this.Tamanhoraio = Tamanhoraio;
    }
    
    public Circulo () {
    raio = 1;
    }
    
    public double Tamanhoraio() {
        return raio;
    }
    
    public double calculoPerimetro() {
        return 2 * Circulo.PI * raio;
    }
    
    public double calculoArea() {
        return Circulo.PI * raio * raio;
    }
}

/*4) Crie uma classe para representar um círculo. 
Nela, você deve aplicar sobrecarga e criar 2 construtores: 
um que não recebe nada (e atribui 1 ao raio) e outro que recebe o tamanho do raio.*/
 