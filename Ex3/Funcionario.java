public class Funcionario
{
    private String sexo;
    private int horasTrabalhadas;
    private Cargo cargo;
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public double CalculaPrecoFinal()
    {
        if(getSexo().equals("m") || getSexo().equals("M"))
        {
            double salarioFinal = cargo.getValorDaHora() * getHorasTrabalhadas();
            return salarioFinal + (salarioFinal * 0.2);
        }
        else
        {
            return (cargo.getValorDaHora() * getHorasTrabalhadas());
        }

    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
