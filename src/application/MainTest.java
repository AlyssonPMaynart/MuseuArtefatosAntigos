package application;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    private static final String EXPECTED_OUTPUTS =
            "Menu principal\n" +
                    "1 - Cadastrar Funcionário\n" +
                    "2 - Listar Funcionários Pelo Salário\n" +
                    "3 - Deletar Funcionário\n" +
                    "4 - Eventos do dia\n" +
                    "5 - Visitantes\n" +
                    "6 - Cadastrar Artefato\n" +
                    "7 - Listar artefatos por valor\n" +
                    "8 - Listar artefatos pela datação\n" +
                    "9 - Deletar artefatos\n" +
                    "0 - Sair do programa\n" +
                    "Escolha uma opcao (1;2;3;4;5;6;7;8;9;0): \n" +
                    "Opcao ecolhida: 0 - Sair do programa\n" +
                    "Encerrando o programa!";

    @BeforeEach
    public void redirectSystemOutStream() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void resetSystemOutStream() {
        System.setOut(standardOut);
    }

    @Test
    public void shouldDisplayMainMenuOptions() {
        String[] args = new String[1];
        System.setIn(getClass().getResourceAsStream("/testInputs.txt"));
        Main.main(args);
        assertEquals(EXPECTED_OUTPUTS.trim(), outputStreamCaptor.toString().trim());
    }
}