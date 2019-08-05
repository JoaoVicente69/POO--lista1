import java.util.Scanner;
public class ex10 {

	public static void main(String[] args) {
		/*	Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
				a. o produto do dobro do primeiro com metade do segundo .
				b. a soma do triplo do primeiro com o terceiro.
				c. o terceiro elevado ao cubo. */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("escreva dois numeros inteiro e um real");
		int pri,seg=0;
		double ter=0;
		pri= entrada.nextInt();
		seg = entrada.nextInt();
		ter = entrada.nextDouble();
		
		float a =0;
		a= (pri*2)+(seg/2);
		
		double  b=0;
		b= (pri * 3)+ ter;
		
		double c=0;
		c= ter*ter*ter;
		
		System.out.println("O produto do dobro do primeiro com metade do segundo = "+ a);
		System.out.println("a soma do triplo do primeiro com o terceiro = "+ b);
		System.out.println("o terceiro elevado ao cubo = " + c);
				

	}

}
