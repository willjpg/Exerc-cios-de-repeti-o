package ExerciciosRepeti��o;

import java.util.Scanner;

public class Exercicio02 {
	/*2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			int x, cont =10, num, contp=0,conti=0;
			
			for(x= 0; x<cont; x++) {
			System.out.println("Digite um n�mero: ");
			num = leia.nextInt();
			
			if(num%2 == 0) {
				contp++;
				System.out.println("Esse n�mero � par!" );
				
			}else if (num%2 != 0) {
				conti++;
				System.out.println("Esse n�mero � �mpar");
			}else {
				leia.close();
			}
			
			}System.out.println("No total foram "+contp+" par(es) e "+conti+" �mpar(es).");
			}
	
}
