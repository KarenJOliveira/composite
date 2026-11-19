public class Produto extends Caixa{
    private int preco;

    public Produto(String descricao, int preco)
    {
        super(descricao);
        this.preco = preco;
    }

    public int getPreco() {
        return preco;
    }

    @Override
    public int calculaPreco() {
        return this.getPreco();
    }
}
