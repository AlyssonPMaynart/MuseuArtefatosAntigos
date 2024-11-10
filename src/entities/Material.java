package entities;

public class Material {
    public String nome;
    public String composicao;
    public String propriedades;
    public String origem;
    public String tratamentos;
    public String vulnerabilidades;

    public Material(String nome, String composicao, String propriedades, String origem, String tratamentos, String vulnerabilidades) {
        this.nome = nome;
        this.composicao = composicao;
        this.propriedades = propriedades;
        this.origem = origem;
        this.tratamentos = tratamentos;
        this.vulnerabilidades = vulnerabilidades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComposicao() {
        return composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }

    public String getPropriedades() {
        return propriedades;
    }

    public void setPropriedades(String propriedades) {
        this.propriedades = propriedades;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getTratamentos() {
        return tratamentos;
    }

    public void setTratamentos(String tratamentos) {
        this.tratamentos = tratamentos;
    }

    public String getVulnerabilidades() {
        return vulnerabilidades;
    }

    public void setVulnerabilidades(String vulnerabilidades) {
        this.vulnerabilidades = vulnerabilidades;
    }
}