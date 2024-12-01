package gestaoTarefas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EquipeTest {

    private Equipe equipe;
    private Usuario usuario;

    @BeforeEach
    public void setUp() {
        equipe = new Equipe();
        usuario = new Usuario("João", "joao@empresa.com");
    }

    @Test
    public void testAdicionarMembro() {
        equipe.adicionarMembro(usuario);
        assertEquals(1, equipe.getMembros().size());
        assertEquals("João", equipe.getMembros().get(0).getNome());
    }

    @Test
    public void testRemoverMembro() {
        equipe.adicionarMembro(usuario);
        equipe.removerMembro(usuario);
        assertEquals(0, equipe.getMembros().size());
    }
}

