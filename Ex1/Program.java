import java.util.*;
public class Program
{
    public static void main(String[] args)
    {
        Scanner dado = new Scanner(System.in);
        Tipo tipos[] = new Tipo[2];

        tipos[0] = new Tipo();
        tipos[0].setCodigo(1);
        tipos[0].setPercentual(10);

        tipos[1] = new Tipo();
        tipos[1].setCodigo(2);
        tipos[1].setPercentual(20);

        Produto p1 = new Produto();
        System.out.println("Digite a descrição do produto: ");
        p1.setDescricao(dado.next());
        System.out.println("Digite o preço do produto:");
        p1.setPreco(dado.nextDouble());
        System.out.println("Digite o tipo do produto:");
        int t = dado.nextInt();
        p1.setTipo(tipos[t-1]);
        System.out.println("Preço final = "+p1.calculaPrecoFinal());
    }
}