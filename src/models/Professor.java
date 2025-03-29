package models;

public class Professor {
    private String Nome;
    private String Disciplina;

    public Professor(String Nome, String Disciplina) {
        this.Nome = Nome;
        this.Disciplina = Disciplina;
    }

    public String getNome() {
        return Nome;
    }

    public String getDisciplina() {
        return Disciplina;
    }

    @Override
    public String toString(){
        return "Professor" + Nome + "Disciplina" + Disciplina;
    }
}

