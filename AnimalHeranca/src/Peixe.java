
public class Peixe extends Animal {
	String corEscama;
	
	public Peixe(double peso, int idade, int membros, String corEscama) {
		super(peso,idade,membros);
		this.corEscama=corEscama;
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
