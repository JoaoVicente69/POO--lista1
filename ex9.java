import java.util.Scanner;
public class ex9 {

	public static void main(String[] args) {
		/* Fa�a um Programa que pe�a a temperatura em graus Farenheit, transforme e mostre a
temperatura em graus Celsius.*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("qual a temperatura do dia em graus Farenheit ?");
		double f=0;
		f=entrada.nextInt();
		double c =0;
		c= (5 * (f-32) / 9);
		System.out.println("A temperatura em graus Celsius � de " +c+"�C");
		
	}

}
