
public class  No 
{
	private String Dado;
	private No  Proximo;
	private No Anterior;
	
	public No(String dado)
	{
		Dado = dado;
	}
	public String getDado() {
		return Dado;
	}

	public void setDado(String dado) {
		Dado = dado;
	}

	public No getProximo() {
		return Proximo;
	}

	public void setProximo(No proximo) {
		Proximo = proximo;
	}
	public No getAnterior() {
		return Anterior;
	}
	public void setAnterior(No anterior) {
		Anterior = anterior;
	}

}
