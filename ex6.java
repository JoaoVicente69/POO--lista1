import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// Fa�a um Programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("escreva o raio para calcular area do circulo");
			float raio=0;
			raio= entrada.nextInt();
			raio=(raio*raio);
			double pi = 3.14;
			double area = pi *raio;
		 System.out.println("a area do circulo � de "+ area);

	}

}
