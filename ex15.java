/*Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em
metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro
para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam
R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o
preço total.
 */
import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("qual o tamanho do local que vcê vai pintar em m²?");
		double m=0;
		m=entrada.nextDouble();
		
		double b=0;
		b=m*3;
		int tinta = 0;
		b= b / 54;
		tinta =(int) (Math.ceil(b));
		int preco=0;
		preco= (tinta*80);
		
		if(tinta==0) {
			System.out.println("1 lata de tinda que dara o valor de R$80,00");
			
		}else {
			System.out.println(+tinta+" latas de tinda que dara o valor de R$"+preco+",00");
		}
		
		
	
	}

}
