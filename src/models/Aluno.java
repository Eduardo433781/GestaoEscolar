package models;

public class Aluno {
    private String Nome;
    private int Idade;
    private String Matricula;

    public Aluno (String nome, int idade, String matricula) {
        this.Nome = nome;
        this.Idade = Idade;
        this.Matricula = Matricula;
    }

    public String getNome(){
        return Nome;
    }
    public int getIdade(){
        return Idade;
    }
    public String getMatricula(){
        return Matricula;
    }

    @Override
    public String toString(){
        return "Aluno" + Nome + "Idade" + Idade + "Matricula" + Matricula;
    }

}
