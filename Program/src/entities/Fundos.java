package entities;

public class Fundos extends Blueprint{
	
	public String fundo1 = "Fundo EconoGen Small Caps";
	public String fundo2 = "Fundo EconoLow Renda Fixa";
	public String fundo3 = "Fundo EconoMissinaria FlagShip 11";
	private int objetivo;
	
	@Override
	public double plano(int objetivo) {
		 this.getObjetivo();
		if(objetivo == 1) {
			System.out.println("Seu objetivo � a CASA PR�PRIA"); // 299
			System.out.println("Poupe por m�s: R$"+ super.poupar()); 
			System.out.println("Invista por m�s: R$" + super.investir()); 
			System.out.printf("O melhor fundo de investimento para voc� �: %s com 20% de rendimento ao ano%n", fundo3);
			return (super.investir() + super.poupar()) * 0.20;
		}
		if(objetivo == 2) {
			System.out.println("Seu objetivo � um CARR�O"); // 59
			System.out.println("Poupe por m�s: R$"+ super.poupar());
			System.out.println("Invista por m�s: R$" + super.investir()); 
			System.out.printf("O melhor fundo de investimento para voc� �: %s com 20% de rendimento ao ano%n", fundo3);
			return (super.investir() + super.poupar()) * 0.20;
		}
		if(objetivo == 3) {
			System.out.println("Seu objetivo � VIAJAR E RELAXAR"); //10
			System.out.println("Poupe por m�s: R$"+ super.poupar());
			System.out.println("Invista por m�s: R$" + super.investir());
			System.out.printf("O melhor fundo de investimento para voc� �: %s com 40% de rendimento ao ano%n", fundo1);
			return (super.investir() + super.poupar()) * 0.40;
		}
		if(objetivo == 4) {
			System.out.println("Seu objetivo � SE APOSENTAR COM AS PERNAS PRO AR"); // 1 mm
			System.out.println("Poupe por m�s: R$"+ super.poupar()); 
			System.out.println("Invista por m�s: R$" + super.investir());
			System.out.printf("O melhor fundo de investimento para voc� �: %s com 10% de rendimento ao ano%n", fundo2);
			return (super.investir() + super.poupar()) * 0.10;
		}
		else {
			return 0.0;
		}
		
	}

	public int getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(int objetivo) {
		this.objetivo = objetivo;
	}
	
}
