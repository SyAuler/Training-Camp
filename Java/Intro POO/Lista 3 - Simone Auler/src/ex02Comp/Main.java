package ex02Comp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Aluno[] alunos = new Aluno[1];
            alunos[0] = new Aluno(123043L, "daniel");

            Disciplina[] disc = new Disciplina[2];
            disc[0] = new Disciplina("Matematica", "S01");
            disc[1] = new Disciplina("Portugues", "S02");

            ArrayList<Avaliacao> avals = new ArrayList<Avaliacao>();

            Avaliacao[] avl = new Avaliacao[5];
            avl[0] = new Avaliacao(fmt.parse("13/04/2017"), 7);
            avl[0].setDisciplina(disc[0]);
            avals.add(avl[0]);

            avl[1] = new Avaliacao(fmt.parse("13/05/2017"), 8);
            avl[1].setDisciplina(disc[0]);
            avals.add(avl[1]);

            avl[2] = new Avaliacao(fmt.parse("05/06/2017"), 6);
            avl[2].setDisciplina(disc[1]);
            avals.add(avl[2]);

            avl[3] = new Avaliacao(fmt.parse("06/07/2017"), 8);
            avl[3].setDisciplina(disc[1]);
            avals.add(avl[3]);

            alunos[0].setAvals(avals);

            for (Aluno a : alunos) {
                for (int i = 0; i < disc.length; i++) {
                    System.out.println("Aluno " + a.getNome() + " Disciplina " + disc[i].getNome() + " Média " + a.media(disc[i]));
                }
            }
        } catch (Exception ex) {
        }
    }
}
