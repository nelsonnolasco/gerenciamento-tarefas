package gestaoTarefas;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criação de usuários
        Usuario usuario1 = new Usuario("João", "joao@empresa.com");
        Usuario usuario2 = new Usuario("Maria", "maria@empresa.com");

        // Criação de projeto e equipe
        Projeto projeto = new Projeto("gestaoTarefas.Projeto de TI");
        Equipe equipe = new Equipe();
        equipe.adicionarMembro(usuario1);
        equipe.adicionarMembro(usuario2);

        // Criação de tarefas
        GestaoTarefas gestaoTarefas = new GestaoTarefas();
        gestaoTarefas.criarTarefa(projeto, "Desenvolver API", "2024-12-31", "Alta");
        gestaoTarefas.criarTarefa(projeto, "Testar Sistema", "2024-12-15", "Média");

        // Atribuindo responsáveis
        projeto.getTarefas().get(0).atribuirResponsavel("João");
        projeto.getTarefas().get(1).atribuirResponsavel("Maria");

        // Alterando status e gerando relatório
        projeto.getTarefas().get(0).alterarStatus("Em andamento");
        Relatorio relatorio = new Relatorio();
        relatorio.gerarRelatorioPorStatus(List.of(projeto));

        // Notificações e configuração
        Notificacao notificacao = new Notificacao();
        notificacao.enviarNotificacao("gestaoTarefas.Tarefa 'Desenvolver API' atribuída a João.");
    }
}

