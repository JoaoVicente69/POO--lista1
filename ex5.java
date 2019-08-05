import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		//Faça um Programa que converta metros para centímetros.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("escreva uma medida em metros para ser convetida para centimentros ");
			float x = 0;
		 x= entrada.nextInt();
		 	float h=100;
		 	float conversao = x*h;
		 System.out.println("medida em centimetros é de " + conversao+" cm");
	}

}
