/*.Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
rendimento di�rio de seu trabalho. Toda vez que ele traz um peso de peixes maior que o
estabelecido pelo regulamento de pesca do estado de S�o Paulo (50 quilos) deve pagar
uma multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um programa
que leia a vari�vel peso (peso de peixes) e verifique se h� excesso. Se houver, gravar na
vari�vel excesso e na vari�vel multa o valor da multa que Jo�o dever� pagar. Caso
contr�rio mostrar tais vari�veis com o conte�do ZERO OU NEGATIVO.*/
import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("quantos Kg de peixe voc� pescou?");
		double kg=0;
		kg=entrada.nextDouble();
		
		if(kg>50) {
			double multa = 0;
			double excesso=0;
			excesso=kg-50;
			multa =excesso* 4.00;
				System.out.println("Voc� ira pagar de multa R$"+ multa +" por " +excesso+"Kg a mais do que o permitido" );
		}else {
			 int multa = 0;
			 int excesso = 0;
			 System.out.println("multa = " +multa+"excesso = " +excesso);
		}
				
		
	}
	
		
}
