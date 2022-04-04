package ExerciciosRepetição;

public class Exercicio05 {
	/*5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/

	public static void main(String[] args) throws InterruptedException {
		
		int i = 9, soma=0;
		
		do {
			System.out.println("N°"+i);
			soma += i ;
			System.out.println("Soma dos números do teclado: "+soma);
			
			--i;//incremento...++i ou i++
			Thread.sleep(500);
			
			
			
		}while( i >= 0); 
		}
		

	}


