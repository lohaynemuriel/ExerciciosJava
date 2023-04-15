
public  class Reptil extends Animal{
	String corEscama;
	
	public Reptil(double peso, int idade, int membros,String corEscama) {
		super(peso,idade,membros);
		this.corEscama=corEscama;
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
