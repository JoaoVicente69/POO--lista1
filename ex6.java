import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// Faça um Programa que peça o raio de um círculo, calcule e mostre sua área
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("escreva o raio para calcular area do circulo");
			float raio=0;
			raio= entrada.nextInt();
			raio=(raio*raio);
			double pi = 3.14;
			double area = pi *raio;
		 System.out.println("a area do circulo é de "+ area);

	}

}
