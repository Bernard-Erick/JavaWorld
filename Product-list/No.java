public class No
{
    private Produto Dado;
    private No Proximo;
    public No(Produto dado)
    {
        Dado = dado;
    }
    public Produto getDado() {
        return Dado;
    }

    public void setDado(Produto dado) {
        Dado = dado;
    }

    public No getProximo() {
        return Proximo;
    }

    public void setProximo(No proximo) {
        Proximo = proximo;
    }
}
