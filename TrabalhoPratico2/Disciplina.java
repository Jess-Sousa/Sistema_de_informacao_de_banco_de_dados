package TrabalhoPratico2;

public class Disciplina
{
     Aluno [] aluno =   new Aluno [10];
     
    public  void  adicionarAluno ( Aluno  alunoNovo , int  posicao ) {

    aluno [posicao] = alunoNovo;
    }
    
    public double getMediaNota1() {
         double somaDasNotas = 0;
         int qteAlunos = 0;
   
                for(int i = 0; i< 10; i++) {
                     if(aluno[i] != null) 
                { somaDasNotas += aluno[i].nota1;
                 qteAlunos++;}
                }
         return somaDasNotas/qteAlunos;
        }
   
        public double getMediaNota2() {
         double somaDasNotas = 0;
         int qteAlunos = 0;
   
           for(int i = 0; i< 10; i++) {
          if(aluno[i] != null) { 
           somaDasNotas += aluno[i].nota2;
           qteAlunos++;}
          }
         return somaDasNotas/qteAlunos;
        }
        
   
    public void  imprimeSucessorEAntecessor ( int  posicao ) {
     
         if(posicao < 0){
         System.out.print("Posição inválida, pois não se enquadra dentro do array");
         return;
         }
         else if(posicao >9){
         System.out.print("Posição inválida,  pois não se enquadra dentro do array");
         return;
        }
        
    if(posicao -1 < 0) {
    System.out.println("Não existe antecessor acima");
    }else if (aluno[posicao-1] == null) {
    System.out.println("posição inexistente");
    }else {
    System.out.println("Antecessor da posição: "+aluno[posicao-1].getNome());
    }
        
    if(posicao+1 > 9) {
    System.out.println("Não existe sucessor abaixo");
    }else if (aluno[posicao+1] == null) {
    System.out.println("posição inexistente");
    }else {
    System.out.println("Sucessor da posição: "+aluno[posicao+1].getNome());
    }        
       } 
    }

        
   
