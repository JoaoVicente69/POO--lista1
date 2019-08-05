import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas
trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.*/

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("quanto você ganha por hora?");
			double salario =0;
			salario= entrada.nextDouble();
		System.out.println("quantas horas por dia mes você trabalha?");
			int horas=0;
			horas=entrada.nextInt();
			
		double total = 0;
				total = salario * horas;
				System.out.println("seu salario mês é de " + total);
				
	}

}
;