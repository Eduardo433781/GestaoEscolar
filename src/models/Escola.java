package models;

import java.util.ArrayList;

public class Escola {
    private String nomeEscola;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;


    public Escola(String nome) {
        this.nomeEscola = nome;
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        ;
    }

    public void adcionarAluno(Aluno aluno) {
        alunos.add(aluno);

    }

    public void adcionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void listaDeAlunos() {
        System.out.println("Lista de alunos da escola");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public void listaDeProfessores() {
        System.out.println("Lista de professores da escola");
        for (Professor professor : professores) {
            System.out.println(professor);
        }
    }

}
