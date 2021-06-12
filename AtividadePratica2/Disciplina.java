package AtividadePratica2;
import java.util.*;

public class Disciplina {
private String nome;
        private String id;
        private double media;
        protected double nota1;
        protected double nota2;
        protected boolean status;
        ArrayList <Alunos>ListaAluno;
        
public Disciplina (){
  ListaAluno = new ArrayList();
            }

public void Disciplina() {
}

public Disciplina(String disciplina,String id, double nota1, 
 double nota2,double media,boolean status) {
super();
this.nome=nome;
this.id = id;
this.nota1 = nota1;
this.nota2 = nota2;
this.media = media;
this.status = status;
ListaAluno = new ArrayList();
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
/*
 * 
 
public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public double getNota1() {
return nota1;
}

public void setNota1(double nota1) {
this.nota1 = nota1;
}

public double getNota2() {
return nota2;
}

public void setNota2(double nota2) {
this.nota2 = nota2;
}

public double getMedia() {
return media;
}

public void setMedia(double media) {
this.media = media;
}

public boolean getStatus() {
return status;
}

public void setSituacao(boolean status) {
this.status = status;
}
*/
}