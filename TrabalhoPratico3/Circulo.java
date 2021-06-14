package TrabalhoPratico3;

public class Circulo implements FormasGeometricas {
    public static float PI = 3.14f;
    
    private int raio;
    
    public Circulo () {
    raio = 1;
    }
    
    public double calculoTamanholados() {
        return raio;
    }
    
    public double calculoPerimetro() {
        return 2 * Circulo.PI * raio;
    }
    
    public double calculoArea() {
        return Circulo.PI * raio * raio;
    }
//ta faltando fazer sobrecarga 
}

/*4) Crie uma classe para representar um círculo. 
Nela, você deve aplicar sobrecarga e criar 2 construtores: 
um que não recebe nada (e atribui 1 ao raio) e outro que recebe o tamanho do raio.*/
 