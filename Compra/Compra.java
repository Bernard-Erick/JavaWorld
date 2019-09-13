public class Compra
{
    private Produto produto;
    private Cliente cliente;
    private int quantidade;
    private double valorTotal;

    public Compra(Produto p,Cliente c,int q)
    {
        produto = p;
        cliente = c;
        quantidade = q;
    }
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public double CalculaValorTotal()
    {
        double precoFinal;
        if(cliente.DescontoAdicional() == true) //O cliente é mulher
        {
            precoFinal = produto.CalculaDesconto() - ((produto.getPrecoDoProduto()*5)/100);
            return quantidade * precoFinal;
        }
        else // o cliente é homem
        {
            precoFinal = produto.CalculaDesconto();
            return quantidade * precoFinal;
        }
    }
}
