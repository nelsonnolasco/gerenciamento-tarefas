package gestaoTarefas;

public class GestaoTarefas {

    public void criarTarefa(Projeto projeto, String descricao, String prazo, String prioridade) {
        Tarefa tarefa = new Tarefa(descricao, prazo, prioridade);
        projeto.adicionarTarefa(tarefa);
    }

    public void atribuirTarefa(Tarefa tarefa, String responsavel) {
        tarefa.atribuirResponsavel(responsavel);
    }

    public void alterarPrioridade(Tarefa tarefa, String novaPrioridade) {
        tarefa.alterarStatus(novaPrioridade);
    }
}
