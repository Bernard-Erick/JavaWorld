public class List {
    private No primeiro;
    private No ultimo;
    private No primeiroCripto;
    private No ultimoCripto;
    private int cesar;
    private int tamanho;

    public List() {
        primeiro = null;
        ultimo = null;
        tamanho = 0;
    }

    public int getCesar() { //getter do CESAR
        return cesar;
    }

    public void setCesar(int cesar) {//setter do CESAR
        this.cesar = cesar;
    }

    public void Add(char valor)
    {
        No novo = new No(valor);//ELE NORMAL
        int codigoOriginal = (int) novo.getDado(); //CODIGO ASCII DO NOVO ORIGINAL
        int codigoNovo = codigoOriginal + getCesar(); //PEGANDO O VALOR DO ORIGINAL E SOMANDO O CESAR 
        No novoCripto;    
        if(primeiro == null)
        {           
            primeiro = novo;
            ultimo = novo;
            if(codigoOriginal == 32) // em caso de espaço em branco
            {
                novoCripto = new No((char)codigoOriginal);
                primeiroCripto = novoCripto;
                ultimoCripto = novoCripto;
            }
            else
            {
                if(codigoNovo> 90 && codigoOriginal >= 65 && codigoOriginal <= 90)
                {
                    codigoNovo = codigoNovo - 90 + 64;
                    novoCripto = new No((char)codigoNovo);
                    primeiroCripto = novoCripto;
                    ultimoCripto = novoCripto;
                }
                else if(codigoNovo > 122 && codigoOriginal >= 97 && codigoOriginal <= 122)
                {
                    codigoNovo = codigoNovo - 122 + 96;
                    novoCripto = new No((char)codigoNovo);
                    primeiroCripto = novoCripto;
                    ultimoCripto = novoCripto;
                }
                else
                {
                    novoCripto = new No((char)codigoNovo);
                    primeiroCripto = novoCripto;
                    ultimoCripto = novoCripto;
                }
            }
        }       
        else
        {               
            ultimo.setProximo(novo);
            novo.setAnterior(ultimo);
            ultimo = novo;
            
            if(codigoOriginal == 32)
            {
                novoCripto = new No ((char)codigoOriginal);
                ultimoCripto.setProximo(novoCripto);
                novoCripto.setAnterior(ultimoCripto);
                ultimoCripto = novoCripto;
            }
            else
            {
                if(codigoNovo> 90 && codigoOriginal >= 65 && codigoOriginal <= 90)
                {
                    codigoNovo = codigoNovo - 90 + 64;
                    novoCripto = new No((char)codigoNovo);
                    ultimoCripto.setProximo(novoCripto);
                    novoCripto.setAnterior(ultimoCripto);
                    ultimoCripto = novoCripto;
                }
                else if(codigoNovo > 122 && codigoOriginal >= 97 && codigoOriginal <= 122)
                {
                    codigoNovo = codigoNovo - 122 + 96;
                    novoCripto = new No((char)codigoNovo);
                    ultimoCripto.setProximo(novoCripto);
                    novoCripto.setAnterior(ultimoCripto);
                    ultimoCripto = novoCripto;
                }
                else
                {
                    novoCripto = new No((char)codigoNovo);
                    ultimoCripto.setProximo(novoCripto);
                    novoCripto.setAnterior(ultimoCripto);
                    ultimoCripto = novoCripto;
                }
            }     
        }
        tamanho++;
    }
    public void GetterNormal()
    {
        No aux = primeiro;
         while(aux!=null)
         {
            System.out.print(aux.getDado());
            aux = aux.getProximo();
         }
    }
    public void GetterCripto()
    {
        No aux = primeiroCripto;
        while (aux!=null)
        {
            System.out.print(aux.getDado());
            aux = aux.getProximo();
        }
    }
    public void GetterDesCripto()
    {
        No aux = primeiro;
        while(aux!= null)
        {
            int codigoOriginal = (int)aux.getDado();
        	if(codigoOriginal == 32) 
        	{
        		System.out.print((char)codigoOriginal);
        	}
        	else 
        	{
        		if(codigoOriginal- getCesar() < 65 && codigoOriginal >= 65 && codigoOriginal <= 90)
        		{
        			codigoOriginal = 90 - (64 - (codigoOriginal - getCesar()));
        			System.out.print((char)codigoOriginal );
        		}
        		else if(codigoOriginal - getCesar() < 97 && codigoOriginal >= 97 && codigoOriginal <= 122) // 97 >= X <= 122 || a ---- z
        		{
        			codigoOriginal = 122 - (96 - (codigoOriginal - getCesar()));
        			System.out.print((char) codigoOriginal);
        		}
        		else 
        		{
                    int letra = codigoOriginal-getCesar();
                    System.out.print((char)letra);
        		}
        	}
            aux = aux.getProximo();
        }
    }


}
