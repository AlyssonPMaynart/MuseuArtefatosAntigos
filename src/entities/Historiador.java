package entities;

public class Historiador extends Funcionario{
    private String areaEspecializacao;
    private int anosExperiencia;

    public Historiador(int idFuncionario, String nome, String cpf, int idade, int telefone, String email, String sexo, String areaEspecializacao, int anosExperiencia) {
        super(idFuncionario, nome, cpf, idade, telefone, email, sexo);
        this.areaEspecializacao = areaEspecializacao;
        this.anosExperiencia = anosExperiencia;
    }

    public String getAreaEspecializacao() {
        return areaEspecializacao;
    }

    public void setAreaEspecializacao(String areaEspecializacao) {
        this.areaEspecializacao = areaEspecializacao;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
}
