package application;

import java.util.Scanner;

import entities.Fundos;
import entities.SeuDinheiro;
import entities.Usuario;

public class EconoGen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Usuario usuario = new Usuario();
		SeuDinheiro dinheiro = new SeuDinheiro();
		Fundos fundos = new Fundos();

		int opcao, objetivo, idade;
		String nome;
		Double receita;

		System.out.println(" ====== Seja Bem Vindo ao EconoGen ====== ");
		System.out.println("\nCom os seus OBJETIVOS voc� faz seus sonhos acontecerem.");
		System.out.println(
				"� s� dizer qual o seu SONHO e o VALOR que a gente calcula um prazo e diz o quanto da para guardar por m�s.");

		System.out.print("\nDeseja iniciar? 1-SIM | 2-N�O : ");
		opcao = sc.nextInt();

		if (opcao > 2 || opcao == 0) {
			System.out.println("Op��o inv�lida, tente novamente!");
			System.out.print("\n1Deseja iniciar? 1-SIM | 2-N�O : ");
			opcao = sc.nextInt();
		}

		while (opcao == 1) {
			System.out.print("\nDigite seu nome: ");
			nome = sc.next();
			System.out.printf("Ol�, %s! Vamos come�ar?%n", nome);
			System.out.print("\nQual sua idade? ");
			idade = sc.nextInt();
			if (idade >= 18) {
				System.out.print("Qual sua renda atual em reais: ");
				receita = sc.nextDouble();
				dinheiro.calculoInvestimento(receita);
				dinheiro.calculoPoupanca(receita);
				System.out.print(
						"Qual seu sonho? 1-CASA PR�PRIA | 2-CARRO NOVO | 3-VIAGEM DOS SONHOS | 4-APOSENTADORIA : ");
				objetivo = sc.nextInt();
				System.out.println();
				if (objetivo == 1) {
					System.out.println(usuario.objetivoCasaPropria());
					System.out.printf("Olha, como sua renda mensal � de R$%.2f%n", receita);
					System.out.println(dinheiro.poupar());
					System.out.println(dinheiro.investir());
					System.out.println("Ou seja, separe por m�s um total de R$" + dinheiro.total()
							+ "| lembrando que s� o que � investimento vai sofrer altera��o no ano.");
					System.out.println(fundos.CasaPropria());
					System.out.print("Investindo no fundo R$" + dinheiro.calculoInvestimento(receita)
							+ " por m�s, em 1 ano voc� ter� o equivalente a R$"
							+ fundos.calculoFundoConservador(receita) + " de rendimento.");
					System.out.printf("\nSomando a sua poupan�a com o seu investimento em 1 ano voc� ter� R$%.2f.%n",
							fundos.somaRendimentosCasaPropria(receita));
					System.out.printf("\nSeu sonho se realizar� em %.0f ano(s).%n",
							fundos.calculoAnualCasaPropria(receita));
					System.out.print("\nDeseja continuar? 1-SIM | 2-N�O : ");
					opcao = sc.nextInt();
				}
				if (objetivo == 2) {
					System.out.println(usuario.objetivoCarro());
					System.out.printf("Olha, como sua renda mensal � de R$%.2f%n", receita);
					System.out.println(dinheiro.poupar());
					System.out.println(dinheiro.investir());
					System.out.println("Ou seja, separe por m�s um total de R$" + dinheiro.total()
							+ "| lembrando que s� o que � investimento vai sofrer altera��o no ano.");
					System.out.println(fundos.Carro());
					System.out.print("Investindo no fundo R$" + dinheiro.calculoInvestimento(receita)
							+ " por m�s, em 1 ano voc� ter� o equivalente a R$"
							+ fundos.calculoFundoSofisticado(receita) + " de rendimento.");
					System.out.printf("\nSomando a sua poupan�a com o seu investimento em 1 ano voc� ter� R$%.2f.%n",
							fundos.somaRendimentosCarro(receita));
					System.out.printf("\nSeu sonho se realizar� em %.0f ano(s).%n", fundos.calculoAnualCarro(receita));
					System.out.print("\nDeseja continuar? 1-SIM | 2-N�O : ");
					opcao = sc.nextInt();
				}
				if (objetivo == 3) {
					System.out.println(usuario.objetivoViagem());
					System.out.printf("Olha, como sua renda mensal � de R$%.2f%n", receita);
					System.out.println(dinheiro.poupar());
					System.out.println(dinheiro.investir());
					System.out.println("Ou seja, separe por m�s um total de R$" + dinheiro.total()
							+ "| lembrando que s� o que � investimento vai sofrer altera��o no ano.");
					System.out.println(fundos.Viagem());
					System.out.print("Investindo no fundo R$" + dinheiro.calculoInvestimento(receita)
							+ " por m�s, em 1 ano voc� ter� o equivalente a R$" + fundos.calculoFundoArrojado(receita)
							+ " de rendimento.");
					System.out.printf("\nSomando a sua poupan�a com o seu investimento em 1 ano voc� ter� R$%.2f.%n",
							fundos.somaRendimentosViagem(receita));
					System.out.printf("\nSeu sonho se realizar� em %.0f ano(s).%n", fundos.calculoAnualViagem(receita));
					System.out.print("\nDeseja continuar? 1-SIM | 2-N�O : ");
					opcao = sc.nextInt();
				}
				if (objetivo == 4) {
					System.out.println(usuario.objetivoAposentadoria());
					System.out.printf("Olha, como sua renda mensal � de R$%.2f%n", receita);
					System.out.println(dinheiro.poupar());
					System.out.println(dinheiro.investir());
					System.out.println("Ou seja, separe por m�s um total de R$" + dinheiro.total()
							+ "| lembrando que s� o que � investimento vai sofrer altera��o no ano.");
					System.out.println(fundos.Aposentadoria());
					System.out.print("Investindo no fundo R$" + dinheiro.calculoInvestimento(receita)
							+ " por m�s, em 1 ano voc� ter� o equivalente a R$"
							+ fundos.calculoFundoConservadorAposentadoria(receita) + " de rendimento.");
					System.out.printf("\nSomando a sua poupan�a com o seu investimento em 1 ano voc� ter� R$%.2f.%n",
							fundos.somaRendimentosAposentadoria(receita));
					System.out.printf("\nSeu sonho se realizar� em %.0f ano(s).%n",
							fundos.calculoAnualAposentadoria(receita));
					System.out.print("\nDeseja continuar? 1-SIM | 2-N�O : ");
					opcao = sc.nextInt();
				}
				if (opcao > 2 || opcao == 0) {
					System.out.println("Op��o inv�lida, tente novamente!");
					System.out.print("\nDeseja continuar? 1-SIM | 2-N�O : ");
					opcao = sc.nextInt();
				}
			} else {
				System.out.println(
						"Me desculpe, sei que seus sonhos s�o importantes, mas voc� precisa ter pelo menos 18 anos para continuar conosco.");
				System.out.println("====== At� Mais ====== ");
				break;
			}
		}
		if (opcao == 2) {
			System.out.println("Volte outra hora para continuar a sonhar conosco!");
			System.out.println("====== At� Mais ====== ");
		}

		sc.close();

	}

}
