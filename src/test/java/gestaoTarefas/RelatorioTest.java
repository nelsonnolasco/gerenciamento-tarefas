package gestaoTarefas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

public class RelatorioTest {

    private Relatorio relatorio;
    private Projeto projeto;
    private Tarefa tarefa;

    @BeforeEach
    public void setUp() {
        relatorio = new Relatorio();
        projeto = new Projeto("gestaoTarefas.Projeto de TI");
        tarefa = new Tarefa("Desenvolver API", "2024-12-31", "Alta");
        projeto.adicionarTarefa(tarefa);
    }

    @Test
    public void testGerarRelatorioPorStatus() {
        tarefa.alterarStatus("Em andamento");
        relatorio.gerarRelatorioPorStatus(List.of(projeto));
    }

    @Test
    public void testGerarRelatorioPorPrazo() {
        relatorio.gerarRelatorioPorStatus(List.of(projeto));
    }
}

