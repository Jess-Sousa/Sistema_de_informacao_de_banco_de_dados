package SistemasDeAlunos;
import java.util.Scanner;

public class main {

    public static void main (String [] args) {
        int opc, qntNotas;
        float nota = 0;
        String nome, id;
        Scanner teclado;
        Aluno novoAluno = new Aluno();
        Disciplina novaDisciplina = new Disciplina ();
        
        //construindo o teclado
        teclado = new Scanner (System.in);
        
        do { 
            System.out.println("\n------------------");
            System.out.println("        MENU");
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Inserir aluno");
            System.out.println("2 - Listar de Aluno");
            System.out.println("3 - Situações");
            System.out.println("0 - Sair");
        
            opc = teclado.nextInt();
            teclado.nextLine();
        
            switch(opc){
    
               case 1:
                   System.out.println("\nNome: ");
                   nome = teclado.nextLine();
                   System.out.println("\nId");
                   id = teclado.nextLine();
                   
                   novoAluno = new Aluno(nome,id);
                   
                   System.out.println("\nQuantas notas?");
                   qntNotas = teclado.nextInt();
                  
                   for (int i = 0; 1<qntNotas; i ++) {
                        System.out.println("\nNotas " + (i));
                        nota = teclado.nextFloat();
                        novoAluno.insereNotas(nota);
                   }
                   novaDisciplina.inserirAluno(novoAluno);
                   break;
               case 2:
                   novaDisciplina.listarAlunos();
                   
                   break;
               case 3:
                   novaDisciplina.listarSituacoes();
                   System.out.println("");
                   break;
                   
               case 0:
                   System.out.println("\nSaindo...");
                   break;
                   
               default:
                   System.out.println("\nOpção invalida");
    }
        } while (opc !=0);

    }
        
        }
        
    
    

            
            
        
    
