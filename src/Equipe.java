import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private List<Usuario> membros;

    public Equipe() {
        this.membros = new ArrayList<>();
    }

    public void adicionarMembro(Usuario usuario) {
        membros.add(usuario);
    }

    public void removerMembro(Usuario usuario) {
        membros.remove(usuario);
    }

    public List<Usuario> getMembros() {
        return membros;
    }
}

