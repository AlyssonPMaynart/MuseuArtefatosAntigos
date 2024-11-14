package entities;

import java.time.LocalDate;

public class Evento {
    private String nome;
    private LocalDate data;
    private String descricao;
    private String local;

    // Construtor
    public Evento(String nome, LocalDate data, String descricao, String local) {
        this.nome = nome;
        this.data = data;
        this.descricao = descricao;
        this.local = local;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    // Método para exibir detalhes do evento
    public void exibirDetalhes() {
        System.out.println("Nome do Evento: " + nome);
        System.out.println("Data: " + data);
        System.out.println("Descrição: " + descricao);
        System.out.println("Local: " + local);
    }
}
