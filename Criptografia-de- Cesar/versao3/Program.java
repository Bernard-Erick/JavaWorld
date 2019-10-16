import java.util.*;

public class Program
{
    public static void main(String[] args)
    {
        Scanner dado = new Scanner(System.in);
        boolean ligado = true;
        int numEscolha = 0;
        while(ligado)
        {
            System.out.println("INICIAR PROGRAMA? (1-Sim/2-Não)");
            numEscolha = dado.nextInt();
            if(numEscolha == 2)
            {
                break;
            }
            List lista = new List();
            System.out.println(":ENCRIPTADOR DE FLUXO:");
            System.out.println("======:PREENCHA:======");
            System.out.print("Insira o valor de cesar:");  
            int cesar = dado.nextInt();
            dado.nextLine();
            lista.setCesar(cesar);
            System.out.print("Insira a frase a ser criptografado:");
            String frase = dado.nextLine();
            for(int i = 0;i < frase.length();i++)
            {
               String letra = frase.substring(i,i+1);
               lista.Add(letra.charAt(0));
            }
            System.out.println("=  ||||  MENU  ||||   =");
            System.out.println("=  VVVV OPÇÕES VVVV   =");
            System.out.println("=  1-Encriptografar   =");
            System.out.println("=  2-Descriptografar  =");
            System.out.println("=---------------------=");
            int escolha = dado.nextInt();
            switch(escolha)
            {
                case 1: //ENCRIPTOGRAFA
                 System.out.println("=---------- Frase normal--------- =");
                 lista.GetterNormal();
                 System.out.println();
                 System.out.println("=---------- Frase Criptografada-------=");
                 lista.GetterCripto();
                 System.out.println();
                 System.out.println("=-------------------------------------=");
                break;
                case 2: //DESCRIPTOGRAFA
                System.out.println("=---------- Frase normal--------- =");
                lista.GetterNormal();
                System.out.println();
                System.out.println("=---------- Frase Descriptografada-------=");
                lista.GetterDesCripto();
                System.out.println();
                System.out.println("=-------------------------------------=");
                break;
            }
        }   
    }
}