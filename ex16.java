/*Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em
metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro
para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam
R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
o Informe ao usuário as quantidades de tinta a serem compradas e os respectivos
preços em 2 situações:
o comprar apenas latas de 18 litros;
o comprar apenas galões de 3,6 litros;*/

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("qual o tamanho do local que vcê vai pintar em m²?");
		double m=0;
		m=entrada.nextDouble();
		
		double b=0;
		b=m*6;
		int tinta = 0;
		b= b / 21.6;
		tinta=(int) (Math.ceil(b));
		double preco=0;
		preco= tinta*25;
		
		double c=0;
		c=m*6;
		int tinta2 = 0;
		c= c / 108;
		tinta2 =(int) Math.ceil(c);
		int preco2=0;
		preco2= tinta2*80;
		
		System.out.println("orçamento com galão de 3,6l");
		if(tinta==0) {
			System.out.println("1 galão de tinda que dara o valor de R$25,00");
			
		}else {
			System.out.println(tinta+" latas de tinda que dara o valor de R$"+preco+",00");
		}
		System.out.println("orçamento com lata de 18l");
		if(tinta==0) {
			System.out.println("1 lata de tinda que dara o valor de R$80,00");
			
		}else {
			System.out.println(tinta2+" latas de tinda que dara o valor de R$"+preco2+",00");
		}
		

		
	

	}

}
