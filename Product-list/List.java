public class List
{
    private No primeiro;
    private No ultimo;
    private int tamanho;

    public List()
    {
        primeiro = null;
        ultimo = null;
        tamanho = 0;
    }
    public void AddInit(Produto valor) //adiciona no inicio
    {
        No novo = new No(valor);
        if(primeiro == null)
        {
            primeiro = novo;
            ultimo = novo;
        }
        else
        {
            novo.setProximo(primeiro);
            primeiro = novo;
        }
        tamanho++;
    }
    public void Add(Produto valor) //adiciona no fim
    {
        No novo = new No(valor);
        if(primeiro == null)
        {
            primeiro = novo;
            ultimo = novo;
        }
        else
        {
            ultimo.setProximo(novo);
            ultimo = novo;
        }
    }
    public void Get() //exibe a lista
    {
        No aux = primeiro;

        while (aux != null)
        {
            System.out.println("Dado:"+ aux.getDado().getCodigo() +", "+ aux.getDado().getPreco() +", "+ aux.getDado().getQuantidade() +" ");
            System.out.println();
            aux = aux.getProximo();
        }
    }
    public boolean isVoid()
    {
        if(primeiro == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int getTamanho() //pode ser usado para medidas de tamanho
    {
        return tamanho;
    }
    public void setTamanho(int tamanho)
    {
        this.tamanho = tamanho;
    }
    public No getPrimeiro()
    {
        return primeiro;
    }
}

