package Fabrica;
import javafx.scene.Node;



public class Aluno
{
    private String Nome;
    private int id;
    private double media;
    protected double nota1;
    protected double nota2;
    
    
    public Aluno()
    {
        
       String Nome= aluno0;
       float aluno0 = 1234;
       
       String Nome= aluno1;
       float aluno1 = 2121;
              
       String Nome =  aluno2;
       float aluno2 = 4321;
       
       String Nome =  aluno3;
       float aluno3 = 1212;
       
       String Nome = aluno4;
       float aluno4 = 2211;
       
       System.out.println (aluno0 = "Gabriel");
       System.out.println (aluno1 == "Ruth"); 
       System.out.println (aluno2 == "Lucas");
       System.out.println (aluno3 == "Ester");
       System.out.println (aluno4 == "Pedro");
       
    }
    
    public void RetornoMediaDosAlunosArray() { int[][] aluno0 = new int [0][2];
         int[][] aluno1 = new int [1][2]; int[][] aluno2 = new int [2][2];
         ; int[][] aluno3= new int [3][2];int[][] aluno4 = new int [4][2];
       
        aluno0 [0][0] = 4;
        aluno0 [0][1] = 7;
        
        aluno1 [1][0] = 6;
        aluno1 [1][1] = 7;
        
        aluno2 [2][0] = 8;
        aluno2 [2][1] = 9;
        
        aluno3 [3][0] = 10;
        aluno3 [3][1] = 10;
        
        aluno4 [4][0] = 7;
        aluno4 [4][1] = 8;
        
    }
        
    public void String (int Nomedosalunos){
        String[] Nomedosalunos; Aluno0 = "Gabriel"; Aluno1 = "Ruth";
        Aluno2 = "Lucas"; Aluno3 = "Ester"; Aluno4 ="Pedro"; 
    }//pra saber se ele passou ou nao vou usar o For
 
   
        //começou com i=0
      { for (int i = 0; i < 5; i++) {
            int nota1 = alunos[i][0];
            int nota2 = alunos[0][1];
            double media = (nota1+nota2)/2;

            if (media >= 7){ 
                System.out.println("Aluno "+i+" passou");
            } else { 
                System.out.println("Aluno "+i+" não passou");
        }
         //i = i + 1 
        }
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


        
        
