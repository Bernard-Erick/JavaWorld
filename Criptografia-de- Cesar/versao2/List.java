

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
    public void Encriptografa(int cesar) //exibe a lista
    {
        No aux = primeiro;
        System.out.println("===== > Frase original: ");
        while(aux != null) 
        {
        	System.out.print(aux.getDado());
        	aux = aux.getProximo();
        }
        System.out.println();
        System.out.println("===== > Frase encriptada: ");
        aux = primeiro; //zerando a auxiliar
        int codigo; //aux do codigo da tecla
        while(aux != null) 
        {
        	codigo = (int)aux.getDado().charAt(0); //vai passar o valor em String da 1 pos q no caso é 0 para int// ex: 'A' == 65
        	if(codigo == 32) 
        	{
        		System.out.print((char)codigo);
        	}
        	else 
        	{
        		if(codigo+cesar > 90 && codigo >= 65 && codigo <= 90) // 65 >= X <= 90 || A ---- Z
        		{
        			codigo = codigo + cesar - 90 + 64;
        			System.out.print((char) codigo );
        		}
        		else if(codigo+cesar > 122 && codigo >= 97 && codigo <= 122) // 97 >= X <= 122 || a ---- z
        		{
        			codigo = codigo + cesar - 122 + 96;
        			System.out.print((char) codigo);
        		}
        		else 
        		{
        			System.out.print((char)(codigo+cesar));
        		}
        	}
        	aux = aux.getProximo();
        }
        
    }
    public void Descriptografa(int cesar)
    {
        No aux = primeiro;
        System.out.println("===== > Frase original: ");
        while(aux != null) 
        {
        	System.out.print(aux.getDado());
        	aux = aux.getProximo();
        }
        System.out.println();
        System.out.println("===== > Frase descriptografada: ");
        aux = primeiro; //zerando a auxiliar
        int codigo; //aux do codigo da tecla
        while(aux != null) 
        {
        	codigo = (int)aux.getDado().charAt(0); //vai passar o valor em String da 1 pos q no caso é 0 para int// ex: 'A' == 65
        	if(codigo == 32) 
        	{
        		System.out.print((char)codigo);
        	}
        	else 
        	{
        		if(codigo - cesar < 65 && codigo >= 65 && codigo <= 90) // 65 >= X <= 90 || A ---- Z
        		{
        			codigo = 90 - (64 - (codigo - cesar));
        			System.out.print((char)codigo );
        		}
        		else if(codigo - cesar < 97 && codigo >= 97 && codigo <= 122) // 97 >= X <= 122 || a ---- z
        		{
        			codigo = 122 - (96 - (codigo - cesar));
        			System.out.print((char) codigo);
        		}
        		else 
        		{
        			System.out.print((char)(codigo - cesar));
        		}
        	}
        	aux = aux.getProximo();
        }
        
    }
    

}
