import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// Fa�a um Programa que calcule e mostre a �rea de um quadrado.
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("escreva o tamanho de um dos lados do quadrado");
			float area=0;
			area=entrada.nextInt();
			area= area*area;
				System.out.println("a area do quadrado � de " + area);
					
	}

}
