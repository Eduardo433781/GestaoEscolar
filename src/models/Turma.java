package models;

import java.util.ArrayList;

public class Turma {
    private String nomeTurma;
    private int anoLetivo;
    private Professor professor; // Objeto complexo
    private ArrayList<Aluno> alunos;

    public Turma(String nomeTurma, int anoLetivo, Professor professor) {
        this.nomeTurma = nomeTurma;
        this.anoLetivo = anoLetivo;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAlunos() {
        System.out.println("Turma: " + nomeTurma + " | Ano: " + anoLetivo);
        System.out.println("Professor Responsável: " + professor.getNome());
        System.out.println("Alunos Matriculados:");

        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome());
        }
    }

}
