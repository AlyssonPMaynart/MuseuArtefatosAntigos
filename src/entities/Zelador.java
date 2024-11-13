package entities;

public class Zelador extends Funcionario {
    private String areaResponsavel; // Exemplo: "Prédio A", "Jardim"
    private String horarioTrabalho;

    public Zelador(int idFuncionario, String nome, String cpf, int idade, int telefone, String email, String sexo, String areaResponsavel, String horarioTrabalho) {
        super(idFuncionario, nome, cpf, idade, telefone, email, sexo);
        this.areaResponsavel = areaResponsavel;
        this.horarioTrabalho = horarioTrabalho;
    }
}
