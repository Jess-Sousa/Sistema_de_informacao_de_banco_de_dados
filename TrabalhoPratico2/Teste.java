package TrabalhoPratico2;

public class Teste
{
	Aluno[] aluno = new Aluno [10];
        Aluno[] aluno1 = new Aluno[0];
        Aluno[] aluno2 = new Aluno[1];
        Aluno[] aluno3 = new Aluno[2];
        Aluno[] aluno4 = new Aluno[3];
        Aluno[] aluno5 = new Aluno[4];
        Aluno[] aluno6 = new Aluno[5];
        Aluno[] aluno7 = new Aluno[6];
        Aluno[] aluno8 = new Aluno[7];
        Aluno[] aluno9 = new Aluno[8];
        Aluno[] aluno10= new Aluno[9];
   
    public  static  void  main ( String [] args ) {
		
    Aluno aluno1 = new Aluno ();
    aluno1.setNome ( "Yunna" );
    aluno1.setId (123);
    aluno1.nota1 = 8.1;
    aluno1.nota2 = 7.7;
    System.out.println(aluno1.getMedia());
    System.out.println( " Status: " + aluno1.status ());
    
    Aluno aluno2 =  new Aluno ();
    aluno2.setNome ( "Pedro" );
    aluno2.setId (321);
    aluno2.nota1 = 3.2;
    aluno2.nota2 = 5.5;
    System.out.println(aluno2.getMedia ());
    System.out.println( " Status: " + aluno2.status ());
    
    Aluno aluno3 =  new Aluno ( );
    aluno3.setNome ("Solar");
    aluno3.setId (456);
    aluno3.nota1 = 7.5;
    aluno3.nota2 = 6.8;
    System.out.println(aluno3.getMedia ());
    System.out.println( " Status: " + aluno3.status ());
    
    Aluno aluno4 =  new  Aluno ();
    aluno4.setNome ("Lucas");
    aluno4.setId (654);
    aluno4.nota1 = 7.0;
    aluno4.nota2 = 6.9;
    System.out.println(aluno4.getMedia ());
    System.out.println( " Status: " + aluno4.status ());
    
    Aluno aluno5 =  new  Aluno ();
    aluno5.setNome ("Hanna");
    aluno5.setId (789);
    aluno5.nota1 = 10.0;
    aluno5.nota2 = 4.1;
    System.out.println(aluno5.getMedia ());
    System.out.println( " Status: " + aluno5.status ());
    
    Aluno aluno6 =  new  Aluno ();
    aluno6.setNome ("Calleb");
    aluno6.setId (987);
    aluno6.nota1 = 2.5;
    aluno6.nota2 = 5.3;
    System.out.println(aluno6.getMedia ());
    System.out.println( " Status: " + aluno6.status ());
    
    Aluno aluno7 =  new  Aluno ();
    aluno7.setNome ("Lauren");
    aluno7.setId (741);
    aluno7.nota1 = 8.3;
    aluno7.nota2 = 9.0;
    System.out.println(aluno7.getMedia ());
    System.out.println( " Status: " + aluno7.status ());
    
    Aluno aluno8 =  new  Aluno ();
    aluno8.setNome ( "Noah" );
    aluno8.setId (852);
    aluno8.nota1 =  10.0;
    aluno8.nota2 =  9.9;
    System.out.println(aluno8.getMedia ());
    System.out.println( " Status: " + aluno8.status ());

    Aluno aluno9 =  new  Aluno ();
    aluno9.setNome ( "Maya" );
    aluno9.setId (951);
    aluno9.nota1 = 10.0;
    aluno9.nota2 = 10.0;
    System.out.println(aluno9.getMedia ());
    System.out.println( " Status: " + aluno9.status ());
    
    Aluno aluno10 = new Aluno ();
    aluno10.setNome ( "Jackie Li" );
    aluno10.setId (963);
    aluno10.nota1 = 0.0;
    aluno10.nota2 = 5.0;
    System.out.println(aluno10.getMedia ());
    System.out.println( " Status: " + aluno10.status ());
	
    Disciplina disciplina =  new  Disciplina ();
	
    disciplina.adicionarAluno (aluno1, 0 );
    disciplina.adicionarAluno (aluno2, 1 );
    disciplina.adicionarAluno (aluno3, 2 );
    disciplina.adicionarAluno (aluno4, 3 );
    disciplina.adicionarAluno (aluno5, 4 );
    disciplina.adicionarAluno (aluno6, 5 );
    disciplina.adicionarAluno (aluno7, 6 );
    disciplina.adicionarAluno (aluno8, 7 );
    disciplina.adicionarAluno (aluno9, 8 );
    disciplina.adicionarAluno (aluno10,9 );
	
    int numAlunos = 10;
        double[] nota1 = new double[numAlunos];
        nota1[0]=8.1;
        nota1[1]=3.2;
        nota1[2]=7.5;
        nota1[3]=7;
        nota1[4]=10;
        nota1[5]=2.5;
        nota1[6]=8.3;
        nota1[7]=10;
        nota1[8]=10;
        nota1[9]=0;
    
        double[] nota2 = new double[numAlunos];
        nota2[0]=7.7;
        nota2[1]=5.5;
        nota2[2]=6.8;
        nota2[3]=6.9;
        nota2[4]=4.1;
        nota2[5]=5.3;
        nota2[6]=9;
        nota2[7]=9.9;
        nota2[8]=10;
        nota2[9]=5;
    
        double [] media = new double [numAlunos];
        media [0] = (nota1[0] + nota2[0])/2;
        media [1] = (nota1[1] + nota2[1])/2;
        media [2] = (nota1[2] + nota2[2])/2;
        media [3] = (nota1[3] + nota2[3])/2;
        media [4] = (nota1[4] + nota2[4])/2;
        media [5] = (nota1[5] + nota2[5])/2;
        media [6] = (nota1[6] + nota2[6])/2;
        media [7] = (nota1[7] + nota2[7])/2;
        media [8] = (nota1[8] + nota2[8])/2;
        media [9] = (nota1[9] + nota2[9])/2;

        System.out.println("Média da aluna Yunna: "  +media [0]);
        System.out.println("Média do aluno Pedro: "  +media [1]);
        System.out.println("Média da aluna Solar: "  +media [2]);
        System.out.println("Média do aluno Lucas: "  +media [3]);
        System.out.println("Média da aluna Hanna: "  +media [4]);
        System.out.println("Média do aluno Calleb: " +media [5]);
        System.out.println("Média da aluna Lauren: " +media [6]);
        System.out.println("Média do aluno Noah: " +media [7]);
        System.out.println("Média da aluna Maya: " +media [8]);
        System.out.println("Média do aluno Jackie Li: " +media [9]);
        
        System.out.println( " Média da Turma Nota1: "  + disciplina . getMediaNota1 ());
		
        System.out.println( " Média da Turma Nota2: "  + disciplina . getMediaNota2 ());

        
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

