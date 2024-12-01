package gestaoTarefas;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProjetoTest {
    private Projeto projeto;

    @BeforeEach
    public void setUp() {
        projeto = new Projeto("gestaoTarefas.Projeto de TI");
    }

    @Test
    public void testCriarProjeto() {
        assertNotNull(projeto);
        assertEquals("gestaoTarefas.Projeto de TI", projeto.getNome());
        assertEquals("Em andamento", projeto.getStatus());
        assertTrue(projeto.getTarefas().isEmpty());
    }

    @Test
    public void testAdicionarTarefa() {
        Tarefa tarefa = new Tarefa("Desenvolver API", "2024-12-31", "Alta");
        projeto.adicionarTarefa(tarefa);
        assertEquals(1, projeto.getTarefas().size());
        assertEquals("Desenvolver API", projeto.getTarefas().get(0).getDescricao());
    }

    @Test
    public void testAtualizarStatus() {
        projeto.atualizarStatus("Concluído");
        assertEquals("Concluído", projeto.getStatus());
    }
}
