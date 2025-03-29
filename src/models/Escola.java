package models;

import java.util.ArrayList;

public class Escola {
    private String Nome;
    private ArrayList<Aluno> Alunos;
    private ArrayList<Professor> Professores;

    public Escola(String nome) {
        this.Nome = Nome;
        this.Alunos = new ArrayList<>();
        this.Professores = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        Alunos.add(aluno);
    }

    public void adicionarProfessor(Professor professor) {
        Professores.add(professor);
    }

    public void listarAlunos(){
        System.out.println("Lista de Alunos:");
        for (Aluno aluno : Alunos){
            System.out.println(aluno);
        }
    }
    public void listarProfessores(){
        System.out.println("Lista de Professores:");
        for (Professor professor : Professores) {
            System.out.println(professor);
        }
    }
}
