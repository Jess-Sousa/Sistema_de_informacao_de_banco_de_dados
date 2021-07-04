package AtividadePratica2;
import java.util.*;

    public class Disciplina extends Aluno {

    Aluno [] Aluno = new Aluno[10];
    
   public void inserirAluno(Aluno novoAluno, int  posicao) {
   //novoAluno.calculaNotas();
        
   Aluno [posicao] = novoAluno;
   Aluno [0] = aluno1;
   Aluno [1] = aluno2;
   Aluno [2] = aluno3;
   Aluno [3] = aluno4;
   Aluno [4] = aluno5;
   Aluno [5] = aluno6;
   Aluno [6] = aluno7;
   Aluno [7] = aluno8;
   Aluno [8] = aluno9;
   Aluno [9] = aluno10;
   
   }
   
   public  double  getMediaNota1 () {
		somaDasNotas duplo =  0 ;
		// São 10 se eu adicionar 10 alunos, porém pode ter menos alunos no array
		int qteAlunos =  10 ;
		// Nota: esse formato abaixo é igual à para (int i = 0; i <10; i ++)
		
		para ( Aluno aluno : aluno) {
			if (aluno ! =  null ) { 
				somaDasNotas + = aluno[i].nota1;
				qteAlunos ++ ;
			}
		}
		return somaDasNotas / qteAlunos;
	}
	
	public  double  getMediaNota2 () {
		somaDasNotas duplo =  0 ;
		int qteAlunos =  0 ;
		para ( int i =  0 ; i <  10 ; i ++ ) 
			if {(alunos [i]! =  null )  
				somaDasNotas + = aluno[i].nota2;
				qteAlunos ++ ;
    }
		
		return somaDasNotas / qteAlunos;
   }
   
   public  void  imprimeSucessorEAntecessor ( int  posicao ) {
     
   if(posicao < 0){
        System.out.print("Posição inválida, pois não existe antecessor");
        return;
    }
    else if(posicao >9){
        System.out.print("Posição inválida, pois não existe sucessor");
        return;
    }
    
   }
 
   }

