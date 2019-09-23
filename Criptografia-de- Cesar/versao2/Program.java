import java.util.*;
public class Program
{
    public static void main(String[] args)
    {
        Scanner dado = new Scanner(System.in);
        System.out.println("Encriptador de fluxo:");
        while(true)
        {
            List list = new List();
            System.out.println("Digite 1 para encriptacao ou 2 para decriptacao:");
            int i = dado.nextInt();
            String texto;
            String letra; //Vai ser usado para acumular o caractere de cada palavra e jogar na lista
            int cesar;
            switch (i) //Analisa a escolha do func
            {
                case 1: //encriptacao
                    System.out.println("Digite o texto para ser encriptado:");
                    dado.nextLine();
                    texto = dado.nextLine();
                    System.out.println("    APERTE 'ENTER' PARA CONTINUAR:");
                    dado.nextLine();
                    System.out.println("Digite o valor de cesar:");
                    cesar = dado.nextInt();
                    for(int z = 0 ;z < texto.length();z++)
                    {
                        letra = texto.substring(z,z+1);
                    	list.Add(letra);
                    }
                    list.Encriptografa(cesar);
                    System.out.println();
                    break;
                case 2: //descriptacao
                	System.out.println("Digite o texto para ser descriptografado:");
                    dado.nextLine();
                    texto = dado.nextLine();
                    System.out.println("    APERTE 'ENTER' PARA CONTINUAR:");
                    dado.nextLine();
                    System.out.println("Digite o valor de cesar:");
                    cesar = dado.nextInt();
                    for(int z = 0 ;z < texto.length();z++)
                    {
                        letra = texto.substring(z,z+1);
                    	list.Add(letra);
                    }
                    list.Descriptografa(cesar);
                    System.out.println();
                    break;
            }
            System.out.println("DIGITE 'F' SE DESEJA PARAR O PROGRAMA ou 'C' SE DESEJA CONTINUAR:");
            String escolha = dado.next();
            if(escolha.equals("F") || escolha.equals("f"))
            {
                break;
            }
        }
    }
}
