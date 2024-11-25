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
}

