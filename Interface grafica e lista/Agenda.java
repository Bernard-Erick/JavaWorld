import javax.swing.JOptionPane;

public class Agenda
{
    Pessoa[] pessoas = new Pessoa[10];
    private int espaco;
    public Agenda()
    {
        espaco = 0;
        for (int i = 0; i < pessoas.length; i++)
            pessoas[i] = new Pessoa();
    }
    public boolean armazenaPessoa(String n,String d,double a)
    {
        if(espaco < pessoas.length)
        {
            pessoas[espaco].setNome(n);
            pessoas[espaco].setDataDeNascimento(d);
            pessoas[espaco].setAltura(a);
            espaco++;
            return true;
        }
        else
        {
            return false;
        }
    }
    public int Acha(String n) 
    {
    	int i = 0;
    	while(!pessoas[i].getNome().equals(n)) 
    	{
    		if(pessoas[i].getNome().equals(n))
    		{
    			break;
    		}
    		i++;
    	}
    	return i;
    }
    public void Remove(String n) 
    {
    	int i = Acha(n);
    	int ultimo = pessoas.length-1;

    	while(i<ultimo) 
    	{
    		pessoas[i].setAltura(pessoas[i+1].getAltura());
    		pessoas[i].setDataDeNascimento(pessoas[i+1].getDataDeNascimento());
    		pessoas[i].setNome(pessoas[i+1].getNome());
    		i++;
    	}
    	pessoas[ultimo].setAltura(0.0);
    	pessoas[ultimo].setDataDeNascimento(null);
    	pessoas[ultimo].setNome(null);
    	espaco--;
    	
    }
    public void imprimeAgenda()
    {
        for(int i = 0; i < pessoas.length;i++)
        {
        	JOptionPane.showMessageDialog(null,"Id: "+i+
        	"\nNome: "+pessoas[i].getNome()+
        	"\nIdade: "+pessoas[i].calculaIdade()+
        	"\nAltura: "+pessoas[i].getAltura());
        }
    }
    public  void imprimePessoa(int pos)
    {
    	JOptionPane.showMessageDialog(null,"Nome: "+pessoas[pos].getNome()+
    					"\nIdade: "+pessoas[pos].calculaIdade()+
    				"\nAltura: "+pessoas[pos].getAltura());
    }

}
