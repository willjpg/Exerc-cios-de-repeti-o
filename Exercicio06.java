package ExerciciosRepeti��o;

import java.util.Scanner;

public class Exercicio06 {
	/*6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			double media ,num;
			double soma=0, div=0,i=0;
			
			do {
				
				System.out.println("Digite um n�mero: ");
				num = leia.nextInt();
				
				if(num==0) {
					leia.close();
				}
				if(num%3 == 0) {
					div++;
					soma+=num;
					//media= soma/div;
				}
				
				i++;
			}while(i<5);
			
				media= soma/div;
					System.out.println("Escreva "+media);
			
		}
}
