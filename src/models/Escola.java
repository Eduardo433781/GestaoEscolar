package models;

import java.util.ArrayList;

public class Escola {
    private String nome;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;

    public Escola(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void listarAlunos() {
        System.out.println("Lista de Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public void listarProfessores() {
        System.out.println("Lista de Professores:");
        for (Professor professor : professores) {
            System.out.println(professor);
        }
    }
}
