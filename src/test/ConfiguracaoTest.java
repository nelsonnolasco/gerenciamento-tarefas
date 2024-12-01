package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConfiguracaoTest {

    private Configuracao configuracao;

    @BeforeEach
    public void setUp() {
        configuracao = new Configuracao();
    }

    @Test
    public void testAtualizarLimiteDeTempo() {
        configuracao.atualizarLimiteDeTempo(30);
    }

    @Test
    public void testAtivarNotificacoes() {
        configuracao.ativarNotificacoes();
        assertTrue(configuracao.notificacoesAtivas);
    }

    @Test
    public void testDesativarNotificacoes() {
        configuracao.desativarNotificacoes();
        assertFalse(configuracao.notificacoesAtivas);
    }
}

