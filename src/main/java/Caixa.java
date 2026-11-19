public abstract class Caixa {
    private String descricao;

    public Caixa(String descricao)
    {
        this.descricao = descricao;
    }
    public abstract int calculaPreco();
}
