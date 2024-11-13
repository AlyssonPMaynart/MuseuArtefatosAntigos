package entities;

public class Atendente extends Funcionario{
    private String turno; // Exemplo: "matutino", "vespertino", "noturno"
    private double salario;

    public Atendente(int idFuncionario, String nome, String cpf, int idade, int telefone, String email, String sexo, String turno, double salario) {
        super(idFuncionario, nome, cpf, idade, telefone, email, sexo);
        this.turno = turno;
        this.salario = salario;
    }
}
