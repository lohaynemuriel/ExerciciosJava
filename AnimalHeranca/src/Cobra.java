
public class Cobra extends Reptil{
	
	public Cobra(double peso, int idade, int membros, String corEscama) {
		super(peso,idade,membros,corEscama);
	}

	@Override
	public void locomover() {
		System.out.println("Rastejando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Ovo");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Shhhhh");
		
	}
	

	
			
}
