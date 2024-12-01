package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NotificacaoTest {

    private Notificacao notificacao;

    @BeforeEach
    public void setUp() {
        notificacao = new Notificacao();
    }

    @Test
    public void testEnviarNotificacao() {
        notificacao.enviarNotificacao("gestaoTarefas.Tarefa 'Desenvolver API' atribuída a João.");
    }
}
