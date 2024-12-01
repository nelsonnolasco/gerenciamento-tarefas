package gestaoTarefas;

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

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
}

