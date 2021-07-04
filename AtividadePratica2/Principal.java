package AtividadePratica2;

public class Principal
{
          
    public  static  void  main ( String [] args ) {
        
    Aluno aluno1 =  new  Aluno ();
    aluno1.setNome ( " Yunna " );
    aluno1.setId ("123" );
    //aluno2.nota1 =  8,1;
    //aluno2.nota2 =  7,7;
    //System.out.println(aluno1.retornaMedia ());
    //System.out.println( " Aprovado: " + aluno1.passou ());
    
    Aluno aluno2 =  new  Aluno ();
    aluno2 . setNome ( " Pedro " );
    aluno2.setId ("" );
    //aluno2 . nota1 =  3,2 ;
    //aluno2 . nota2 =  5,5 ;
    //System.out.println(aluno2.retornaMedia ());
    //System.out.println( " Aprovado: " + aluno2.passou ());
    
    Aluno aluno3 =  new  Aluno ( " Lucas ");
    aluno3.setNome ( " 123 " );
    aluno3.setId ( "");
    //aluno3.nota1 =  7,5;
    //aluno3.nota2 =  6,8 ;
    //System.out.println(aluno3.retornaMedia ());
    //System.out.println( " Aprovado: " + aluno3.passou ());
    
    Aluno aluno4 =  new  Aluno ();
    aluno4.setNome ( " Yunna " );
    aluno4.setId ("" );
    //aluno4.nota1 =  8,1;
    //aluno4.nota2 =  7,7;
    //System.out.println(aluno4.retornaMedia ());
    //System.out.println( " Aprovado: " + aluno4.passou ());
    
    Aluno aluno5 =  new  Aluno ();
    aluno5.setNome ( " Yunna " );
    aluno5.setId ("" );
    //aluno5.nota1 =  8,1;
    //aluno5.nota2 =  7,7;
    //System.out.println(aluno5.retornaMedia ());
    //System.out.println( " Aprovado: " + aluno5.passou ());
    
    Aluno aluno6 =  new  Aluno ();
    aluno6.setNome ( " Yunna " );
    aluno6.setId ("" );
    //aluno6.nota1 =  8,1;
    //aluno6.nota2 =  7,7;
    //System.out.println(aluno6.retornaMedia ());
    //System.out.println( " Aprovado: " + aluno6.passou ());
    
    Aluno aluno7 =  new  Aluno ();
    aluno7.setNome ( " Yunna " );
    aluno7.setId ("" );
    //aluno7.nota1 =  8,1;
    //aluno7.nota2 =  7,7;
    //System.out.println(aluno7.retornaMedia ());
    //System.out.println( " Aprovado: " + aluno7.passou ());
    
    Aluno aluno8 =  new  Aluno ();
    aluno8.setNome ( " Yunna " );
    aluno8.setId ("" );
    //aluno8.nota1 =  8,1;
    //aluno8.nota2 =  7,7;
    //System.out.println(aluno8.retornaMedia ());
    //System.out.println( " Aprovado: " + aluno8.passou ());

    Aluno aluno9 =  new  Aluno ();
    aluno9.setNome ( " Yunna " );
    aluno9.setId ("" );
    //aluno9.nota1 =  8,1;
    //aluno9nota2 =  7,7;
    //System.out.println(aluno9.retornaMedia ());
    //System.out.println( " Aprovado: " + aluno9.passou ());
    
    Aluno aluno10 =  new  Aluno ();
    aluno10.setNome ( " Yunna " );
    aluno10.setId ("" );
    //aluno10.nota1 =  8,1;
    //aluno10nota2 =  7,7;
    //System.out.println(aluno10.retornaMedia ());
    //System.out.println( " Aprovado: " + aluno10.passou ());
    
    Disciplina disciplina =  new  Disciplina ();
        // Adicionando aluno nas posições do Array
        disciplina . adicionarAluno (aluno1, 0 );
        disciplina . adicionarAluno (aluno2, 1 );
        disciplina . adicionarAluno (aluno3, 2 );
        disciplina . adicionarAluno (aluno4, 3 );
        disciplina . adicionarAluno (aluno5, 4 );
        disciplina . adicionarAluno (aluno6, 5 );
        disciplina . adicionarAluno (aluno7, 6 );
        disciplina . adicionarAluno (aluno8, 7 );
        disciplina . adicionarAluno (aluno9, 8 );
        disciplina . adicionarAluno (aluno10,9 );

    System.out.println( " Média da Nota1: "  + disciplina.getMediaNota1 ());
		
    System.out.println( " Média da Nota2: "  + disciplina.getMediaNota2 ());
		
		// imprimindo Sucessor e antecessor
    System.out.println ( " ------ " );
    disciplina . imprimeSucessorEAntecessor ( 0 );
    System.out.println( " ------ " );
    disciplina . imprimeSucessorEAntecessor ( 1 );
    System.out.println( " ------ " );
    disciplina . imprimeSucessorEAntecessor ( 2 );
    System.out.println( " ------ " );
    disciplina . imprimeSucessorEAntecessor ( 3 );
    System.out.println( " ------ " );
    disciplina . imprimeSucessorEAntecessor ( 4 );
    System.out.println( " ------ " );
    disciplina . imprimeSucessorEAntecessor ( 5 );
    System.out.println( " ------ " );
    disciplina . imprimeSucessorEAntecessor ( 6 );
    System.out.println( " ------ " );
    disciplina . imprimeSucessorEAntecessor ( 7 );
    System.out.println( " ------ " );
    disciplina . imprimeSucessorEAntecessor ( 8 );
    System.out.println( " ------ " );
    disciplina . imprimeSucessorEAntecessor ( 9  );
            
}
}