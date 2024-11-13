package application;
import entities.Artefato;
import entities.Evento;
import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Artefato> artefatos = new ArrayList<>();
        List<Funcionario> funcionarios = new ArrayList<>();

        // Cadastrar 5 funcionários aleatórios
        funcionarios.add(new Funcionario(1, "Alice", "123.456.789-00", 30, 123456789, "alice@example.com", "Feminino", 3500.00f));
        funcionarios.add(new Funcionario(2, "Bob", "987.654.321-00", 25, 987654321, "bob@example.com", "Masculino", 4000.00f));
        funcionarios.add(new Funcionario(3, "Carlos", "111.222.333-44", 28, 111222333, "carlos@example.com", "Masculino", 4500.00f));
        funcionarios.add(new Funcionario(4, "Diana", "555.666.777-88", 32, 555666777, "diana@example.com", "Feminino", 3800.00f));
        funcionarios.add(new Funcionario(5, "Eva", "999.888.777-66", 29, 999888777, "eva@example.com", "Feminino", 3700.00f));

        int opcao;
        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Cadastrar artefato");
            System.out.println("2. Consultar artefato");
            System.out.println("3. Remover artefato");
            System.out.println("4. Listar artefatos");
            System.out.println("5. Listar funcionários");
            System.out.println("6. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Cadastrar artefato
                    System.out.println("Digite o nome do artefato:");
                    String nome = scanner.next();
                    Artefato novoArtefato = new Artefato(nome); // Crie o objeto Artefato com os dados fornecidos
                    artefatos.add(novoArtefato);
                    System.out.println("Artefato cadastrado com sucesso!");
                    break;

                case 2:
                    // Consultar artefato
                    System.out.println("Digite o nome do artefato para buscar:");
                    String nomeBusca = scanner.next();
                    // Implementar a lógica de busca
                    break;

                case 3:
                    // Remover artefato
                    // Implementar a lógica de remoção
                    break;

                case 4:
                    // Listar artefatos
                    for (Artefato artefato : artefatos) {
                        System.out.println(artefato); // Sobrescrever o método toString em Artefato
                    }
                    break;

                case 5:
                    // Listar funcionários
                    System.out.println("Funcionários cadastrados:");
                    for (Funcionario funcionario : funcionarios) {
                        System.out.println(funcionario); // Sobrescrever o método toString em Funcionario
                    }
                    break;

                case 6:
                    System.out.println("Saindo do sistema.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 6);
    }
}
