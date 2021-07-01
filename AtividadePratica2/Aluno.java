package AtividadePratica2;

public class Aluno {
    
        private String nome;
        private String id;
        private double media;
        protected double nota1;
        protected double nota2;
        protected boolean status;
        
 
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

        public double getNota1(){
            return nota1;
            }

        public void setNota1 (double Nota1){
            this.nota1 = Nota1;
            }

        public double getNota2(){
            return nota2;
            }

        public void setNota2(double Nota2){
            this.nota2 = Nota2;
            }

        public double getMedia(){
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

        //@SuppressWarnings("unused")
        private double calcularMedia(){
            media = (nota1 + nota2)/2;
            if (media >= 7.0);
            System.out.println("Status: true");
            if (media <= 6.99);
            System.out.println("Status: false");

            return media;
           }
        
        }

        