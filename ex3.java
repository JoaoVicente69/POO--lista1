import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		//Fa�a um Programa que pe�a dois n�meros e imprima a soma.
		
		Scanner entrada = new Scanner(System.in);
		
		int a,b = 0;
		 System.out.println("Escreva 2 numeros");
		 	a= entrada.nextInt();
		 	b= entrada.nextInt();
		 	int c = a+b;
		 System.out.println("a soma dos dois nuemros � " + c);
	}

}

