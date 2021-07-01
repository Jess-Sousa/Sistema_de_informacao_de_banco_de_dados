package Fabrica;



public class teste1
{
    
    public void preencheValoresArray(){
        int [] vetor = new int [4];
        try { 
            vetor[0] = 10;
            vetor[1] = 20;
            vetor[2] = 46;
            vetor[3] = 57;
            vetor[4] = 98;
            System.out.println("M1 TODOS ELEMENTOS FORAM INSERIDOS"); }
            catch (NullPointerException e){
                System.out.println(",2 EXCEÇÃO CAPTURADA");}
                finally { 
                System.out.println("M3 FONALIZAÇÃO DO MEDOTO");}
                System.out.println(",4 RESTO DO PROGRMA");
            }
        }
