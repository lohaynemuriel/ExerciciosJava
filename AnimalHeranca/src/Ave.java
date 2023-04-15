
public class Ave extends Animal{
String corPena;
	
	public Ave(double peso, int idade, int membros, String corPena) {
		super(peso,idade,membros);
		this.corPena=corPena;
	}

	@Override
	public void locomover() {
		System.out.println("Voa");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Peixes e carcassa");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Nhaaaa");
		
	}
	public void fazerNinho() {
		System.out.println("Fazem ninho");
	}
	
	


}
