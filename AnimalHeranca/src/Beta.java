
public class Beta extends Peixe{
	public Beta(double peso, int idade, int membros, String corEscama) {
		super(peso,idade,membros, corEscama);
	}

	@Override
	public void locomover() {
		System.out.println("Nada");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Peixes e algas");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Bluo");
		
	}
	
	public void soltarBolha() {
			System.out.println("Solta bolhas");
	}
	
	
}
