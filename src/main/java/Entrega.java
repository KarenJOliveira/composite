public class Entrega {
    private Caixa encomenda;

    public void setEncomenda(Caixa encomenda)
    {
        this.encomenda = encomenda;
    }

    public int getPrecoEncomenda()
    {
        if(this.encomenda == null)
        {
            throw new NullPointerException("Entrega sem encomenda");
        }
        return this.encomenda.calculaPreco();
    }
}
