import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// Fa�a um Programa que pe�a as 4 notas bimestrais e mostre a m�dia
		Scanner entrada = new Scanner(System.in);
		
		int q,w,r,t = 0;
		 System.out.println("Escreva  as 4 notas do Bimestre"); 
		 	q = entrada.nextInt();
		 	w = entrada.nextInt();
		 	r = entrada.nextInt();
		 	t = entrada.nextInt();
		 	float p=(q+w+r+t)/4;
		 System.out.println("a media do Bimestre " + p); 

	}

}
