import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		/*Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas
trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s.*/

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("quanto voc� ganha por hora?");
			double salario =0;
			salario= entrada.nextDouble();
		System.out.println("quantas horas por dia mes voc� trabalha?");
			int horas=0;
			horas=entrada.nextInt();
			
		double total = 0;
				total = salario * horas;
				System.out.println("seu salario m�s � de " + total);
				
	}

}
;