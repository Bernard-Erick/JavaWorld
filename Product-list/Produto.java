public class Produto
{
    private int Codigo;
    private double Preco;
    private int Quantidade;
    public Produto(int codigo, double preco, int quantidade)
    {
        setCodigo(codigo);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }
}
