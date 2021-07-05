package TrabalhoPratico2;

    public  class  Aluno {
	private  String nome;
	private int id;
	private double media;
	protected  double nota1;
	protected  double nota2;
	protected boolean status;
	
	public Aluno ( String nome,int id, double nota1, double nota2,
                double media, boolean status) {
            this.nome=nome;
            this.id= id;
            this.nota1=nota1;
            this.nota2 = nota2;
            this.media = media;
            this.status = status;
            }// fim do construtor*/ 
         
        public Aluno() {
	
	}

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
        
        public void setId ( int id) {
            this.id = id; 
            }

        public int getId () {
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
            return media;
            }

        public void setMedia(double Media){
            this.media = Media;
            }

        public boolean getStatus(){
            return status;
            }
            
	public boolean status(){
            media = (nota1 + nota2)/2;
            if (media >= 7.0)
            return true;
            else
            return false;
    
        }
}

