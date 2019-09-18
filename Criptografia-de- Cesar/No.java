public class No
{
    private String dado;
    private No proximo;
    private No anterior;

    public No(String dado)
    {
        this.dado = dado;
    }
    public No(No proximo,String dado)
    {
        this.proximo = proximo;
        this.dado = dado;
    }
    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
}
