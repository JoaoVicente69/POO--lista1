/*.João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o
estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar
uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa
que leia a variável peso (peso de peixes) e verifique se há excesso. Se houver, gravar na
variável excesso e na variável multa o valor da multa que João deverá pagar. Caso
contrário mostrar tais variáveis com o conteúdo ZERO OU NEGATIVO.*/
import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("quantos Kg de peixe você pescou?");
		double kg=0;
		kg=entrada.nextDouble();
		
		if(kg>50) {
			double multa = 0;
			double excesso=0;
			excesso=kg-50;
			multa =excesso* 4.00;
				System.out.println("Você ira pagar de multa R$"+ multa +" por " +excesso+"Kg a mais do que o permitido" );
		}else {
			 int multa = 0;
			 int excesso = 0;
			 System.out.println("multa = " +multa+"excesso = " +excesso);
		}
				
		
	}
	
		
}
