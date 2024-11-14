package entities;

public class Visitante {
    private String nome;
    private String contato;
    private int visitas;
    private int idade;
    private String ultimoFeedback;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public int getVisitas() {
        return visitas;
    }

    public void setVisitas(int visitas) {
        this.visitas = visitas;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getUltimoFeedback() {
        return ultimoFeedback;
    }

    public void setUltimoFeedback(String ultimoFeedback) {
        this.ultimoFeedback = ultimoFeedback;
    }

    public Visitante(String nome, String contato, int visitas, int idade, String ultimoFeedback) {
        this.nome = nome;
        this.contato = contato;
        this.visitas = visitas;
        this.idade = idade;
        this.ultimoFeedback = ultimoFeedback;
    }


}
