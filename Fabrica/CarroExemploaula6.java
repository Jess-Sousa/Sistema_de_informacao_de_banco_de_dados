package Fabrica;



public class CarroExemploaula6 {
    
    private boolean status;
    private int qtdLibras;
    
    // o métado ligar está usando uma estrutura de condicional IF/Else 
    public void ligar(String status) { 
        
        //if sem chaves
        if (status == "a" ) 
                
        System.out.println("Recebi a");

        //bloco if-else
        if (status == "on") {
         //Se a variável for igual a "on", a frase abaixo será escrita 
         System.out.println("Carro Ligado");
        } else {
         //// ESSE É UM MODO MAIS ELABORADO DO ELSE:else if (status == "off")
         //Se a variável for diferente de "on", nenhuma frase será exibida
         System.out.println("Carro Desligado");
        }
        
        //bloco if-else
        if (status == "d") {
         //Se a variável for igual a "on", a frase abaixo será escrita 
         System.out.println("Recebi d");
        } else if(status == "b"){
         //// ESSE É UM MODO MAIS ELABORADO DO ELSE:else if (status == "off")
         //Se a variável for diferente de "on", nenhuma frase será exibida
         System.out.println("Recebi b");
        } else {
        System.out.println("Não é nem b nem d");}

    }   
    
     /*O método verificarCalibre está usando uma estrutura condicional de
      * Switch/case
      */
      public void verificarCalibre(int qtdLibras) {
      /*De acordo com cada resposta será verificado qual mensagem deve
       * aparecer.
       */
      switch (qtdLibras) {
          case 20:
               System.out.println("Pneus com poucas libras");
          break;

          case 30:
               System.out.println("Pneus com q quantidade ideal de libras");
          break;
          
          case 40:
               System.out.println("Pneus com q quantidade excessiva de libras");
          break;
          
          default:
              System.out.println("Informe 20,30,ou 35!");
          break;
          
            }
        }
            
      // O método calibrarWhile está usando uma estrutura de repitição While 
      public void calibrarWhile(int libras) {
      //Enquanto a variável libras não for menor que 35 ele i?a apresentar a msg
      while (libras < 35){
            System.out.println("O pneu não está calibrado, "+libras+" libras");
            libras++; // = libras = libras + 1
      }
            System.out.println("O pneu está calibrado!!!");
    }
      // O metodo calibrarWhile está usando uma estrutura de repetição Do While
      public void calibrarDoWhile(int libras){
      //Enqnto a variavel libras não for menor que 35 ele irá apresentar a msg
      do{
         System.out.println("O pneu não está calibrado, pois está com "+libras+"libras");
         libras++; 
        } while(libras < 35 );
         System.out.println("O pneu está calibrado!");
        }
        
        public void modelosDeCarroArray() {
            //[] - são inseridas em uma variável que referencia um array
            String[] modelosA = new String[4];
            modelosA[0] = "oi";
            modelosA[1] = "Olá";
            System.out.println("modelosA[0]");
            System.out.println("modelosA[1]");

            //Outra maneira de fazer uma declaração de array 
            String[] modelosB;
            modelosB = new String[4];
            
            //{} - inicializar valores em um array sua declaração
            String[] modelosC = {"Gol", "Crossfox", "Uno", "Palio"};
            
            System.out.println(modelosC[0]);  
        }
    
        //O método calibrarFor está usando uma estrutura de repetição FOR
        public void calibrarFor(int libras) {
        //Enqnto o i não for menor ou igual a 35 ele irá apresentar a msg:
        for (int i = libras; i <= 35; i++){
            System.out.println("O pneu não está calibrado, pois está com "+i+" libras");
        }
            System.out.println("O pneu está calibrado!");
        }
         /* OBSs: o i é uma variavel, se eu quiser colocar no texto deixo nessa forma:
          * "+i+"
          * O comando break; serve para sair de uma repetição
          */   
        
            

        }
        

     
      