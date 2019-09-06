public class Principal {
    public static void main(String[] args) {
        Cargo[] guardaCargos = new Cargo[3];

        guardaCargos[0] = new Cargo(); //LIMPARDOR DE PRIVADA
        guardaCargos[0].setNumCodigo(1);
        guardaCargos[0].setValorDaHora(30);

        guardaCargos[1] = new Cargo(); //LIMPADOR DE PIA
        guardaCargos[1].setValorDaHora(40);
        guardaCargos[1].setNumCodigo(2);

        guardaCargos[2] = new Cargo(); //LIMPADOR DE CHAO
        guardaCargos[2].setNumCodigo(3);
        guardaCargos[2].setValorDaHora(50);

        Funcionario func = new Funcionario();
        func.setHorasTrabalhadas(10);
        func.setSexo("F");
        func.setCargo(guardaCargos[1]);
        System.out.println(func.getSexo());
        System.out.println(func.getHorasTrabalhadas());
        System.out.println("O salario final é: "+func.CalculaPrecoFinal());
    }
}
