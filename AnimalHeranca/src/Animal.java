
public abstract class Animal {
	protected double peso;
	protected int idade, membros;
	protected static int qtd;
	
	
	public Animal(double peso, int idade, int membros) {
		this.peso=peso;
		this.idade=idade;
		this.membros=membros;
		Animal.qtd=qtd+1;
	}
	

	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	public static int quantidadeAnimal() {
		return Animal.qtd;
	};
	

	
}
