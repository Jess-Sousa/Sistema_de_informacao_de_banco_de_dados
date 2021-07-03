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

   public  void  imprimeSucessorEAntecessor ( int  posição ) {
     
   if (posição <  0  || posição >  9 ) {
   System.out.println( " Essa posição não se enquadra nesse array " );
   return ;
   }
   }
 
   }

