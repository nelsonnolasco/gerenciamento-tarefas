package gestaoTarefas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TarefaTest {

    private Tarefa tarefa;

    @BeforeEach
    public void setUp() {
        tarefa = new Tarefa("Desenvolver API", "2024-12-31", "Alta");
    }

    @Test
    public void testCriarTarefa() {
        assertNotNull(tarefa);
        assertEquals("Desenvolver API", tarefa.getDescricao());
        assertEquals("2024-12-31", tarefa.getPrazo());
        assertEquals("Alta", tarefa.getPrioridade());
        assertEquals("Pendente", tarefa.getStatus());
    }

    @Test
    public void testAlterarStatus() {
        tarefa.alterarStatus("Em andamento");
        assertEquals("Em andamento", tarefa.getStatus());
    }

    @Test
    public void testAtribuirResponsavel() {
        tarefa.atribuirResponsavel("João");
        assertEquals("João", tarefa.getResponsavel());
    }

    @Test
    public void testSetters(){
        tarefa.setDescricao("Desenvolver API REST");
        tarefa.setPrazo("2024-12-30");
        tarefa.setPrioridade("Média");
        tarefa.setStatus("Concluída");
        tarefa.setResponsavel("Maria");

        assertEquals("Desenvolver API REST", tarefa.getDescricao());
        assertEquals("2024-12-30", tarefa.getPrazo());
        assertEquals("Média", tarefa.getPrioridade());
        assertEquals("Concluída", tarefa.getStatus());
        assertEquals("Maria", tarefa.getResponsavel());
    }
}
