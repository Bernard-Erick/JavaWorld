import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        List list = new List();
        Scanner dado = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Digite o código do Produto:");
            int codigo = dado.nextInt();
            System.out.println("Digite o preço do Produto: ");
            double preco = dado.nextDouble();
            System.out.println("Digite a quantidade do Produto:");
            int quant = dado.nextInt();
            list.Add(new Produto(codigo, preco, quant));
            System.out.println();
        }
        System.out.println("Dados atualizados:");
        list.Get();
        System.out.println();
        System.out.println("Digite a taxa de desconto:");
        int taxa = dado.nextInt();
        int count = 0;
        No aux = list.getPrimeiro();
        while (aux != null)
        {
            aux.getDado().setPreco(aux.getDado().getPreco() - (aux.getDado().getPreco() * taxa / 100));
            if(aux.getDado().getPreco() > 500)
            {
                count++;
            }
            aux = aux.getProximo();
        }
        System.out.println("Dados atualizados:");
        list.Get();
        System.out.println();
        System.out.println("Quantidade de produtos com preço acima de 500:"+count);
    }
}
