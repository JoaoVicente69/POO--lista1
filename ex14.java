/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas
trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se
que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o
sindicato, faça um programa que nos dê:
a. salário bruto.
b. quanto pagou ao INSS.
c. quanto pagou ao sindicato.
d. o salário líquido.
e. calcule os descontos e o salário líquido, conforme a tabela abaixo:
f. + Salário Bruto : R$
g. - IR (11%) : R$
h. - INSS (8%) : R$
i. - Sindicato ( 5%) : R$
j. = Salário Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.*/
import java.util.Scanner;

public class ex14 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("quanto você ganha por hora?");
		double salario =0;
		salario= entrada.nextDouble();
		System.out.println("quantas horas por dia mes você trabalha?");
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
			
			System.out.println("Seu salario bruto é de "+salario_bruto+"R$");
			System.out.println("Você paga de INSS "+inss+"R$");
			System.out.println("Você pafa de sindicato "+sind+"R$");
			System.out.println("seu salario liquido é de "+salario_liquido+"R$");

			entrada.close();

			
	}

}
