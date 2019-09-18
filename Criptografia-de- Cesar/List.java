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
    public void AddInit(String valor)
    {
        if(primeiro == null)
        {
            No novo = new No(valor);
            primeiro = novo;
            ultimo = novo;
        }
        else
        {
            No novo = new No(this.primeiro, valor);
            primeiro.setAnterior(novo);
            primeiro = novo;
        }
        tamanho++;
    }
    public void Add(String valor)
    {
        if(primeiro == null)
        {
            No novo = new No(valor);
            primeiro = novo;
            ultimo = novo;
        }
        else
        {
            No novo = new No(valor);
            this.ultimo.setProximo(novo);
            novo.setAnterior(this.ultimo);
            this.ultimo = novo;
        }
        tamanho++;
    }
    public void Encriptografa(String frase,int cesar) //exibe a lista
    {
        No aux = primeiro;
        int i = 0;
        System.out.println("===== > Frase original: "+frase);
        System.out.println();
        System.out.print("===== > Frase encriptografada: ");
        while (aux != null)
        {
            char codigo = (char) (Character.codePointAt(frase,i)+cesar);
            System.out.print(codigo);
            i++;
            aux = aux.getProximo();
        }
        System.out.println();
    }
    public void Descriptografa(String frase,int cesar) //exibe a lista
    {
        No aux = primeiro;
        int i = 0;
        System.out.println("Frase original: "+frase);
        System.out.println();
        System.out.print("Frase encriptografada: ");
        while (aux != null)
        {
            char codigo = (char) (Character.codePointAt(frase,i)-cesar);
            System.out.print(codigo);
            i++;
            aux = aux.getProximo();
        }
        System.out.println();
    }

}
