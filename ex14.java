/*Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas
trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s, sabendo-se
que s�o descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o
sindicato, fa�a um programa que nos d�:
a. sal�rio bruto.
b. quanto pagou ao INSS.
c. quanto pagou ao sindicato.
d. o sal�rio l�quido.
e. calcule os descontos e o sal�rio l�quido, conforme a tabela abaixo:
f. + Sal�rio Bruto : R$
g. - IR (11%) : R$
h. - INSS (8%) : R$
i. - Sindicato ( 5%) : R$
j. = Sal�rio Liquido : R$
Obs.: Sal�rio Bruto - Descontos = Sal�rio L�quido.*/
import java.util.Scanner;

public class ex14 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("quanto voc� ganha por hora?");
		double salario =0;
		salario= entrada.nextDouble();
		System.out.println("quantas horas por dia mes voc� trabalha?");
		int horas=0;
		horas=entrada.nextInt();
		
			double salario_bruto= 0;
			salario_bruto = salario * horas;
			
			// inss
			double inss = 0;
			inss = (salario_bruto*8)/100;
			//sindicato
			double sind = 0;
			sind = (salario_bruto*5)/100;
			//ir
			double ir=0;
			ir=(salario_bruto*11)/100;
			//salario liquido
			double salario_liquido=0;
			salario_liquido=salario_bruto -(ir+inss+sind);
			
			System.out.println("Seu salario bruto � de "+salario_bruto+"R$");
			System.out.println("Voc� paga de INSS "+inss+"R$");
			System.out.println("Voc� pafa de sindicato "+sind+"R$");
			System.out.println("seu salario liquido � de "+salario_liquido+"R$");

			entrada.close();

			
	}

}
