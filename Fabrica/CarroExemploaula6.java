package Fabrica;



public class CarroExemploaula6 {
    
    private boolean status;
    private int qtdLibras;
    
    // o m�tado ligar est� usando uma estrutura de condicional IF/Else 
    public void ligar(String status) { 
        
        //if sem chaves
        if (status == "a" ) 
                
        System.out.println("Recebi a");

        //bloco if-else
        if (status == "on") {
         //Se a vari�vel for igual a "on", a frase abaixo ser� escrita 
         System.out.println("Carro Ligado");
        } else {
         //// ESSE � UM MODO MAIS ELABORADO DO ELSE:else if (status == "off")
         //Se a vari�vel for diferente de "on", nenhuma frase ser� exibida
         System.out.println("Carro Desligado");
        }
        
        //bloco if-else
        if (status == "d") {
         //Se a vari�vel for igual a "on", a frase abaixo ser� escrita 
         System.out.println("Recebi d");
        } else if(status == "b"){
         //// ESSE � UM MODO MAIS ELABORADO DO ELSE:else if (status == "off")
         //Se a vari�vel for diferente de "on", nenhuma frase ser� exibida
         System.out.println("Recebi b");
        } else {
        System.out.println("N�o � nem b nem d");}

    }   
    
     /*O m�todo verificarCalibre est� usando uma estrutura condicional de
      * Switch/case
      */
      public void verificarCalibre(int qtdLibras) {
      /*De acordo com cada resposta ser� verificado qual mensagem deve
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
      }