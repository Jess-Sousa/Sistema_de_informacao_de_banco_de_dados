package AtividadePratica2;
import java.util.*;

    public class Disciplina {

    Aluno [] Aluno = new Aluno[10];
    
   public void inserirAluno(Aluno novoAluno, int  posicao) {
   //novoAluno.calculaNotas();
        
   Aluno [posicao] = novoAluno;
   }
  
 // public  double  getMediaNota1 () {
   //return somaDasNotas / qteAlunos; 
   // }
    
  //public  double  getMediaNota2 () {
   //return somaDasNotas / qteAlunos; 
   // }  

   public  void  imprimeSucessorEAntecessor ( int  posi��o ) {
     
   if (posi��o <  0  || posi��o >  9 ) {
   System.out.println( " Essa posi��o n�o se enquadra nesse array " );
   return ;
   }
   }
 
   }

