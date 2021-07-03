package AtividadePratica2;

public class Principal
{
          
    public  static  void  main ( String [] args ) {
        
    Aluno aluno1 =  new  Aluno ();
    aluno1.setNome ( " Lucas " );
    aluno1.setId ( 123 );
    //aluno1.nota1 =  7,5 ;
    //aluno1.nota2 =  6,8 ;
    //System.out.println(aluno1.retornaMedia ());
    //System.out.println( " Aprovado: " + aluno1.passou ());
        
    Aluno aluno2 =  new  Aluno ();
    aluno2.setNome ( " Yunna " );
    //aluno2.nota1 =  8,1;
    //aluno2.nota2 =  7,7;
    
    Aluno aluno3 =  new  Aluno ();
    aluno3 . setNome ( " Pedro " );
    //aluno3 . nota1 =  3,2 ;
    //aluno3 . nota2 =  5,5 ;
    Disciplina disciplina =  new  Disciplina ();
        // Adicionando aluno nas posições do Array
        disciplina . adicionarAluno (aluno1, 0 );
        disciplina . adicionarAluno (aluno2, 1 );
        disciplina . adicionarAluno (aluno3, 2 );
}
}