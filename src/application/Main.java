package application;
import entities.Artefato;
import entities.Evento;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Artefato> artefatos = new ArrayList<>();

        int opcao;
        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Cadastrar artefato");
            System.out.println("2. Consultar artefato");
            System.out.println("3. Remover artefato");
            System.out.println("4. Listar artefatos");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Cadastrar artefato
                    System.out.println("Digite o nome do artefato:");
                    String nome = scanner.next();// ... (Solicitar os demais dados do artefato)
                    Artefato novoArtefato = new Artefato(); // Criar o objeto Artefato
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
                    System.out.println("Saindo do sistema.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);
    }
}