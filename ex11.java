import java.util.Scanner;
public class ex11 {

	public static void main(String[] args) {
		/*Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
calcule seu peso ideal, usando a seguinte f�rmula: .*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("qual sua altura?");
		double a=0;
		a=entrada.nextDouble();
		a=(72.7*a)-58;
		
		System.out.println("seu peso ideal � de "+ a+"Kg");

}
}