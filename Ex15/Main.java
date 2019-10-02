import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Stack stack = new Stack();
		Scanner dado = new Scanner(System.in);
		System.out.println("Digite a expressão matematica:");
		String frase = dado.nextLine();
		for(int z = 0 ;z < frase.length();z++)
        {
			stack.Push(frase.substring(z,z+1));
        }
		
		stack.GetPeloUltimo();
		System.out.println("------------------------");
		stack.analisaCaso();
	}
}
