package gestaoTarefas;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nome;
    private String status;
    private List<Tarefa> tarefas;

    public Projeto(String nome) {
        this.nome = nome;
        this.status = "Em andamento";
        this.tarefas = new ArrayList<>();
    }

    public void criarProjeto() {
        // Lógica para criar projeto
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public String getNome() {
        return nome;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public String getStatus() {
        return status;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

