package AtividadePratica2;


    public class Aluno
{
    private int RegistroAluno;
    private String Nome;
    private int Id;
    private double Media;
    protected double Nota1;
    protected double Nota2;
    protected String Status;
    
    public void setStringNome (char ra) {
        this.RegistroAluno = ra;
        
    }
    
    public int getRegistroAluno () {
        return RegistroAluno;
    }
    
    public Aluno (int ra ,String n,int i, double nt1, double nt2,double m,
    String s) 
    {
    RegistroAluno = ra;
    Nome = n;
    Id = i;
    Nota1 = nt1;
    Nota2 = nt2;
    Media = m;
    Status = s;
 } // fim do construtor
    
 public Aluno () {
    RegistroAluno = 0000 ;
    Nome = "alunox";
    Id = 000;
    Nota1 = 0;
    Nota2 = 0;
    Media = (Nota1 + Nota2)/2;
} // fim do construtor
    
public String getNome(){
    return Nome;
}

public void setNome(String Nome) {
    this.Nome = Nome; 
    
}

public double getNota1(){
    return Nota1;
    
}

public void setNota1 (double Nota1){
    this.Nota1 = Nota1;
}

public double getNota2(){
    return Nota2;
    
}

public void setNota2(double Nota2){
    this.Nota2 = Nota2;
}

public double getMedia(){
    return Media;
    
}

public void setMedia(double Media){
    this.Media = Media;
}

public String getStatus(){
    return Status;
}

public void setStatus(String Status) {
    this.Status = Status; 
    
}

 private double calcularMedia(){
    Media = (Nota1 + Nota2)/2;
    if (Media >= 7.0);
        System.out.println("Status: true");
    if (Media <= 6.99);
    System.out.println("Status: false");

    return Media;
}

public void imprimeNome() {
    Aluno [] alunox = new Aluno [00];
    Aluno [] aluno0 = new Aluno [0]; 
    Aluno [] aluno1 = new Aluno [1]; 
    Aluno [] aluno2 = new Aluno [2]; 
    Aluno [] aluno3 = new Aluno [3]; 
    Aluno [] aluno4 = new Aluno [4]; 
    Aluno [] aluno5 = new Aluno [5]; 
    Aluno [] aluno6 = new Aluno [6]; 
    Aluno [] aluno7 = new Aluno [7]; 
    Aluno [] aluno8 = new Aluno [8]; 
    Aluno [] aluno9 = new Aluno [9]; 

    System.out.println();
} 

    public void alterarNome() {
    /*Aluno aluno0, aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7,
    aluno8, aluno9;  
    
 ProcessBuilder.Redirect.Type aluno0= new Aluno ("Gabriel",123);
 ProcessBuilder.Redirect.Type aluno1= new Aluno ("Ruth",456);
 ProcessBuilder.Redirect.Type aluno2= new Aluno ("Lucas",111);
 ProcessBuilder.Redirect.Type aluno3= new Aluno ("Ester",321);
 ProcessBuilder.Redirect.Type aluno4= new Aluno ("Pedro",654);
 ProcessBuilder.Redirect.Type aluno5= new Aluno ("Yuna",789);
 ProcessBuilder.Redirect.Type aluno6= new Aluno ("Caleb",987);
 ProcessBuilder.Redirect.Type aluno7= new Aluno ("Sonnar",147);
 ProcessBuilder.Redirect.Type aluno8= new Aluno ("Jackie",741);
 ProcessBuilder.Redirect.Type aluno9= new Aluno ("Hara",258);
 aluno0.imprimeNome();
 aluno0.imprimeId();
 aluno1.imprimeNome();
 aluno1.imprimeId();
    */
    System.out.println();
    
}
 
    public void imprimeId() {
    System.out.println();
 }
 
 public void alterarId() {
    System.out.println();
 }
 
  public static void main (String[ ] args){

    /*Aluno aluno0 = new Aluno();
    aluno0.alterarNome();
    aluno0.alterarId();
    Aluno.nota1 = 6;
    Aluno.nota2 = 7;
    
    System.out.println("A média do aluno é:" + aluno0.retornaMedia());
    aluno0.passou(false);
    */
    }
}
  




/* METODOS PUBLICOS
            *1 imprime e alterar nome
            *2 imprime e altera id
            *3 retornoMedia  com o valor da variável média
            *4 passou que retorna true se a média é maior que 7.0, e false 
            *caso o contrário.
            *5 método privado cauculamedia
            */

        /*int nota1 = alunos[0][0];
    
          *int nota2 = alunos[][];
          *int nota1 = alunos[][];
          *int nota2 = alunos[][];
          *int nota1 = alunos[][];
          *int nota2 = alunos[][];
          *int nota1 = alunos[][];
          *int nota2 = alunos[][];
          */