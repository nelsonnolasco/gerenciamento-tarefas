package gestaoTarefas;

public class Historico {
    private String alteracao;

    public void registrarAlteracao(String alteracao) {
        this.alteracao = alteracao;
        System.out.println("Alteração registrada: " + alteracao);
    }
    public String getAlteracao() {
        return alteracao;
    }

    public void setAlteracao(String alteracao) {
        this.alteracao = alteracao;
    }
}

