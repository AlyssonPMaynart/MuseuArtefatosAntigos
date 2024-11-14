package entities;

public class Civilizacao {
    private String nome;
    private String periodo;
    private String localizacao;
    private String caracteristicasCulturais;
    private String tecnologias;
    private String influenciaCultural;

    public Civilizacao() {}

    public Civilizacao(String nome, String localizacao, String periodo, String caracteristicasCulturais, String tecnologias, String influenciaCultural) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.periodo = periodo;
        this.caracteristicasCulturais = caracteristicasCulturais;
        this.tecnologias = tecnologias;
        this.influenciaCultural = influenciaCultural;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getCaracteristicasCulturais() {
        return caracteristicasCulturais;
    }

    public void setCaracteristicasCulturais(String caracteristicasCulturais) {
        this.caracteristicasCulturais = caracteristicasCulturais;
    }

    public String getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }

    public String getInfluenciaCultural() {
        return influenciaCultural;
    }

    public void setInfluenciaCultural(String influenciaCultural) {
        this.influenciaCultural = influenciaCultural;
    }
}
