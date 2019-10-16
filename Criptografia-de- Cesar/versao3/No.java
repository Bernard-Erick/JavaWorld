public class No
{
    private char dado;
    private No proximo;
    private No anterior;

    public No(char dado)
    {
        this.dado = dado;
    }
    public char getDado() {
        return dado;
    }

    public void setDado(char dado) {
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