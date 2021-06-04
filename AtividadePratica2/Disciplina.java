package AtividadePratica2;

public class Disciplina {
    private String disciplina;
    private int id;
    private double nota1;
    private double nota2;
    private transient double media = 0.;
    private String situacao = "";
    private Aluno aluno;
public Disciplina() {
}
public Disciplina(String disciplina,int id, double
nota1, double nota2,double media, Aluno aluno) {
super();
this.disciplina = disciplina;
this.id = id;
this.nota1 = nota1;
this.nota2 = nota2;
this.media = media;
this.aluno = aluno;
}

public Disciplina(String disciplina,int id, double
nota1, double nota2,double media) {
super();
this.disciplina = disciplina;
this.id = id;
this.nota1 = nota1;
this.nota2 = nota2;
this.media = media;
}

/*
public String toString() {
return Disciplina [disciplina="+disciplina+" id=" + id + ",  nota1=" + nota1 + ",
nota2=" + nota2 + ",media=" + media + ", situacao=" + situacao + "];
}
*/
public String getDisciplina() {
return disciplina;
}

public void setDisciplina(String disciplina) {
this.disciplina = disciplina;
}

public int getId() {
return id;
}

public void setId(int codigo) {
this.id = id;
}

public double getNota1() {
return nota1;
}

public void setNota1(double nota1) {
this.nota1 = nota1;
}

public double getNota2() {
return nota2;
}

public void setNota2(double nota2) {
this.nota2 = nota2;
}

public double getMedia() {
return media;
}

public void setMedia(double media) {
this.media = media;
}

public String getSituacao() {
return situacao;
}

public void setSituacao(String situacao) {
this.situacao = situacao;
}

public Aluno getAluno() {
return aluno;
}

public void setAluno(Aluno aluno) {
this.aluno = aluno;
}
}