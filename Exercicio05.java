package ExerciciosRepeti��o;

public class Exercicio05 {
	/*5- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/

	public static void main(String[] args) throws InterruptedException {
		
		int i = 9, soma=0;
		
		do {
			System.out.println("N�"+i);
			soma += i ;
			System.out.println("Soma dos n�meros do teclado: "+soma);
			
			--i;//incremento...++i ou i++
			Thread.sleep(500);
			
			
			
		}while( i >= 0); 
		}
		

	}


