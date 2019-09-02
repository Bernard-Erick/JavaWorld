import java.util.*;
public class Program
{
    public static void main(String[] args)
    {
        Scanner dado = new Scanner(System.in);
        Produto[] produtos = new Produto[5];
        int count = 0; //vai contar os produtos com preço final maior que 40
        double somatorio = 0; //vai acumular o somatorio dos preços finais
        Tipo tipos[] = new Tipo[2];

        tipos[0] = new Tipo();
        tipos[0].setCodigo(1);
        tipos[0].setPercentual(10);

        tipos[1] = new Tipo();
        tipos[1].setCodigo(2);
        tipos[1].setPercentual(20);

        for(int i = 0;i < 5;i++)
        {
            System.out.println((i+1)+"º produto:");
            System.out.println("Digite a descrição do produto: ");
            String desc = dado.next();
            System.out.println("Digite o preço do produto:");
            double preco = dado.nextDouble();
            System.out.println("Digite o tipo do produto:");
            int t = dado.nextInt();
            System.out.println();
            produtos[i] = new Produto(desc,preco,tipos[t-1]);
            somatorio+= produtos[i].calculaPrecoFinal();
            if(produtos[i].calculaPrecoFinal() > 40 )
            {
                count++;
            }
        }
        System.out.println("Média dos preços finais: "+(somatorio/5));
        System.out.println("quantidade de produtos com preço final superior a 40: "+count);
    }
}