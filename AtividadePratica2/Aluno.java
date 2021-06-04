package AtividadePratica2;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class Aluno
{
    private String nome;
    private int id;
    private double media;
    protected double nota1;
    protected double nota2;
    protected boolean status;


    private List<Alunos> listaAlunos;
    public Aluno() {
}

    public Aluno ( String aluno,int i, double nt1, double nt2,double m,
    boolean s) 
    {
    super();
    this.nome = aluno;
    this.id = i;
    this.nota1 = nt1;
    this.nota2 = nt2;
    this.media = m;
    this.status = s;
} // fim do construtor*/ 
 
public Aluno ( String aluno,int i, double nt1, double nt2,double m,
    boolean s, List <Alunos> listaAlunos) 
    {
    super();
    this.nome = nome;
    this.id = id;
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.media = media;
    this.status = status;
    this.listaAlunos = listaAlunos;
} // fim do construtor*/ 

/*public String toString() {
return Aluno (nome="+nome+", id=" +i+",
nota1="+nota1+," nota2= "+nota2+,"media="+media+,"status= "+status+," 
listaAlunos="+listaAlunos+");
}*/

public void setNome (String aluno) {
nome = aluno;
}

public String getNome () {
return nome;
}

public void setId (int i) {
id = i;

}

public int getId () {
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

 private double calcularMedia(){
    media = (nota1 + nota2)/2;
    if (media >= 7.0);
        System.out.println("Status: true");
    if (media <= 6.99);
    System.out.println("Status: false");

    return media;
}

public void setListaAlunos(List<Alunos>
listaAlunos) {
this.listaAlunos = listaAlunos;
}

public List<Alunos> getListaAlunos() {
return listaAlunos;
}

public Boolean validaId (Aluno a) throws Exception {
if (a.getId() <= 0) {
throw new IllegalArgumentException(
"Id Invalido ...Nao pode ser Nulo ou Negativo");
}
return true;
}

public Boolean validaNome(Aluno a) {
if (a.getNome() == null){
throw new IllegalArgumentException("Nome nao pode ser NULL... ");
}
if (a.getNome().length() == 0){
throw new IllegalArgumentException("Nome nao pode ser vazio...");
}
Pattern p = Pattern.compile("[A-Z a-z]{2,35}");
Matcher m = p.matcher(a.getNome());
if (!m.matches()) {
throw new IllegalArgumentException("Nome Invalido...");
}
return true;
}

public Boolean validaStatus (Aluno a) {
if (!a.getStatus()) {
throw new IllegalArgumentException("Aluno Inativo...");
}
return true;
}
}
/*public static void main(String[] args) {
try {
Aluno a = new Aluno (123, "Gabriel");
a.setstatus(true);
ValidaAluno va = new ValidaAluno();
va.validaId(a);
va.validaNome(a);
va.validaAtivo(a);
 System.out.println("Aluno Valido ..." + a);
} catch (Exception ex) {
System.out.println(ex.getMessage());
}
}
}

//[/code]
//Depois crie 1 lista de alinos:
/*
List <Aluno> alunos = new ArrayList<Aluno>();  
//Depois no botão, ou sei lá oq, vc faz isso:

 * Aluno aluno1 = new Aluno ();
Aluno aluno2 = new  Aluno();
Aluno aluno3 = new Aluno ();
Aluno aluno4 = new Aluno ();
Aluno aluno5 = new Aluno ();
Aluno aluno6 = new Aluno ();
Aluno aluno7 = new Aluno ();
Aluno aluno8 = new Aluno ();
Aluno aluno9 = new Aluno ();

aluno1.nome = "Gabriel"; alunos.add(aluno1);
aluno1.id = 123; alunos.add(aluno1);
aluno2.nome = "Ruth"; alunos.add(aluno2);
}
}
*/

