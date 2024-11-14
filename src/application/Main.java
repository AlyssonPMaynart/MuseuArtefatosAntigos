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
 }
}
