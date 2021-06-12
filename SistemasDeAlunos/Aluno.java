package SistemasDeAlunos;
import java.util.ArrayList;

public class Aluno {
    String nome;
    String id;
    String situacao = "não passou";
    float total = 0;
    ArrayList<Float> notasAluno = new ArrayList<>();
    public Aluno () {
    
}
    public Aluno ( String nome, String id){
    setNome(nome);
    setId(id);
    }
    void insereNotas (float nota) {
        notasAluno.add(nota);
    }
    public String getNome () {
        return nome;
        }
    
    public void setNome (String nome) {
         this.nome = nome;
         }
    
    public String getId () {
        return id;
        }
    
    public void setId ( String id) {
         this.id = id; 
         }

    void listar() {
        System.out.println("\nNome: " + this.nome);
        System.out.println("\nId: " + this.id);
        
        for (int i = 0; i < notasAluno.size(); i++) {
            System.out.println("Nota " +(i) + ": " + this.notasAluno.get(i));

        }
    }
        void mostraSituacao () {
            System.out.println("\nNome: " + this.nome);
            System.out.println("\nTotal: " + this.total);
            System.out.println("\nSituação: " + this.situacao);
        }
        
        void calculaNotas () {
            for ( float notaDaLista: notasAluno) {
                total = total + notaDaLista;
            }
            if     (total >= 7) {
                this.situacao = "passou";
            } else {
                this.situacao = "não passou";
            }
            }
        
    
    public ArrayList<Float> getNotasAluno() {
        return notasAluno;
        
    }
}
