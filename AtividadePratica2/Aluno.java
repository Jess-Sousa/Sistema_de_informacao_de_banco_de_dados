package AtividadePratica2;

public class Aluno {
    
        private String nome;
        private String id;
        private double media;
        protected double nota1;
        protected double nota2;
        protected boolean status;
        Aluno[] aluno = new Aluno [10];

 
        public Aluno ( String nome,String id, double nota1, double nota2,
                double media, boolean status) {
            this.nome=nome;
            this.id=id;
            this.nota1=nota1;
            this.nota2 = nota2;
            this.media = media;
            this.status = status;
            }// fim do construtor*/ 

        public  void  imprimeNome () {
        System.out.println("nome");
        }
    
        public void setNome (String nome) {
            this.nome = nome;
        }

        public String getNome () {
            return nome;
        }
        
        public  void  imprimeId () {
        System.out.println("id");
        }
        
        public void setId ( String id) {
            this.id = id; 
            }

        public String getId () {
            return id;
            }

        public double getnota1(){
            return nota1;
            }

        public void setnota1 (double nota1){
            this.nota1 = nota1;
            }

        public double getnota2(){
            return nota2;
            }

        public void setnota2(double nota2){
            this.nota2 = nota2;
            }

        public double getMedia(){
            calculaMedia();
            return media;
            }

        public void setMedia(double Media){
            this.media = Media;
            }

        public boolean getStatus(){
            return status;
            }

        public void setStatus(boolean Status) {
            this.status = Status; 
            }
            
         private void calculaMedia() {
	    media = (nota1+nota2)/2;   
        }     

        public boolean passou(){
            media = (nota1 + nota2)/2;
            if (media >= 7.0)
            return true;
            else
            return false;
    
        }
   }