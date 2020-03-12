package ex02Comp;

import java.util.Date;

public class Avaliacao {

    private Date data;
    private float nota;
    private Disciplina disciplina;

    public Avaliacao(Date data, float nota) {
        this.data = data;
        this.nota = nota;
    }

    public Date getData() {
        return data;
    }

    public float getNota() {
        return nota;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
