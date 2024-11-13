package entities;

public class Gerente extends Funcionario {
    private int numFuncionariosGerenciados;
    private double bonus;

    public Gerente(int idFuncionario, String nome, String cpf, int idade, int telefone, String email, String sexo, int numFuncionariosGerenciados, double bonus) {
        super(idFuncionario, nome, cpf, idade, telefone, email, sexo);
        this.numFuncionariosGerenciados = numFuncionariosGerenciados;
        this.bonus = bonus;
    }
}
