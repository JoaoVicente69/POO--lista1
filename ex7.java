import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// Faça um Programa que calcule e mostre a área de um quadrado.
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("escreva o tamanho de um dos lados do quadrado");
			float area=0;
			area=entrada.nextInt();
			area= area*area;
				System.out.println("a area do quadrado é de " + area);
					
	}

}
