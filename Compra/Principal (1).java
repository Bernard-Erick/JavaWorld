import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        Scanner dado = new Scanner(System.in);
        Produto[] produtos = new Produto[3];
        Cliente[] clientes = new Cliente[3];
        for(int i = 0; i < 3;i++)
        {
            System.out.println("Codigo do produto:");
            int codigo = dado.nextInt();
            System.out.println("Preço do produto:");
            double preco = dado.nextDouble();
            while(preco < 20 || preco > 350)
            {
                System.out.println("Preço do produto:");
                preco = dado.nextDouble();
            }
            produtos[i] = new Produto(codigo,preco);
        }
        for(int i = 0 ; i < 3;i++)
        {
            System.out.println("Codigo do cliente:");
            int codigo = dado.nextInt();
            System.out.println("Nome do cliente:");
            String nome = dado.next();
            System.out.println("Sexo do cliente:");
            char sexo = dado.next().charAt(0);
            while(sexo != 'M' && sexo !='m' && sexo!= 'F' && sexo!='f')
            {
                System.out.println("Sexo do cliente:");
                sexo = dado.next().charAt(0);
            }
            clientes[i] = new Cliente(codigo,nome,sexo);
        }
        System.out.println("REALIZE SUA COMPRA:");
        System.out.print("Digite o número do produto:");
        int p = dado.nextInt();
        System.out.print("Digite o número do cliente:");
        int c = dado.nextInt();
        System.out.println("Digite a quantidade do Produto:");
        int quant = dado.nextInt();
        Compra buy = new Compra(produtos[p-1],clientes[c-1],quant);
        System.out.print("O valor total da compra é: ");
        System.out.println(buy.CalculaValorTotal());
    }
}
