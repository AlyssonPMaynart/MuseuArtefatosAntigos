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
        ArvoreSalario arvoreSalario = new ArvoreSalario();

        arvoreSalario.inserir(new Funcionario(1, "Alice", "123.456.789-00", 30, 123456789, "alice@example.com", "Feminino", "Zelador",3500.00));
        arvoreSalario.inserir(new Funcionario(2, "Bob", "987.654.321-00", 25, 987654321, "bob@example.com", "Masculino","Historiador" ,4000.00));
        arvoreSalario.inserir(new Funcionario(3, "Carlos", "111.222.333-44", 28, 111222333, "carlos@example.com", "Masculino", "Gerente",4500.00));
        arvoreSalario.inserir(new Funcionario(4, "Diana", "555.666.777-88", 32, 555666777, "diana@example.com", "Feminino", "Atendente",3800.00));
        arvoreSalario.inserir(new Funcionario(5, "Eva", "999.888.777-66", 29, 999888777, "eva@example.com", "Feminino", "Atendente",3700.00));

        // Imprimindo a árvore antes da remoção
        System.out.println("Árvore antes da remoção:");
        arvoreSalario.imprimirArvore();

        // Removendo o funcionário "Carlos" (exemplo)
        Funcionario funcionarioRemover = new Funcionario(3, "Carlos", "111.222.333-44", 28, 111222333, "carlos@example.com", "Masculino", "Gerente", 4500.00);
        arvoreSalario.removerNo(funcionarioRemover);

        // Imprimindo a árvore após a remoção
        System.out.println("\nÁrvore após a remoção de Carlos:");
        arvoreSalario.imprimirArvore();
        String opcoes_menu_principal[] = {
            "Cadastrar Funcionário",
            "Listar Funcionários Pelo Salário",
            "Deletar Funcionário",
            "",
            "Visitantes",
            "Cadastrar Artefato",
            "Listar artefatos por valor",
            "Listar artefatos pela datação",
            "Deletar artefatos",
        };
        String opcoes_submenu[];
        int opcao, opcao_submenu;
        boolean is_valid;
        do {
            opcao = menu(opcoes_menu_principal, "Menu principal", "Sair do programa");
            opcao_submenu = 0;
            switch (opcao) {
                case 0 -> { // Cadastrar Funcionário

                }
                case 1 -> { // Listar Funcionários Pelo Salário
                    opcoes_submenu = new String[] {"Pré-Order", "Post-Order", "In-Order"};
                    is_valid = false;
                    do {
                        opcao_submenu = menu(opcoes_submenu, opcoes_menu_principal[opcao], "Voltar ao menu principal");
                        switch (opcao_submenu) {
                            case 0 -> { // Pré-Order
                                is_valid = true;
                            }
                            case 1 -> { // Post-Order
                                is_valid = true;
                            }
                            case 2 -> { // In-Order
                                is_valid = true;
                            }
                            case -1 -> {
//                                System.out.println("Voltando ao menu principal!");
                            }
                            default -> {
                                System.out.println("Opcao invalida!");
                                System.out.println("Pressione enter para continuar");
                                scanner.nextLine();
                            }
                        }
                    }while (opcao_submenu != -1 && !is_valid);
                }
                case 2 -> { // Deletar Funcionário

                }
                case 3 -> {

                }
                case 4 -> { // Visitantes
                    opcoes_submenu = new String[] {"Cadastrar Visitante", "Listar Visitantes pela Idade", "Deletar Visitante"};
                    is_valid = false;
                    do {
                        opcao_submenu = menu(opcoes_submenu, opcoes_menu_principal[opcao], "Voltar ao menu principal");
                        switch (opcao_submenu) {
                            case 0 -> { // Cadastrar Visitante
                                is_valid = true;
                            }
                            case 1 -> { // Listar Visitantes pela Idade
                                is_valid = true;
                            }
                            case 2 -> { // Deletar Visitante
                                is_valid = true;
                            }
                            case -1 -> {
//                                System.out.println("Voltando ao menu principal!");
                            }
                            default -> {
                                System.out.println("Opcao invalida!");
                                System.out.println("Pressione enter para continuar");
                                scanner.nextLine();
                            }
                        }
                    }while (opcao_submenu != -1 && !is_valid);

                }
                case 5 -> { // Cadastrar Artefato

                }
                case 6 -> { // Listar artefatos por valor
                    opcoes_submenu = new String[] {"Pré-Order", "Post-Order", "In-Order"};
                    is_valid = false;
                    do {
                        opcao_submenu = menu(opcoes_submenu, opcoes_menu_principal[opcao], "Voltar ao menu principal");
                        switch (opcao_submenu) {
                            case 0 -> { // Pré-Order
                                is_valid = true;
                            }
                            case 1 -> { // Post-Order
                                is_valid = true;
                            }
                            case 2 -> { // In-Order
                                is_valid = true;
                            }
                            case -1 -> {
//                                System.out.println("Voltando ao menu principal!");
                            }
                            default -> {
                                System.out.println("Opcao invalida!");
                                System.out.println("Pressione enter para continuar");
                                scanner.nextLine();
                            }
                        }
                    }while (opcao_submenu != -1 && !is_valid);
                }
                case 7 -> { // Listar artefatos pela datação
                    opcoes_submenu = new String[] {"Pré-Order", "Post-Order", "In-Order"};
                    is_valid = false;
                    do {
                        opcao_submenu = menu(opcoes_submenu, opcoes_menu_principal[opcao], "Voltar ao menu principal");
                        switch (opcao_submenu) {
                            case 0 -> { // Pré-Order
                                is_valid = true;
                            }
                            case 1 -> { // Post-Order
                                is_valid = true;
                            }
                            case 2 -> { // In-Order
                                is_valid = true;
                            }
                            case -1 -> {
//                                System.out.println("Voltando ao menu principal!");
                            }
                            default -> {
                                System.out.println("Opcao invalida!");
                                System.out.println("Pressione enter para continuar");
                                scanner.nextLine();
                            }
                        }
                    }while (opcao_submenu != -1 && !is_valid);
                }
                case 8 -> { // Deletar artefatos

                }
                case -1 -> {
                    System.out.println("Encerrando o programa!");
                }
                default -> {
                    System.out.println("Opcao invalida!");
                }
            }
            if(opcao != -1 && opcao_submenu != -1){
                System.out.println("Pressione enter para voltar ao menu principal");
                scanner.nextLine();
            }
        }while(opcao != -1);
    }
    public static int menu(String[] opcoes_menu_principal, String title, String go_back){
        System.out.println(title);
        String opcoes = "";
        for (int i = 0; i < opcoes_menu_principal.length; i++) {
            System.out.println((i+1) + " - " + opcoes_menu_principal[i]);
            opcoes += (i+1) + ";";
        }
        System.out.println("0 - " + go_back);
        opcoes += "0";
        System.out.print("Escolha uma opcao (" + opcoes + "): ");
        Scanner s = new Scanner(System.in);
        int opcao;
        try {
            opcao = s.nextInt();

        } catch (Exception e) {
            opcao = -1;
        }
        if (opcao == 0){
            System.out.println("Opcao ecolhida: 0 - " + go_back);
        }
        else if(opcao > 0 & opcao <= opcoes_menu_principal.length){
            System.out.println("Opcao ecolhida: " + opcoes_menu_principal[opcao-1]);
        }
        return opcao-1;
    }
}
