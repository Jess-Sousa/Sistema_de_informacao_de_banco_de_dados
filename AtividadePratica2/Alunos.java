package AtividadePratica2;
import java.util.Scanner;
import java.util.ArrayList;


public class Alunos
{
    private String nome;
    private int id;
    private double media;
    protected double nota1;
    protected double nota2;
    protected boolean status;
    
    /*public Alunos ( String aluno,int i, double nt1, double nt2,double m,
    boolean s) 
    {
    nome = aluno;
    id = i;
    nota1 = nt1;
    nota2 = nt2;
    media = m;
    status = s;
} // fim do construtor*/
    
public static void main(String args[]){
    
    Scanner scanner = new Scanner(System.in);
    ArrayList<Alunos> alunos = new ArrayList();
    
        System.out.println ("[0] Aluno0");
        System.out.println ("[1] Aluno1");
        System.out.println ("[2] Aluno2");
        System.out.println ("[3] Aluno3");
        System.out.println ("[4] Aluno4");
        System.out.println ("[5] Aluno5");
        System.out.println ("[6] Aluno6");
        System.out.println ("[7] Aluno7");
        System.out.println ("[8] Aluno8");
        System.out.println ("[9] Aluno9");
        String opcao = scanner.nextLine();
        
        switch (opcao) {
            case "1": {
                System.out.println("Gabriel: ");
                break;
        }
            case "2": {
                System.out.println("Ruth: ");

                break;
        }
            case "3":{
                System.out.println("Lucas: ");

                break;   
        }
            case "4":{
                System.out.println("Ester: ");

                break;
        }
            case "5":{
                System.out.println("Caleb: ");

                break;
        }
            case "6":{
                System.out.println("Yuna: ");

                break;
        }
            case "7":{
                System.out.println("Pedro: ");

                break;    
        }
            case "8":{
                System.out.println("Solar: ");

                break;
        }
            case "9":{
                System.out.println("Jackie: ");

                break;
        }
            }
            }
        }
            
        
 
/*public void alterarNomeeId (){
    aluno0 = new Aluno ("Gabriel", 123);
    _type_ aluno1= new Aluno ("Ruth", 321);
    _type_ aluno2= new Aluno ("Lucas", 456);
    aluno3 = new Aluno ("Ester", 654);
    aluno4 = new Aluno ("Pedro", 789);
    aluno5 = new Aluno ("Yuna", 987);
    aluno6 = new Aluno ("Jackie", 741);
    aluno7 = new Aluno ("Solar", 852);
    aluno8 = new Aluno ("Caleb", 963);
    aluno9 = new Aluno ("Hara", 367);
    }
}
    /*
public void imprimeNome (){
    

}
    public static void main(String args[])
    {
    Aluno aluno0,aluno1, aluno2, aluno3,aluno4,aluno5,aluno6,aluno7,aluno8,aluno9;
    aluno0= new Aluno ();
    aluno1 = new Aluno ();
    aluno2 = new Aluno ();
    aluno3 = new Aluno ();
    aluno4 = new Aluno ();
    aluno5 = new Aluno ();
    aluno6 = new Aluno ();
    aluno7 = new Aluno ();
    aluno8 = new Aluno ();
    aluno9 = new Aluno ();
    aluno0.imprimeNome();
    aluno1.imprimeId();
    
    System.out.println ("nome do aluno: "+ "id do aluno: " );

}

public String getNome(){
    return nome;
}

public void setNome(String aluno) {
    this.nome = aluno; 
    
}

public double getNota1(){
    return nota1;
    
}

public void setNota1 (double Nota1){
    this.nota1 = Nota1;
}

public double getNota2(){
    return nota2;
    
}

public void setNota2(double Nota2){
    this.nota2 = Nota2;
}

public double getMedia(){
    return media;
    
}

public void setMedia(double Media){
    this.media = Media;
}

public boolean getStatus(){
    return status;
}

public void setStatus(boolean Status) {
    this.status = Status; 
    
}

 private double calcularMedia(){
    media = (nota1 + nota2)/2;
    if (media >= 7.0);
        System.out.println("Status: true");
    if (media <= 6.99);
    System.out.println("Status: false");

    return media;
}
}
 /* Alterar nome
  * alterar id
  * alterar nota1 e nota2
  * chamar o metodo para imprimir o valor da media
  * chamar o metodo para imprimir se o aluno passou ou nao
  */