import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		//Faça um Programa que peça dois números e imprima a soma.
		
		Scanner entrada = new Scanner(System.in);
		
		int a,b = 0;
		 System.out.println("Escreva 2 numeros");
		 	a= entrada.nextInt();
		 	b= entrada.nextInt();
		 	int c = a+b;
		 System.out.println("a soma dos dois nuemros é " + c);
	}

}

