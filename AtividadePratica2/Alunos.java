package AtividadePratica2;
import java.util.*;
import java.util.Objects;

public class Alunos {
    
            private String nome;
	    private String id;
	    private double media;
	    protected double nota1;
	    protected double nota2;
	    protected boolean status;
	    ArrayList <Alunos>ListaAluno;
	    
	    public Alunos (){
	        ListaAluno = new ArrayList();
            }
	    
 
	    public Alunos ( String nome,String id, double nota1, double nota2,
	    		double media, boolean status) {
	        this.nome=nome;
	        this.id=id;
	        this.nota1=nota1;
	        this.nota2 = nota2;
	        this.media = media;
	        this.status = status;
	        ListaAluno = new ArrayList();
	        }// fim do construtor*/ 

	        public void setNome (String nome) {
	        this.nome = nome;
	        }

	    public String getNome () {
	        return nome;
	        }

	    public void setId ( String id) {
	        this.id = id; 
	        }

	    public String getId () {
	        return id;
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

	    @SuppressWarnings("unused")
		private double calcularMedia(){
	        media = (nota1 + nota2)/2;
	        if (media >= 7.0);
	        System.out.println("Status: true");
	        if (media <= 6.99);
	        System.out.println("Status: false");

	        return media;
	       }
	    
	      public void setListaAluno(Alunos alunos){
	           //return ListaAluno;
	           
	       }
	       
	      public void getListaAluno(ArrayList<Alunos> ListaAluno){
	           this.ListaAluno = ListaAluno;
	           
	       }
	      public <Aluno> void addAluno (Aluno c1, Alunos c2, Alunos c3,Alunos c4, 
	    Alunos c5, Alunos c6, Alunos c7, Alunos c8, Alunos c9, Alunos c10){
	           ((Alunos) c1).setListaAluno(this) ;
	           ListaAluno.add((Alunos) c1);
	           ListaAluno.add((Alunos) c2);  
	           ListaAluno.add((Alunos) c3);  
	           ListaAluno.add((Alunos) c4);  
	           ListaAluno.add((Alunos) c5);  
	           ListaAluno.add((Alunos) c6);  
	           ListaAluno.add((Alunos) c7);  
	           ListaAluno.add((Alunos) c8);  
	           ListaAluno.add((Alunos) c9);  
	           ListaAluno.add((Alunos) c10); 
	       }
	           @SuppressWarnings("unused")
		   public void LoadTableAlunos(){
	   	   String[] Alunos = {"nome", "id" };
	   	   String[] Alunosc1 = {"Gabriel", "123" };
	   	   String[] Alunosc2 = {"Ruth", "321" };
	   	   String[] Alunosc3 = {"Lucas", "456" };
	   	   String[] Alunosc4 = {"Ester", "654" };
	   	   String[] Alunosc5 = {"Pedro", "789" };
	   	   String[] Alunosc6 = {"Yuna", "987" };
	   	   String[] Alunosc7 = {"Caleb", "741" };
	   	   String[] Alunosc8 = {"Solar", "852" };
	   	   String[] Alunosc9 = {"Jackie", "963" };
	   	   String[] Alunosc10 = {"Hara", "951" };

	      }
     }
	   
	   
	   

          /*public Alunos (Object string, int i) {
	    // TODO Auto-generated constructor stub
    	    
	       }
    	    
	    @SuppressWarnings({ "unused"})
		public static void main(String [] args){
	    ArrayList<Aluno> ALUNO1= new ArrayList(); 
	    aluno0 = new Aluno ("Gabriel",123);
            Aluno aluno1 = new Aluno ("Ruth",   321);
            Aluno aluno2 = new Aluno ("Lucas",  456);
            Aluno aluno3 = new Aluno ("Ester",  654);
            Aluno aluno4 = new Aluno ("Pedro",  789);
            Aluno aluno5 = new Aluno ("Yuna",  987 );
            Aluno aluno6 = new Aluno ("Jackie", 741);
            Aluno aluno7 = new Aluno ("Solar",  852);
            Aluno aluno8 = new Aluno ("Caleb", 963 );
            Aluno aluno9 = new Aluno ("Hara",  951 );
	     
           
	    for (Aluno <ALUNO1> extracted)
	    {
			return new ArrayList<Aluno>();*/
		

		