import java.sql.SQLOutput;

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
            if(Character.codePointAt(frase,i) == 32)
            {
                System.out.print(" ");
            }
            else
            {
                if(Character.codePointAt(frase,i)+cesar > 90 && Character.codePointAt(frase,i) >= 65 && Character.codePointAt(frase,i) <=90) //MAISCULO
                {
                    int codigoNovo = ((Character.codePointAt(frase,i) + cesar)-90) +64;
                    codigo = (char)codigoNovo;
                    System.out.print(codigo);
                }
                else if(Character.codePointAt(frase,i)+cesar > 122 && Character.codePointAt(frase,i) >= 97 && Character.codePointAt(frase,i) <=122 )
                {
                    int codigoNovo = ((Character.codePointAt(frase,i) + cesar-122)) + 96;
                    codigo = (char) codigoNovo;
                    System.out.print(codigo);
                }
                else
                {
                    System.out.print(codigo);
                }
            }
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
            if(Character.codePointAt(frase,i) == 32)
            {
                System.out.print(" ");
            }
            else
            {
                if(Character.codePointAt(frase,i) - cesar < 65 && Character.codePointAt(frase,i) >= 65 && Character.codePointAt(frase,i) <=90) //MAISCULO
                {
                    int codigoNovo = 90 - (64 - Character.codePointAt(frase,i)-cesar);
                    codigo = (char) codigoNovo;
                    System.out.print(codigo);
                }
                else if(Character.codePointAt(frase,i)-cesar <97 && Character.codePointAt(frase,i) >= 97 && Character.codePointAt(frase,i) <= 122) //MINUSCULO
                {
                    int codigoNovo = 122 - (96 - Character.codePointAt(frase,i)-cesar);
                    codigo = (char) codigoNovo;
                    System.out.println(codigo);
                }
                else
                {
                    System.out.print(codigo);
                }
            }
            i++;
            aux = aux.getProximo();
        }
        System.out.println();
    }

}
