public class Espectador extends Pessoa {
	String login;
	int totalAssistindo;
	
	public Espectador(String nome, String sexo, int idade, String login) {
		super(nome, sexo, idade);
		this.login=login;
		this.totalAssistindo=0;
	}

	@Override
	public void ganharExperiencia() {
		int x=this.getExperiencia()+2;
		this.setExperiencia(x);
	}
	
	public void viuMaisUm() {
		totalAssistindo++;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotalAssistindo() {
		return totalAssistindo;
	}

	public void setTotalAssistindo(int totalAssistindo) {
		this.totalAssistindo = totalAssistindo;
	}

	@Override
	public String toString() {
		return "Espectador [login=" + login + ", totalAssistindo=" + totalAssistindo + "]";
	}

	
	
}
