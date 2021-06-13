public interface Geometria {
    public float getPerimetro();
    public float getArea();
}

public class Retangulo implements Geometria {
    private int altura;
    private int largura;

    public Retangulo(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }
    
    public int getAltura() {
        return altura;
    }
    
    public int getLargura() {
        return largura;
    }
    
    public float getPerimetro() {
        return 2 * (altura + largura);
    }
    
    public float getArea() {
        return altura * largura;
    }
}

public class Circulo implements Geometria {
    public static float PI = 3.1416f;
    
    private int raio;
    
    public Circulo(int raio) {
        this.raio = raio;
    }
    
    public int getRaio() {
        return raio;
    }
    
    public float getPerimetro() {
        return 2 * Circulo.PI * raio;
    }
    
    public float getArea() {
        return Circulo.PI * raio * raio;
    }
}

Geometria g = new Retangulo(6, 10);

System.out.println("Perímetro do retângulo: " + g.getPerimetro());
System.out.println("Área do retângulo: " + g.getArea());

