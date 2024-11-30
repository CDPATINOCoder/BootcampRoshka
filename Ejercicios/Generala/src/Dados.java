
import java.util.ArrayList;
import java.util.List;

public class Dados {
    private List<Integer> dados;

    public Dados(int a, int b, int c, int d, int e, int f) {
        this.dados.add(a);
        this.dados.add(b);
        this.dados.add(c);
        this.dados.add(d);
        this.dados.add(e);
    }

    public Dados () {
        dados = new ArrayList<>();
        tirarDados();
    }

    public void tirarDados() {
        for (int i = 0; i < 5; i++) {
            dados.add((int) (Math.random() * (7-1) + 1));
        }
    }

    public List<Integer> getDados() {
        return dados;
    }

    public void mostrarDados() {
        for (int i = 0; i < dados.size(); i++) {
            System.out.print(dados.get(i));
        }
    }
}
