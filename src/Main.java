import models.Aluno;
import models.Escola;
import models.Professor;

public class Main {
    public static void main(String[] args) {

        Escola escola = new Escola("Escola Modelo");

        Aluno aluno1 = new Aluno("Carlos Silva", 15, "A123");
        Aluno aluno2 = new Aluno("Mariana Souza", 16, "A456");

        Professor professor1 = new Professor("João Pereira", "Matemática");
        Professor professor2 = new Professor("Ana Costa", "Português");

        escola.adicionarAluno(aluno1);
        escola.adicionarAluno(aluno2);
        escola.adicionarProfessor(professor1);
        escola.adicionarProfessor(professor2);

        escola.listarAlunos();
        escola.listarProfessores();
    }
}