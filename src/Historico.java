public class Historico {
    private String alteracao;

    public void registrarAlteracao(String alteracao) {
        this.alteracao = alteracao;
        System.out.println("Alteração registrada: " + alteracao);
    }
}

