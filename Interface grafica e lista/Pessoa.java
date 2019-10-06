public class Pessoa
{
    private String nome;
    private String dataDeNascimento;
    private double altura;

    public Pessoa()
    {
        //nada por enquanto
    }
    public Pessoa(String n,String data,double a)
    {
        nome = n;
        dataDeNascimento = data;
        altura = a;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int calculaIdade()
    {
        String[] pedacoDaData = getDataDeNascimento().split("/");
        int AnoDaPessoa = Integer.parseInt(pedacoDaData[2]);
        return 2019 - AnoDaPessoa;
    }
}
