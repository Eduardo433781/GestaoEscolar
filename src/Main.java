import models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Criando a escola
        Escola escola = new Escola("Escola Modelo");

        // Criando alunos
        Aluno aluno1 = new Aluno("Pedro Souza", 15, "A123");
        Aluno aluno2 = new Aluno("Mariana Souza", 16, "A456");

        // Criando professores
        Professor professor1 = new Professor("João Pereira", "Matemática", 40);
        Professor professor2 = new Professor("Ana Costa", "Português", 55);

        // Adicionando alunos e professores à escola
        escola.adicionarAluno(aluno1); // Correção no nome do método
        escola.adicionarAluno(aluno2); // Correção no nome do método
        escola.adicionarProfessor(professor1); // Correção no nome do método
        escola.adicionarProfessor(professor2); // Correção no nome do método

        // Listando alunos e professores
        escola.listaDeAlunos();
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        escola.listaDeProfessores();
        System.out.println("-----------------------------------------------------------------------------------------------------------");

        // Criando uma turma e associando um professor
        Turma turma = new Turma("Java", 2025, professor1);

        // Adicionando alunos à turma
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);

        // Exibindo a lista de alunos da turma
        turma.listarAlunos();
        System.out.println("-----------------------------------------------------------------------------------------------------------");

        // Criando uma disciplina e associando um professor
        Disciplina disciplina = new Disciplina("Matemática", 85, professor1);

        // Exibindo os detalhes da disciplina
        disciplina.exibirDetalhes();
        System.out.println("-----------------------------------------------------------------------------------------------------------");


        // Criando uma turma e associando um professor
        Turma turma2 = new Turma("Java2", 2025, professor2);

        // Adicionando alunos à turma
        turma2.adicionarAluno(aluno1);
        turma2.adicionarAluno(aluno2);

        // Exibindo a lista de alunos da turma
        turma2.listarAlunos();
        System.out.println("-----------------------------------------------------------------------------------------------------------");

        // Criando uma disciplina e associando um professor
        Disciplina disciplina2 = new Disciplina("Português", 80, professor2);

        // Exibindo os detalhes da disciplina
        disciplina2.exibirDetalhes();
    }
}