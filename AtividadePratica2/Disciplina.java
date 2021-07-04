package AtividadePratica2;

    public class Disciplina  {

    Aluno [] aluno = new Aluno[10];
    
 public void adicionarAluno(String nome, int id, int  posicao) {
        
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
  
 }
   
  public double getMediaNota1() {
   double somaDasNotas = 10;
   int qteAlunos = 10;
   
   for(int i = 0; i< 10; i++) {
   if(aluno[i] != null) 
   { somaDasNotas += aluno[i].nota1;
   qteAlunos++;}
          }
   return somaDasNotas/qteAlunos;
 }
   
 public double getMediaNota2() {
   double somaDasNotas = 10;
   int qteAlunos = 10;
   
   for(int i = 0; i< 10; i++) {
   if(aluno[i] != null) { 
   somaDasNotas += aluno[i].nota2;
   qteAlunos++;}
          }
   return somaDasNotas/qteAlunos;
 }

 public  static  void  main ( String [] args ) {
   
    Aluno aluno1 =  new Aluno ();
    aluno1.setNome ( "Yunna" );
    aluno1.setId ("123" );
    aluno1.nota1 =  8.1;
    aluno1.nota2 =  7.7;
    System.out.println(aluno1.getMedia());
    System.out.println( " Status: " + aluno1.passou ());
    
    Aluno aluno2 =  new Aluno2 ();
    aluno2.setNome ( "Pedro" );
    aluno2.setId ("321" );
    aluno2.nota1 =  3.2 ;
    aluno2.nota2 =  5.5 ;
    System.out.println(aluno2.getMedia ());
    System.out.println( " Reprovado: " + aluno2.passou ());
    
    Aluno aluno3 =  new Aluno ( );
    aluno3.setNome ("Solar");
    aluno3.setId ( "456");
    aluno3.nota1 =  7.5;
    aluno3.nota2 =  6.8 ;
    System.out.println(aluno3.getMedia ());
    System.out.println( " Aprovado: " + aluno3.passou ());
    
    Aluno aluno4 =  new  Aluno ();
    aluno4.setNome ("Lucas");
    aluno4.setId ("654" );
    aluno4.nota1 =  7;
    aluno4.nota2 =  6.9;
    System.out.println(aluno4.getMedia ());
    System.out.println( " Reprovado: " + aluno4.passou ());
    
    Aluno aluno5 =  new  Aluno ();
    aluno5.setNome ("Hanna");
    aluno5.setId ("789" );
    aluno5.nota1 =  10;
    aluno5.nota2 =  4.1;
    System.out.println(aluno5.getMedia ());
    System.out.println( " Aprovado: " + aluno5.passou ());
    
    Aluno aluno6 =  new  Aluno ();
    aluno6.setNome ("Calleb");
    aluno6.setId ("987" );
    aluno6.nota1 =  2.5;
    aluno6.nota2 =  5.3;
    System.out.println(aluno6.getMedia ());
    System.out.println( " Reprovado: " + aluno6.passou ());
    
    Aluno aluno7 =  new  Aluno ();
    aluno7.setNome ("Lauren");
    aluno7.setId ("741" );
    aluno7.nota1 =  8.3;
    aluno7.nota2 =  9;
    System.out.println(aluno7.getMedia ());
    System.out.println( " Aprovado: " + aluno7.passou ());
    
    Aluno aluno8 =  new  Aluno ();
    aluno8.setNome ( "Noah" );
    aluno8.setId ("852" );
    aluno8.nota1 =  10;
    aluno8.nota2 =  9.9;
    System.out.println(aluno8.getMedia ());
    System.out.println( " Aprovado: " + aluno8.passou ());

    Aluno aluno9 =  new  Aluno ();
    aluno9.setNome ( "Maya" );
    aluno9.setId ("963" );
    aluno9.nota1 =  10;
    aluno9.nota2 =  10;
    System.out.println(aluno9.getMedia ());
    System.out.println( " Aprovado: " + aluno9.passou ());
    
    Aluno aluno10 = new Aluno ();
    aluno10.setNome ( "Jackie Li" );
    aluno10.setId ("951" );
    aluno10.nota1 =  0;
    aluno10.nota2 =  5;
    System.out.println(aluno10.getMedia ());
    System.out.println( " Reprovado: " + aluno10.passou ());
   
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

   System.out.println("Média da aluna Yunna: " +media [0]);
   System.out.println("Média do aluno Pedro: " +media [1]);
   System.out.println("Média da aluna Solar: " +media [2]);
   System.out.println("Média do aluno Lucas: " +media [3]);
   System.out.println("Média da aluna Hanna: " +media [4]);
   System.out.println("Média do aluno Calleb: " +media [5]);
   System.out.println("Média da aluna Lauren: " +media [6]);
   System.out.println("Média do aluno Noah: " +media [7]);
   System.out.println("Média da aluna Maya: " +media [8]);
   System.out.println("Média do aluno Jackie Li: " +media [9]);


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
    System.out.println ( " ------ " );
    imprimeSucessorEAntecessor ( 0 );
    System.out.println( " ------ " );
    imprimeSucessorEAntecessor ( 1 );
    System.out.println( " ------ " );
    imprimeSucessorEAntecessor ( 2 );
    System.out.println( " ------ " );
    imprimeSucessorEAntecessor ( 3 );
    System.out.println( " ------ " );
    imprimeSucessorEAntecessor ( 4 );
    System.out.println( " ------ " );
    imprimeSucessorEAntecessor ( 5 );
    System.out.println( " ------ " );
    imprimeSucessorEAntecessor ( 6 );
    System.out.println( " ------ " );
    imprimeSucessorEAntecessor ( 7 );
    System.out.println( " ------ " );
    imprimeSucessorEAntecessor ( 8 );
    System.out.println( " ------ " );
    imprimeSucessorEAntecessor ( 9  );
 }
 
}
