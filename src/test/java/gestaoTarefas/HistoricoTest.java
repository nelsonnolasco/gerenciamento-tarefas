package gestaoTarefas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HistoricoTest {

    private Historico historico;

    @BeforeEach
    public void setUp() {
        historico = new Historico();
    }

    @Test
    public void testRegistrarAlteracao() {
        historico.registrarAlteracao("gestaoTarefas.Tarefa 'Desenvolver API' criada");
        // Verifique no console ou armazene em uma variável para validação se necessário
    }
}

