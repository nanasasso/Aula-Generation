package loops;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner(System.in);
		
		int idade, menor21=0, maior50=0; 
		
		System.out.println("\nDigite uma idade: ");
		idade = leia.nextInt();
		
		while (idade > 0) {
			
		if (idade < 21) {
			menor21++; }
		else if (idade > 50) {
			maior50++; }
			System.out.println("\nDigite uma idade novamente:");
			idade = leia.nextInt();
				} 

			System.out.println("\nTotal de pessoas menores de 21 anos:" + menor21);
			System.out.println("\nTotal de pessoas maiores de 50 anos:" + maior50); 	
			
		}
	 
	}

	


