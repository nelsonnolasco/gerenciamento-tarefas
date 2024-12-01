package gestaoTarefas;

public class Configuracao {
    private int limiteTempo;
    private boolean notificacoesAtivas;

    public void atualizarLimiteDeTempo(int novoLimite) {
        this.limiteTempo = novoLimite;
    }

    public void ativarNotificacoes() {
        this.notificacoesAtivas = true;
    }

    public void desativarNotificacoes() {
        this.notificacoesAtivas = false;
    }

    // Getter for limiteTempo
    public int getLimiteTempo() {
        return limiteTempo;
    }

    // Getter for notificacoesAtivas
    public boolean getNotificacoesAtivas() {
        return notificacoesAtivas;
    }
}