package ExerciciosRepeti��o;

public class Exercicio01 {
	/*1- Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
	obtemos resto = 5. (FOR)*/
	public static void main(String[] args) {
		
		double num, res, resto;
		
		for(num = 1000, res = 0; num<=1999; num++) {
			res = num / 11 ;
			resto = (num % 11);
			
			if(resto == 5) {
				System.out.printf("\n" + num+" / 11 = %.3f" , res  );
				System.out.print( " com resto: " + resto);
			}
			
		}
		

	}

}
