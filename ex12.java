import java.util.Scanner;
public class ex12 {

	public static void main(String[] args) {
		/*Tendo como dado de entrada a altura, construa um algoritmo que calcule seu peso ideal */
				

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Se voc� for home digite F e se for mulher digite M");
		char sexo =' ';
		double resultado = 0;
		sexo = entrada.nextLine().toUpperCase().charAt(0);
		System.out.println("qual sua altura?");
		double a=0;
		a=entrada.nextDouble();
		
		if (sexo == 'f'){
			resultado= (62.1*a) - 44.7;
		}else {
			resultado=(72.7*a) - 58;
		}
	System.out.println("seu peso ideal para seu sexo e altura � de "+ resultado+"Kg");
	
	entrada.close();
	
		

	}

}
