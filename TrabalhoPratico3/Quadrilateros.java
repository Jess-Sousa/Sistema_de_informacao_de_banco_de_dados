package TrabalhoPratico3;

public abstract class  Quadrilateros {
    private int calculoPerimetro;
    private int calculoLados;
    private int tamanholadosquadrado;
    private int tamanholadosretangulo;
    
    public Quadrilateros () {
    
    }
    
    public Quadrilateros (int tamanholadosquadrado, int tamanholadosretangulos)
    {
    tamanholadosquadrado = tq;
    tamanholadosretangulo= tr;
    
    }
    
    public int getId () {
        return id;
        }
    
    public void setId ( String id) {
         this.id = id; 
         }

    public static void main (String [] args) {

    FormasGeometricas fg = new Retangulo(6, 10);

    System.out.println("Perímetro do retângulo: " + fg.calculoPerimetro());
    System.out.println("Área do retângulo: " + fg.calculoArea());
    
    
    fg = new Quadrado (4);
    System.out.println("Perímetro do quadrado: " + fg.calculoPerimetro());
    System.out.println("Área do quadrado: " + fg.calculoArea());
    System.out.println("Soma dos lados do quadrado: " + fg.calculoLados());

}
}

/*2) Crie uma classe abstrata para representar quadriláteros. 
Seu construtor deve receber os tamanhos dos 4 lados. Além disso, 
já implemente nesta classe o método de 'cálculo do perímetro*/