
public class Cachorro extends Mamifero{
	String frase, isDono, periodo;
	public Cachorro(double peso, int idade, int membros, String corPelo, String frase, String isDono, String periodo) {
		super(peso,idade,membros, corPelo);
		this.frase=frase;
		this.isDono=isDono;
		this.periodo=periodo;
		
	}

	@Override
	public void locomover() {
		System.out.println("Caminha");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Raçao");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Late Au Au");
		
	}
	
	public void enterraOsso() {
		System.out.println("Enterra osso");
	}
	
	public void abanarRabo() {
		System.out.println("Abana rabo");
	}
	
public String reagir(String frase) {
		
		if(frase.toUpperCase().equals("AGRADAVEL")) {
			
			return "abanar e latir";
			
		}
		
		return "Rosnar";
		
	}
	
	public String reagir(int periodo) {
		
		if(periodo==1) {
			
			return "Abanar";
			
		}else {
			
			if(periodo==2) {
				return "Abanar e latir";
			}
			
		}
		
		return "rosnar";
		
	}
	
	public String reagir(boolean isDono) {
		
		if(isDono) {
			
			return "Abanar";
			
		}
		
		return "Rosnar e latir";
		
	}

	public String reagir(int idade, double peso) {
		
		if(idade<=7 && peso<=20.0) {
			
			return "abanar";
			
		}else {
			
			if(idade<=7 && peso>20.0) {
				return "latir";
			}else {
				
				if(idade>7 && peso<=20.0) {
					return "rosnar";
				}
				
			}
			
		}
		
		return "ignorar";
		
	}
}
