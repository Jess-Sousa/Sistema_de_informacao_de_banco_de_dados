package TrabalhoPratico3;

public abstract class  Quadrilateros {
    private int altura;
    private int base;
    private int lado;
    private double calculoPerimetro;
    private double calculoLados;
    private int tamanholadosquadrado;
    private int tamanholadosretangulo;
    
    public Quadrilateros () {
    
    }

    public int getTamanholadosquadrado () {
        return tamanholadosquadrado = base + base+ altura +altura;
        }
        
    public int getTamanholadosretangulo () {
        return tamanholadosretangulo = base + base + altura +altura;
        }
    
    public void setTamanholadosquadrado (int tamanholadosquadrado) {
         this.tamanholadosquadrado = tamanholadosquadrado;
         }
         
    public void setTamanholadosretangulo (int tamanholadosretangulo) {
         this.tamanholadosretangulo = tamanholadosretangulo;
         }
         
    public Quadrilateros (int altura, int base) {
        this.altura = altura;
        this.base = base;
        }
    
    public void setAltura (int altura){
    this.altura = altura;
        }
    
    public void setbase (int base){
    this.base = base;
        }
        
    public int getAltura() {
        return altura;
        }
    
    public int getBase() {
        return base;
        }   
       
    public double calculoLados() {
        return lado + lado + lado + lado;
        }
        
    public double calculoPerimetro() {
        return 2 * (altura + base);
        }
    
}

/*2) Crie uma classe abstrata para representar quadriláteros. 
Seu construtor deve receber os tamanhos dos 4 lados. Além disso, 
já implemente nesta classe o método de 'cálculo do perímetro*/