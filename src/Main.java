import models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Escola escola = new Escola("Escola Modelo");

        Aluno aluno1 = new Aluno("Carlos Silva", 15, "A123");
        Aluno aluno2 = new Aluno("Mariana Souza", 16, "A456");

        Professor professor1 = new Professor("João Pereira", "Matemática", 15);
        Professor professor2 = new Professor("Ana Costa", "Português", 15);

        escola.adcionarAluno(aluno1);
        escola.adcionarAluno(aluno2);
        escola.adcionarProfessor(professor1);
        escola.adcionarProfessor(professor2);

        escola.listaDeAlunos();
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        escola.listaDeProfessores();
        System.out.println("-----------------------------------------------------------------------------------------------------------");




        Turma turma = new Turma("Java",2025,professor1);
        Disciplina disciplina = new Disciplina("Matemática",85,professor1);
    }
}