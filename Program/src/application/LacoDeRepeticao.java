package application;

import java.util.Locale;
import java.util.Scanner;

public class LacoDeRepeticao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
		 * coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja
		 * saber: 
		 * a) m�dia do sal�rio da popula��o; 
		 * b) m�dia do n�mero de filhos; 
		 * c) maior sal�rio; 
		 * d) percentual de pessoas com sal�rio at� R$100,00.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		float salarioPopulacao=0, maiorSalario=0, percentualMaiorSalario=0, mediaSalario=0, somaSalario=0, menorQue100=0,numeroFilhos=0, habitantes=2, mediaFilhos=0, somaFilhos=0;
		

		for (int i = 0; i < habitantes; i++) {
			System.out.print("Digite o seu sal�rio: ");
			salarioPopulacao = sc.nextFloat();
			
			somaSalario += salarioPopulacao;

			System.out.print("Digite o n�mero de filhos: ");
			numeroFilhos = sc.nextFloat();
			
			somaFilhos += numeroFilhos;
			
			System.out.println();
			
			if(salarioPopulacao > maiorSalario) maiorSalario = salarioPopulacao;
			if(salarioPopulacao <= 100) percentualMaiorSalario +=1;
			
		}
		
			mediaSalario = somaSalario / habitantes;
			mediaFilhos = somaFilhos / habitantes;
			menorQue100 = (percentualMaiorSalario * 100) / habitantes;
			
			System.out.print("\nM�dia Salarial: " + mediaSalario);
			System.out.print("\nM�dia de Filhos: " + mediaFilhos);
			System.out.print("\nMaior Sal�rio: " + maiorSalario);
			System.out.print("\nPercentual de pessoas com sal�rio maior que 100: " + menorQue100 + "%");

		sc.close();

	}

}
