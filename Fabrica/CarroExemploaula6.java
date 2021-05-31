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
      }