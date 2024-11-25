public class Tarefa {
    private String descricao;
    private String responsavel;
    private String prazo;
    private String prioridade;
    private String status;

    public Tarefa(String descricao, String prazo, String prioridade) {
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
        this.status = "Pendente";
    }

    public void atribuirResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public void alterarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }

    public String getResponsavel() {
        return responsavel;
    }
}

