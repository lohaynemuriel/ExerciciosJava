
public class Mamifero extends Animal{
	String corPelo;
	
	public Mamifero(double peso, int idade, int membros, String corPelo) {
		super(peso,idade,membros);
		this.corPelo=corPelo;
	}

	@Override
	public void locomover() {
		System.out.println("Caminhando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Carne ou frutas");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Rosnam");
		
	}
	
}
