package models;

public class Professor {
    private String nome;
    private String disciplina;
    private int idade;

    public Professor(String nome, String disciplina, int idade) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public String toString() {
        return "Professor: " + nome + " | Idade: " + idade + " | Disciplina: " + disciplina;
    }
}

