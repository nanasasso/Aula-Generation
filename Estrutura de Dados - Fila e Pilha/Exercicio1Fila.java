package EstruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> fila = new LinkedList<String>();

		Scanner ler = new Scanner(System.in);

		int op;

		do {

			System.out.println("\n----------------------------------------------");
			System.out.println("\n(1) Adicionar Cliente na fila");
			System.out.println("\n(2) Listar todos os Clientes");
			System.out.println("\n(3) Retirar Cliente da fila");
			System.out.println("\n(0) Sair");
			System.out.println("\n----------------------------------------------");
			System.out.println("\nDigite sua opção: ");
			op = ler.nextInt();

			switch (op) {
			case 1:
				ler.nextLine();
				System.out.println("\nNomes Agendados: ");
				System.out.println(fila);
				System.out.println("\nDigite o nome: ");
				fila.add(ler.nextLine());
				System.out.println("\nCliente adicionado!");
				break;

			case 2:
				System.out.println("\nNomes Agendados: ");
				System.out.println(fila);
				break;
				
			case 3:
				ler.nextLine();
				if(fila.isEmpty()) {
					System.out.println("A fila está vazia");
				} else {
				System.out.println("\nDigite o nome:  ");
				System.out.println("\nEste nome: " + fila.contains(ler.nextLine()));
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
