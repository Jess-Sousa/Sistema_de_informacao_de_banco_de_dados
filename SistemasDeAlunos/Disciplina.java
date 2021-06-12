package SistemasDeAlunos;
import java.util.ArrayList;

public class Disciplina {
ArrayList<Aluno> listaDeAlunos; 

public Disciplina () {
this.listaDeAlunos = new ArrayList <>();
    
}

void inserirAluno(Aluno novoAluno) {
novoAluno.calculaNotas();
listaDeAlunos.add(novoAluno);
}
void listarAlunos() {
        System.out.println("\nLista de alunos");
        
        for(Aluno alunoNaLista: listaDeAlunos) {
            
        }
    }
void listarSituacoes() {
    System.out.println("\nSituacoes");

    for (Aluno alunoNaLista: listaDeAlunos) {
        alunoNaLista.mostraSituacao();
        
    }
}
}