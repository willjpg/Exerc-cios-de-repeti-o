package ExerciciosRepetição;

import java.util.Scanner;

public class Exercicio02 {
	/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			int x, cont =10, num, contp=0,conti=0;
			
			for(x= 0; x<cont; x++) {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			if(num%2 == 0) {
				contp++;
				System.out.println("Esse número é par!" );
				
			}else if (num%2 != 0) {
				conti++;
				System.out.println("Esse número é ímpar");
			}else {
				leia.close();
			}
			
			}System.out.println("No total foram "+contp+" par(es) e "+conti+" ímpar(es).");
			}
	
}
