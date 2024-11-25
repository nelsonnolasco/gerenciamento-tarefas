import java.util.List;

public class Relatorio {

    public void gerarRelatorioPorStatus(List<Projeto> projetos) {
        for (Projeto projeto : projetos) {
            System.out.println("Projeto: " + projeto.getNome());
            for (Tarefa tarefa : projeto.getTarefas()) {
                System.out.println("Tarefa: " + tarefa.getDescricao() + " | Status: " + tarefa.getStatus());
            }
        }
    }
}

