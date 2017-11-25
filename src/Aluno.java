import java.util.Scanner;

public class Aluno {

	
	public static void main(String[] args) {

		String[] nome = new String[5];
		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < nome.length; i++) {
			System.out.print("Digite o nome: ");
			nome[i] = leia.nextLine();
		}
		System.out.println("NOMES QUE TERMINAM COM A LETRA 'A':");
		for (int i = 0; i < nome.length; i++) {
			if ((nome[i].charAt(nome[i].length() - 1) == 'A') || (nome[i].charAt(nome[i].length() - 1) == 'a'))
				System.out.println(nome[i]);
		}

		System.out.println("NOMES QUE TÊM MAIS DE 5 LETRAS:");
		for (int i = 0; i < nome.length; i++) {
			if (nome[i].length() > 5) {
				System.out.println(nome[i]);
			}
		}
	}
}