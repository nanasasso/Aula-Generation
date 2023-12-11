package loops;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		int numero, total=0;
				
		do {
			System.out.println("\nDigite um número: ");
			numero = leia.nextInt();
			
			if (numero > 0) {
				total += numero;}
			}
		while (numero != 0) ;
		

	System.out.println("\nA soma dos números positivos é: " + total);	
}
	
}
