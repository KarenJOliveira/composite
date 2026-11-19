import java.util.ArrayList;
import java.util.List;

public class Pedido extends Caixa{
    private List<Caixa> caixas;

    public Pedido(String descricao)
    {
        super(descricao);
        this.caixas = new ArrayList<Caixa>();
    }

    public void addCaixa(Caixa caixa)
    {
        this.caixas.add(caixa);
    }

    public int calculaPreco()
    {
        int total = 0;
        for(Caixa caixa : caixas)
        {
            total += caixa.calculaPreco();
        }
        return total;
    }
}
