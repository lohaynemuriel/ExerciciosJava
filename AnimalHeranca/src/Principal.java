import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double peso;
		int idade, membros, opcao;
		String corPelo, corEscama, corPena, frase, isDono, periodo;
		
		
		Scanner entrada=new Scanner(System.in);
		
		
		System.out.println("Insira as informações abaixo:");
		System.out.println("Peso do animal:");
		peso=entrada.nextDouble();
		System.out.println("Idade do animal:");
		idade=entrada.nextInt();
		System.out.println("Membros do animal:");
		membros=entrada.nextInt();
	
		System.out.println("Que tipo é o seu animal:"
				+ "\n1.Mamifero"
				+ "\n2.Reptil"
				+ "\n3.Peixe"
				+ "\n4.Ave");
		
		opcao=entrada.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Cor do pelo:");
			corPelo=entrada.next();
			System.out.println("Qual animal:"
					+ "\n1.Canguru"
					+ "\n2.Cachorro");
			
			opcao=entrada.nextInt();
			switch(opcao) {
			case 1:
			Canguru canguru= new Canguru(peso, idade, membros, corPelo);
			System.out.println("Foi criado com sucesso\n");
			canguru.usarBolsa();
			canguru.locomover();
			break;
			
			case 2:
				System.out.println("Qual a frase?");
				frase=entrada.next();
				System.out.println("Voce é o dono?");
				isDono=entrada.next();
				System.out.println("Qual o periodo?");
				periodo=entrada.next();
				Cachorro cachorro=new Cachorro(peso, idade, membros, corPelo, frase, isDono, periodo);
				System.out.println("Foi criado com sucesso\n");
				cachorro.enterraOsso();
				cachorro.abanarRabo();
				break;
			}
			
			break;
		case 2:
			System.out.println("Cor da escama:");
			corEscama=entrada.next();
			
			System.out.println("Qual animal:"
					+ "\n1.Cobra"
					+ "\n2.Tartaruga");
			
			opcao=entrada.nextInt();
		
			switch(opcao) {
			case 1:
				Cobra cobra= new Cobra(peso, idade, membros, corEscama);
				System.out.println("Foi criado com sucesso\n");
				break;
				
			case 2:
				Tartaruga tartaruga= new Tartaruga(peso, idade, membros, corEscama);
				System.out.println("Foi criado com sucesso\n");
				tartaruga.locomover();
				break;
				
			}
			break;
			
		case 3:
			System.out.println("Cor da escama:");
			corEscama=entrada.next();
			
			Beta beta= new Beta(peso, idade, membros, corEscama);
			System.out.println("Foi criado com sucesso\n");
			break;
			
		case 4:
			System.out.println("Cor da pena:");
			corPena=entrada.next();
			Arara arara= new Arara(peso, idade, membros, corPena);
			System.out.println("Foi criado com sucesso\n");
		
			break;
		}
	}
	

}
