package TrabalhoPratico3;

public class Circulo implements FormasGeometricas {
    public static float PI = 3.1416f;
    
    private int raio;
    
    public Circulo () {
    raio = 1;
    }
    
    public Circulo(int raio) {
        this.raio = raio;
    }
    
    public int calculoRaio() {
        return raio;
    }
    
    public double calculoPerimetro() {
        return 2 * Circulo.PI * raio;
    }
    
    public double calculoArea() {
        return Circulo.PI * raio * raio;
    }
//ta faltando fazer sobrecarga e o construtor do tamanho do raio
}

/*4) Crie uma classe para representar um círculo. 
Nela, você deve aplicar sobrecarga e criar 2 construtores: 
um que não recebe nada (e atribui 1 ao raio) e outro que recebe o tamanho do raio.*/
 