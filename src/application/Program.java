package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Financiamento;

public class Program {

	public static void main(String[] args) {
		
	/*PROGRAMA QUE APROVA OU NÃO UM EMPRÉSTIMO DE UMA CASA. PERGUNTA O VALOR DA CASA, O SALÁRIO DO COMPRADOR,
	 E EM QUANTOS ANOS VAI FINANCIAR. A PRESTAÇÃO NÃO PODE EXCEDER 30% DO SALÁRIO DO COMPRADOR, OU ENTÃO SERÁ NEGADO.*/
		
		Locale.setDefault(Locale.US);
		Scanner t = new Scanner(System.in);
		
		System.out.print("Valor da casa: R$");
		double valor = t.nextDouble();
		System.out.print("Salário do comprador: R$");
		double salario = t.nextDouble();
		System.out.print("Anos de financiamento: ");
		int anos = t.nextInt();
		
		Financiamento f = new Financiamento(valor, salario, anos);
		
		double prestacao = f.prestacao();
		double minimo = f.minimo();
		
		System.out.println(f);
				
		if(prestacao <= minimo) {
			System.out.println("EMPRÉSTIMO CONCEDIDO!");
		} else {
			System.out.println("EMPRÉSTIMO NEGADO!");
		}

	}

}
