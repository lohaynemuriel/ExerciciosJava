public class Video implements AcoesVideo{
	String titulo;
	int avaliacao, views, curtidas;
	boolean reproduzir;
	
	public Video(String titulo) {
		this.titulo=titulo;
		this.avaliacao=0;
		this.views=0;
		this.curtidas=0;
		this.reproduzir=false;
	}

	public String Detalhes() {
		return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas
				+ ", reproduzir=" + reproduzir + "]";
	}

	@Override
	public void play() {
		if(this.reproduzir==false) {
			this.reproduzir=true;
		}
		
	}

	@Override
	public void pause() {
		if(this.reproduzir==true) {
			this.reproduzir=false;
		}
		
	}

	@Override
	public void like() {
		curtidas++;
		
	}
	
	
}
