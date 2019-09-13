public class Cliente
{
    private int numeroDoCliente;
    private String nome;
    private char sexo;

    public Cliente(int num,String n,char s)
    {
        numeroDoCliente = num;
        nome = n;
        sexo = s;
    }
    public int getNumeroDoCliente() {
        return numeroDoCliente;
    }

    public void setNumeroDoCliente(int numeroDoCliente) {
        this.numeroDoCliente = numeroDoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean DescontoAdicional()
    {
        if(sexo == 'F' || sexo == 'f') //Analisa se é mulher
        {
            return true;
        }
        else //Analisa se é homem
        {
            return false;
        }
    }
}
