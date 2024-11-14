package entities;

public class Historia {
    private String titulo;
    private String descricao;
    private String data;
    private String relacaoComArtefato;
    private String fontes;

    public Historia(String titulo, String descricao, String data, String fontes, String relacaoComArtefato) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.fontes = fontes;
        this.relacaoComArtefato = relacaoComArtefato;
    }
}
