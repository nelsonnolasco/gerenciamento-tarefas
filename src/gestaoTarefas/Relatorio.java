package gestaoTarefas;

import java.util.List;

public class Relatorio {

    public void gerarRelatorioPorStatus(List<Projeto> projetos) {
        for (Projeto projeto : projetos) {
            System.out.println("gestaoTarefas.Projeto: " + projeto.getNome());
            for (Tarefa tarefa : projeto.getTarefas()) {
                System.out.println("gestaoTarefas.Tarefa: " + tarefa.getDescricao() + " | Status: " + tarefa.getStatus());
            }
        }
    }
}

