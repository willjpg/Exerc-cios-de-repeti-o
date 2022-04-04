package ExerciciosRepetição;

import java.util.Scanner;

public class Exercicio03 {
	/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
	public static void main(String[] args) throws InterruptedException {
		
		Scanner leia = new Scanner(System.in);
		int num=5, idade, total21=0, total50=0;
		
		
		
		while(num>=0) {
			
			System.out.println("Escreva a idade:");
			idade = leia.nextInt();
				if (idade == -99 || idade>115) {leia.close();//para quebrar a sequencia e fechar o programa
			}
			num--;
			Thread.sleep(50);
			
			
			if(idade<21 && idade>0) {
				total21++;
			}else if (idade>50){
				total50++;
			}
		}System.out.println("Total de pessoas com menos de 21 anos é: " + total21);
		System.out.println("Total de pessoas com mais de 50 anos é: " + total50);
	}

}
