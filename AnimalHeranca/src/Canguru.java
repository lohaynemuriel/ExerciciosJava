
public class Canguru extends Mamifero {
	public Canguru(double peso, int idade, int membros, String corPelo) {
		super(peso,idade,membros, corPelo);
	}

	@Override
	public void locomover() {
		System.out.println("Pula");
		
	}

	@Override
	public void alimentar() {
		System.out.println("frutas");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Não faz barulho");
		
	}
	
	public void usarBolsa() {
		System.out.println("Usa bolsa.");
	}
	


}
