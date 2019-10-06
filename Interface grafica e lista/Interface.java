import javax.swing.JOptionPane;

public class Interface
{
	public static void main(String[] args) 
	{
		Agenda agenda = new Agenda();
		while(true) 
		{			
			String escolha = JOptionPane.showInputDialog(null,"MENU DE COMANDOS DA AGENDA: \n1) Adicionar pessoa: \n2) Remove pessoa: \n3) Busca pessoa: \n4) Imprime agenda: \n5) Imprime pessoa:");
			String nome;
			String data;
			String altura;
			switch(escolha)
			{
				case "1":
					nome = JOptionPane.showInputDialog(null,"Insira o nome:");
					data = JOptionPane.showInputDialog(null,"Insira a data de nascimento: ex '13/10/2000' ");
					altura = JOptionPane.showInputDialog(null,"Insira a altura:");
					JOptionPane.showMessageDialog(null, "Pessoa adicionada!");
					agenda.armazenaPessoa(nome, data, Double.parseDouble(altura));
				break;
				case "2":
					nome = JOptionPane.showInputDialog(null,"Insira o nome para remover:");
					agenda.Remove(nome);
					JOptionPane.showMessageDialog(null, "Pessoa removida!");
				break;
				case "3":
					nome = JOptionPane.showInputDialog(null,"Insira a pessoa para procurar:");
					JOptionPane.showMessageDialog(null, "Pessoa de index: "+ agenda.Acha(nome));
				break;
				case "4":
					agenda.imprimeAgenda();
				break;
				case "5":
					String i = JOptionPane.showInputDialog(null,"Insira o indice que quer procurar:");
					agenda.imprimePessoa(Integer.parseInt(i));
				break;
												
			}
		}
		
		
	}
}
