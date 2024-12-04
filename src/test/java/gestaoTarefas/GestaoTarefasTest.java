package gestaoTarefas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GestaoTarefasTest {

    private GestaoTarefas gestaoTarefas;
    private Projeto projeto;

    @BeforeEach
    public void setUp() {
        gestaoTarefas = new GestaoTarefas();
        projeto = new Projeto("gestaoTarefas.Projeto de TI");
    }

    @Test
    public void testCriarTarefa() {
        gestaoTarefas.criarTarefa(projeto, "Desenvolver API", "2024-12-31", "Alta");
        assertEquals(0, projeto.getTarefas().size());
    }

    @Test
    public void testAtribuirResponsavel() {
        gestaoTarefas.criarTarefa(projeto, "Desenvolver API", "2024-12-31", "Alta");
        gestaoTarefas.atribuirTarefa(projeto.getTarefas().get(0), "João");
        assertEquals("João", projeto.getTarefas().get(0).getResponsavel());
    }

    @Test
    public void testAlterarPrioridade() {
        gestaoTarefas.criarTarefa(projeto, "Desenvolver API", "2024-12-31", "Alta");
        gestaoTarefas.alterarPrioridade(projeto.getTarefas().get(0), "Baixa");
        assertEquals("Baixa", projeto.getTarefas().get(0).getStatus());
    }
}

