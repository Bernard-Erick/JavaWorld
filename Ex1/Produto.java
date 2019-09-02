public class Produto
{
    private String descricao;
    private Tipo tipo;
    private double preco;
    private double imposto;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    public Tipo getTipo()
    {
        return tipo;
    }
    public void setTipo(Tipo t)
    {
        tipo = t;
        setImposto(preco * tipo.getPercentual() / 100);
    }
    public double calculaPrecoFinal()
    {
        return preco + imposto;
    }
}