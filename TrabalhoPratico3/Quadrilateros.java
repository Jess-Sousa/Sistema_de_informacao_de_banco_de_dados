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

    System.out.println("Per�metro do ret�ngulo: " + fg.calculoPerimetro());
    System.out.println("�rea do ret�ngulo: " + fg.calculoArea());
    
    
    fg = new Quadrado (4);
    System.out.println("Per�metro do quadrado: " + fg.calculoPerimetro());
    System.out.println("�rea do quadrado: " + fg.calculoArea());
    System.out.println("Soma dos lados do quadrado: " + fg.calculoLados());

}
}

/*2) Crie uma classe abstrata para representar quadril�teros. 
Seu construtor deve receber os tamanhos dos 4 lados. Al�m disso, 
j� implemente nesta classe o m�todo de 'c�lculo do per�metro*/