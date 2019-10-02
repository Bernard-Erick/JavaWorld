
public class Stack
{
	private No primeiro;
	private No ultimo;
	private int tamanho;
	private int ParEsquerda;
	private int ParDireita;
	public Stack() 
	{
		primeiro = null;
		ultimo = null;
		tamanho = 0;
	}

	public void Push(String valor) // 5  6
	{
		No novo = new No(valor);
		if(valor.equals("("))
		{
			ParEsquerda++;
		}
		if(valor.equals(")")) 
		{
			ParDireita++;
		} 
		if(primeiro == null) 
		{
			primeiro = novo;
			ultimo = novo;
		}
		else 
		{
			ultimo.setProximo(novo);
			novo.setAnterior(ultimo);
			ultimo = novo;
		}
		tamanho++;
	}	
	public void Pop() 
	{
		No aux = ultimo;
		aux.getAnterior().setProximo(null);
		ultimo = aux.getAnterior();
		tamanho--;
	}
	public void GetPeloUltimo()
	{
		No aux = ultimo;
		int i = tamanho-1;
		while(aux != null) 
		{
			System.out.println("Dado "+i+": "+aux.getDado());
			i--;
			aux = aux.getAnterior();
		}
		//System.out.println("Parenteses a esquerda: "+ParEsquerda);
		//System.out.println("Parenteses a direita: "+ParDireita);

	}
	public void analisaCaso() //TESTES
	{
		if(ParEsquerda == ParDireita)
		{
			No aux1 = primeiro;
			No aux2 = ultimo;
			int i = 0;
			boolean deuMerda = false;
			while(!aux1.getDado().equals("(")) 
			{
				if(aux1.getDado().equals(")")) 
				{
					deuMerda = true;
					System.out.println("ERRO na posição: "+ i);
					System.out.println("EXPRESSÃO INVÁLIDA!");
					break;
				}
				aux1 = aux1.getProximo();
				i++;
			}
			int j = tamanho-1;
			while(!aux2.getDado().equals(")")) 
			{
				if(aux2.getDado().equals("(")) 
				{
					deuMerda = true;
					System.out.println("ERRO na posição: "+j);
					System.out.println("EXPRESSÃO INVÁLIDA!");
					break;
				}
				aux2 = aux2.getAnterior();
				j--;
			}
			if(deuMerda == false) 
			{
				System.out.println("Expressão correta!");
			}
		}
		else 
		{
			System.out.println("Parênteses insuficientes!");
			if(ParDireita < ParEsquerda) 
			{
				System.out.println("Falta um ')'.");
			}
			else if(ParDireita > ParEsquerda) 
			{
				System.out.println("Falta um '('.");
			}
			System.out.println("EXPRESSÃO INVÁLIDA!");
		}
	}
	public void zerarLista() 
	{
		No aux = primeiro;
		No aux2 = ultimo;
		while(aux != null) 
		{
			aux.setProximo(null);
			aux2.setAnterior(null);
			aux = aux.getProximo();
			aux2 = aux2.getAnterior();
			tamanho--;
		}
		primeiro = null;
		ultimo = null;
		System.out.println("Lista vazia!");
	}
	public boolean Find(String valor) 
	{
		No aux = primeiro;
		boolean existe = false;
		while(aux != null)
		{
			if(valor == aux.getDado())
			{
				existe = true;
				break;
			}
			aux = aux.getProximo();
		}
		return existe;
	}
	public void FindPos(int pos)
	{
		No aux = primeiro;
		int i = 0;
		if(pos >= 0 && pos < tamanho) 
		{
			while(i < pos) 
			{
				aux = aux.getProximo();
				i++;
			}
			if(aux != null)
			{
				System.out.println(aux.getDado());
			}
		}
		else 
		{
			System.out.println("Posição não existente!");
		}
	}
	public boolean isNull() 
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
	public int Tamanho() 
	{
		return tamanho;
	}
}
