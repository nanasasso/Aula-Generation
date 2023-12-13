package EstruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<String> livros = new Stack<String>();

		Scanner ler = new Scanner(System.in);

		int op;

		do {

			System.out.println("\n----------------------------------------------");
			System.out.println("\n(1) Adicionar livro na pilha");
			System.out.println("\n(2) Listar todos os livros");
			System.out.println("\n(3) Retirar livro da pilha");
			System.out.println("\n(0) Sair");
			System.out.println("\n----------------------------------------------");
			System.out.println("\nDigite sua opção: ");
			op = ler.nextInt();

			switch (op) {
			case 1:
				ler.nextLine();
				System.out.println("\nPilha: ");
				System.out.println(livros);
				System.out.println("\nDigite o nome: ");
				livros.push(ler.nextLine());
				System.out.println("\nLivro adicionado!");
				break;

			case 2:
				System.out.println("\nNomes Agendados: ");
				System.out.println(livros);
				break;
				
			case 3:
				ler.nextLine();
				if(livros.isEmpty()) {
					System.out.println("A pilha está vazia");
				} else {
				System.out.println("\nUm livro foi retirado da pilha: " + livros.pop());
				break;
				}		
				
			default:
				
				break;

			}

		} while (op != 0);
		System.out.println("\nPrograma finalizado!");

		ler.close();
	}

}
	