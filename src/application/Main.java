package application;

import entities.Artefato;
import entities.Evento;
import entities.Funcionario;
import entities.Visitante;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Artefato> artefatos = new ArrayList<>();
        List<Funcionario> funcionarios = new ArrayList<>();
        List<Visitante> visitantes = new ArrayList<>();

        ArvoreSalario arvoreSalario = new ArvoreSalario();
        arvoreSalario.inserir(new Funcionario(1, "Alice", "123.456.789-00", 30, 123456789, "alice@example.com", "Feminino", "Zelador",3500.00));
        arvoreSalario.inserir(new Funcionario(2, "Bob", "987.654.321-00", 25, 987654321, "bob@example.com", "Masculino","Historiador" ,4000.00));
        arvoreSalario.inserir(new Funcionario(3, "Carlos", "111.222.333-44", 28, 111222333, "carlos@example.com", "Masculino", "Gerente",4500.00));
        arvoreSalario.inserir(new Funcionario(4, "Diana", "555.666.777-88", 32, 555666777, "diana@example.com", "Feminino", "Atendente",3800.00));
        arvoreSalario.inserir(new Funcionario(5, "Eva", "999.888.777-66", 29, 999888777, "eva@example.com", "Feminino", "Atendente",3700.00));
        arvoreSalario.inserir(new Funcionario(6, "Bruno", "987.654.321-00", 28, 987654321, "bruno@example.com", "Masculino", "Segurança", 4000.00));
        arvoreSalario.inserir(new Funcionario(7, "Carla", "456.789.123-00", 35, 456789123, "carla@example.com", "Feminino", "Recepcionista", 3200.00));
        arvoreSalario.inserir(new Funcionario(8, "Diego", "321.654.987-00", 40, 321654987, "diego@example.com", "Masculino", "Historiador", 5000.00));
        arvoreSalario.inserir(new Funcionario(9, "Eva", "654.321.789-00", 27, 654321789, "eva@example.com", "Feminino", "Zelador", 2800.00));
        arvoreSalario.inserir(new Funcionario(10, "Fernando", "789.123.456-00", 33, 789123456, "fernando@example.com", "Masculino", "Historiador", 4500.00));

        ArvoreArtefatoData arvoreArtefatoData = new ArvoreArtefatoData();
        arvoreArtefatoData.inserir(new Artefato(1, "Monalisa", "Quadro muito famoso", "Tinta a óleo", "Itália", 1503, "Conservado", 100));
        arvoreArtefatoData.inserir(new Artefato(2, "O Pensador", "Escultura icônica de um homem pensativo", "Bronze", "França", 1902, "Conservado", 90));
        arvoreArtefatoData.inserir(new Artefato(3, "A Noite Estrelada", "Pintura famosa de uma noite estrelada", "Óleo sobre tela", "Países Baixos", 1889, "Conservado", 95));
        arvoreArtefatoData.inserir(new Artefato(4, "Busto de Nefertiti", "Escultura antiga da rainha egípcia Nefertiti", "Pedra calcária", "Egito", 1345, "Fragilizado", 85));
        arvoreArtefatoData.inserir(new Artefato(5, "Vênus de Milo", "Escultura famosa da deusa Vênus", "Mármore", "Grécia", -130, "Conservado", 92));
        arvoreArtefatoData.inserir(new Artefato(6, "Guernica", "Pintura famosa retratando o bombardeio de Guernica", "Óleo sobre tela", "Espanha", 1937, "Conservado", 98));
        arvoreArtefatoData.inserir(new Artefato(7, "Davi", "Escultura renascentista de Davi, de Michelangelo", "Mármore", "Itália", 1504, "Conservado", 99));
        arvoreArtefatoData.inserir(new Artefato(8, "A Persistência da Memória", "Pintura surrealista de relógios derretendo", "Óleo sobre tela", "Espanha", 1931, "Conservado", 92));
        arvoreArtefatoData.inserir(new Artefato(9, "Cabeça de um Rei", "Escultura de bronze representando um rei da cultura Ifé", "Bronze", "Nigéria", 1300, "Conservado", 80));
        arvoreArtefatoData.inserir(new Artefato(10, "A Grande Onda de Kanagawa", "Gravura em madeira de uma onda gigantesca", "Tinta sobre papel", "Japão", 1831, "Conservado", 88));
        arvoreArtefatoData.inserir(new Artefato(11, "Vitral da Rosa", "Vitral gótico de Notre-Dame", "Vidro colorido", "França", 1250, "Conservado", 94));
        arvoreArtefatoData.inserir(new Artefato(12, "Disco de Nebra", "Artefato arqueológico representando o cosmos", "Bronze e ouro", "Alemanha", -1600, "Conservado", 76));
        arvoreArtefatoData.inserir(new Artefato(13, "Túmulo de Qin Shi Huang", "Escultura do Exército de Terracota", "Terracota", "China", -210, "Conservado", 99));
        arvoreArtefatoData.inserir(new Artefato(14, "Máscara de Tutancâmon", "Máscara funerária do faraó Tutancâmon", "Ouro e pedras preciosas", "Egito", -1323, "Conservado", 100));
        arvoreArtefatoData.inserir(new Artefato(15, "Código de Hamurabi", "Estela com leis antigas da Babilônia", "Diorito", "Mesopotâmia", -1754, "Conservado", 90));

        ArvoreArtefatoValor arvoreArtefatoValor = new ArvoreArtefatoValor();
        arvoreArtefatoValor.inserir(new Artefato(1, "Monalisa", "Quadro muito famoso", "Tinta a óleo", "Itália", 1503, "Conservado", 100));
        arvoreArtefatoValor.inserir(new Artefato(2, "O Pensador", "Escultura icônica de um homem pensativo", "Bronze", "França", 1902, "Conservado", 90));
        arvoreArtefatoValor.inserir(new Artefato(3, "A Noite Estrelada", "Pintura famosa de uma noite estrelada", "Óleo sobre tela", "Países Baixos", 1889, "Conservado", 95));
        arvoreArtefatoValor.inserir(new Artefato(4, "Busto de Nefertiti", "Escultura antiga da rainha egípcia Nefertiti", "Pedra calcária", "Egito", 1345, "Fragilizado", 85));
        arvoreArtefatoValor.inserir(new Artefato(5, "Vênus de Milo", "Escultura famosa da deusa Vênus", "Mármore", "Grécia", -130, "Conservado", 92));
        arvoreArtefatoValor.inserir(new Artefato(6, "Guernica", "Pintura famosa retratando o bombardeio de Guernica", "Óleo sobre tela", "Espanha", 1937, "Conservado", 98));
        arvoreArtefatoValor.inserir(new Artefato(7, "Davi", "Escultura renascentista de Davi, de Michelangelo", "Mármore", "Itália", 1504, "Conservado", 99));
        arvoreArtefatoValor.inserir(new Artefato(8, "A Persistência da Memória", "Pintura surrealista de relógios derretendo", "Óleo sobre tela", "Espanha", 1931, "Conservado", 92));
        arvoreArtefatoValor.inserir(new Artefato(9, "Cabeça de um Rei", "Escultura de bronze representando um rei da cultura Ifé", "Bronze", "Nigéria", 1300, "Conservado", 80));
        arvoreArtefatoValor.inserir(new Artefato(10, "A Grande Onda de Kanagawa", "Gravura em madeira de uma onda gigantesca", "Tinta sobre papel", "Japão", 1831, "Conservado", 88));
        arvoreArtefatoValor.inserir(new Artefato(11, "Vitral da Rosa", "Vitral gótico de Notre-Dame", "Vidro colorido", "França", 1250, "Conservado", 94));
        arvoreArtefatoValor.inserir(new Artefato(12, "Disco de Nebra", "Artefato arqueológico representando o cosmos", "Bronze e ouro", "Alemanha", -1600, "Conservado", 76));
        arvoreArtefatoValor.inserir(new Artefato(13, "Túmulo de Qin Shi Huang", "Escultura do Exército de Terracota", "Terracota", "China", -210, "Conservado", 99));
        arvoreArtefatoValor.inserir(new Artefato(14, "Máscara de Tutancâmon", "Máscara funerária do faraó Tutancâmon", "Ouro e pedras preciosas", "Egito", -1323, "Conservado", 100));
        arvoreArtefatoValor.inserir(new Artefato(15, "Código de Hamurabi", "Estela com leis antigas da Babilônia", "Diorito", "Mesopotâmia", -1754, "Conservado", 90));

        ArvoreVisitante arvoreVisitante = new ArvoreVisitante();
        arvoreVisitante.inserir(new Visitante("Matheus", "mat@seuemail.com",4,24,"O museu está bem organizado e limpo!"));
        arvoreVisitante.inserir(new Visitante("Ana", "ana@exemplo.com", 5, 30, "Ótimo acervo! Adorei a visita."));
        arvoreVisitante.inserir(new Visitante("Bruno", "bruno@exemplo.com", 4, 22, "Muito interessante, especialmente as esculturas."));
        arvoreVisitante.inserir(new Visitante("Carla", "carla@exemplo.com", 3, 27, "Gostei do ambiente, mas poderia ter mais informações."));
        arvoreVisitante.inserir(new Visitante("Diego", "diego@exemplo.com", 5, 35, "Experiência incrível, vou voltar com certeza!"));
        arvoreVisitante.inserir(new Visitante("Evelyn", "evelyn@exemplo.com", 4, 29, "A exposição de arte moderna foi maravilhosa."));
        arvoreVisitante.inserir(new Visitante("Fábio", "fabio@exemplo.com", 2, 19, "Achei interessante, mas poderia ser mais interativo."));
        arvoreVisitante.inserir(new Visitante("Gabriela", "gabriela@exemplo.com", 5, 31, "As obras são impressionantes, especialmente as pinturas!"));
        arvoreVisitante.inserir(new Visitante("Henrique", "henrique@exemplo.com", 3, 28, "Achei legal, mas o museu estava um pouco cheio."));
        arvoreVisitante.inserir(new Visitante("Isabela", "isabela@exemplo.com", 4, 26, "Gostei muito da visita guiada."));
        arvoreVisitante.inserir(new Visitante("João", "joao@exemplo.com", 5, 32, "Foi uma experiência muito enriquecedora!"));

        List<Evento> eventos = new ArrayList<>();
        eventos.add(new Evento("Exposição de Arte Egípcia", LocalDate.of(2024, 12, 5), "Uma coleção de artefatos egípcios antigos.", "Sala 1"));
        eventos.add(new Evento("Palestra sobre a Idade Média", LocalDate.of(2024, 12, 10), "Uma palestra sobre a vida e cultura na Idade Média.", "Auditório"));
        eventos.add(new Evento("Oficina de Conservação de Artefatos", LocalDate.of(2025, 1, 20), "Oficina prática sobre conservação de artefatos antigos.", "Laboratório"));
        eventos.add(new Evento("Exposição de Arte Romana", LocalDate.of(2025, 2, 15), "Uma coleção de artefatos romanos antigos.", "Sala 2"));



        String opcoes_menu_principal[] = {
            "Cadastrar Funcionário",
            "Listar Funcionários Pelo Salário",
            "Deletar Funcionário",
            "Eventos do dia",
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
                    int idFuncionario;
                    idFuncionario = arvoreSalario.contadorIDT();
                    System.out.println("Nome do Funcionario: ");
                    String nomeFuncionario = scanner.next();
                    System.out.println("CPF do Funcionario: ");
                    String cpf = scanner.next();
                    System.out.println("Idade do Funcionario: ");
                    int idade= scanner.nextInt();
                    System.out.print("Telefone do Funcionario: ");
                    int telefone= scanner.nextInt();
                    System.out.println("Email do Funcionario: ");
                    String email= scanner.next();
                    System.out.println("Sexo do Funcionario: ");
                    String sexo= scanner.next();
                    System.out.println("Cargo do Funcionario: ");
                    String cargo= scanner.next();
                    System.out.println("Salario do Funcionario: ");
                    Double salario= scanner.nextDouble();
                    arvoreSalario.inserir(new Funcionario(idFuncionario,nomeFuncionario,cpf,idade,telefone,email,sexo,cargo,salario));
                }
                case 1 -> { // Listar Funcionários Pelo Salário
                    opcoes_submenu = new String[] {"Pré-Order", "Post-Order", "In-Order","Arvore Funcionários"};
                    is_valid = false;
                    do {
                        opcao_submenu = menu(opcoes_submenu, opcoes_menu_principal[opcao], "Voltar ao menu principal");
                        switch (opcao_submenu) {
                            case 0 -> { // Pré-Order
                                arvoreSalario.preorder();
                                is_valid = true;
                            }
                            case 1 -> { // Post-Order
                                arvoreSalario.postorder();
                                is_valid = true;
                            }
                            case 2 -> { // In-Order
                                arvoreSalario.inorder();
                                is_valid = true;
                            }
                            case 3 -> { // Arvore
                                arvoreSalario.imprimirArvore();
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
                    System.out.println("Digite o ID do funcionario que deseja deletar (Caso não saiba, listar a arvore): ");
                    int idComparativo = scanner.nextInt();

                    if (!arvoreSalario.buscar(idComparativo)) {
                        System.out.println("Funcionário encontrado na árvore. Removendo...");
                        Funcionario tempFuncionario = new Funcionario(idComparativo, "", "", 0, 0, "", "", "", 0.0);
                        arvoreSalario.removerNo(tempFuncionario); // Cria um Funcionario temporário para o método remover
                        System.out.println("Funcionário removido com sucesso.");
                    } else {
                        System.out.println("Funcionário não encontrado na árvore.");
                    }

                }
                case 3 -> { //Eventos do Dia
                    // Exibindo os detalhes dos eventos
                    for (Evento evento : eventos) {
                        evento.exibirDetalhes();
                        System.out.println();
                    }
                }
                case 4 -> { // Visitantes
                    opcoes_submenu = new String[] {"Cadastrar Visitante", "Listar Visitantes pela Idade", "Deletar Visitante"};
                    is_valid = false;
                    do {
                        opcao_submenu = menu(opcoes_submenu, opcoes_menu_principal[opcao], "Voltar ao menu principal");
                        switch (opcao_submenu) {
                            case 0 -> { // Cadastrar Visitante
                                System.out.println("Nome do Visitante: ");
                                String nome= scanner.next();
                                System.out.println("Contato do Visitante: ");
                                String contato= scanner.next();
                                System.out.println("Visitas do Visitante: ");
                                int visitas= scanner.nextInt();
                                System.out.println("Idade do Visitante: ");
                                int idade= scanner.nextInt();
                                System.out.println("Feedback do Visitante: ");
                                String ultimoFeedback= scanner.next();
                                arvoreVisitante.inserir(new Visitante(nome,contato,visitas,idade,ultimoFeedback));

                                is_valid = true;
                            }
                            case 1 -> { // Listar Visitantes pela Idade!ok
                                arvoreVisitante.inorder();
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
                    int id= arvoreArtefatoData.contadorIDT(); //(identificador único para cada artefato)
                    System.out.println("Nome do Artefato: ");
                    String nomeArtefato =scanner.next();//(nome do artefato)
                    System.out.println("Descrição do Artefato: ");
                    String descricao= scanner.next(); //(descrição detalhada do artefato)
                    System.out.println("Material do Artefato: ");
                    String material= scanner.next();//(material do qual o artefato é feito)
                    System.out.println("Origem do Artefato: ");
                    String origem= scanner.next(); //(local de origem do artefato)
                    System.out.println("Datação do Artefato: ");
                    int data= scanner.nextInt();// (data estimada ou precisa de criação do artefato)
                    System.out.println("Estado de conservação do Artefato: ");
                    String estadoConservacao= scanner.next(); //(bom, regular, ruim)
                    System.out.println("Valor histórico do Artefato: ");
                    int valorHistorico = scanner.nextInt(); // (descrição do valor histórico do artefato)
                    arvoreArtefatoData.inserir(new Artefato(id,nomeArtefato,descricao,material,origem,data,estadoConservacao,valorHistorico));
                    arvoreArtefatoValor.inserir(new Artefato(id,nomeArtefato,descricao,material,origem,data,estadoConservacao,valorHistorico));

                }
                case 6 -> { // Listar artefatos por valor
                    opcoes_submenu = new String[] {"Pré-Order", "Post-Order", "In-Order","Arvore Artefatos"};
                    is_valid = false;
                    do {
                        opcao_submenu = menu(opcoes_submenu, opcoes_menu_principal[opcao], "Voltar ao menu principal");
                        switch (opcao_submenu) {
                            case 0 -> { // Pré-Order
                                arvoreArtefatoValor.preorder();
                                is_valid = true;
                            }
                            case 1 -> { // Post-Order
                                arvoreArtefatoValor.postorder();
                                is_valid = true;
                            }
                            case 2 -> { // In-Order
                                arvoreArtefatoValor.inorder();
                                is_valid = true;
                            }
                            case 3 -> { // Arvore
                                arvoreArtefatoData.imprimirArvore();
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
                                arvoreArtefatoData.preorder();
                                is_valid = true;
                            }
                            case 1 -> { // Post-Order
                                arvoreArtefatoData.postorder();
                                is_valid = true;
                            }
                            case 2 -> { // In-Order
                                arvoreArtefatoData.inorder();
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
