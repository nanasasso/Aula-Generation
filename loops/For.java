package loops;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int x, y, contador;
	 
		System.out.println("\nDigite o primeiro número do intervalo: ");
		x = leia.nextInt();
		System.out.println("\nDigite o último número do intervalo: ");
		y = leia.nextInt();
		
		
		if(x>y) {
			System.out.println("INVÁLIDO");
		}else {			
		  for(contador = x; contador < y ; contador++) {
			if (contador % 3 == 0 && contador % 5 ==0)
			System.out.println(contador + "é multiplo de 3 e 5");
			
					}
			}
}}