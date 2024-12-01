package gestaoTarefas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {

    private Usuario usuario;

    @BeforeEach
    public void setUp() {
        usuario = new Usuario("João", "joao@empresa.com");
    }

    @Test
    public void testCriarUsuario() {
        assertNotNull(usuario);
        assertEquals("João", usuario.getNome());
        assertEquals("joao@empresa.com", usuario.getEmail());
    }
}

