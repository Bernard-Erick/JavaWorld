public class Produto
{
    private int numeroDoProduto;  //Ler
    private double precoDoProduto; //Ler
    private double precoComDesconto;
    public Produto(int num, double preco)
    {
        numeroDoProduto = num;
        precoDoProduto = preco;
    }
    public int getNumeroDoProduto() {
        return numeroDoProduto;
    }

    public void setNumeroDoProduto(int numeroDoProduto) {
        this.numeroDoProduto = numeroDoProduto;
    }

    public double getPrecoDoProduto() {
        return precoDoProduto;
    }

    public void setPrecoDoProduto(double precoDoProduto) {
        this.precoDoProduto = precoDoProduto;
    }
    public double CalculaDesconto()
    {
        if(precoDoProduto > 100)
        {
            return precoDoProduto - ((precoDoProduto * 15)/100);
        }
        else
        {
            return precoDoProduto - ((precoDoProduto * 5)/100);
        }
    }

    public double getPrecoComDesconto() {
        return precoComDesconto;
    }

    public void setPrecoComDesconto(double precoComDesconto) {
        this.precoComDesconto = precoComDesconto;
    }
}
