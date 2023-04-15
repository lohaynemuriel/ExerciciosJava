public class Livro implements Publicacao{
	private String titulo, autor;
	private int totalPag, pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public Livro(String titulo, String autor, int totalPag, int pagAtual, Pessoa leitor) {
		this.titulo=titulo;
		this.autor=autor;
		this.totalPag=totalPag;
		this.pagAtual=0;
		this.aberto=false;
		this.leitor=leitor;
	}

	public String Detalhes() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", totalPag=" + totalPag + ", pagAtual=" + pagAtual
				+ ", aberto=" + aberto + ", leitor=" + leitor + "]";
	}

	@Override
	public void Abrir() {
		this.aberto=true;
		
	}

	@Override
	public void Fechar() {
		this.aberto=false;
		
	}

	@Override
	public void Folhear(int pag) {
		if(pag<this.totalPag && pag>0) {
			this.pagAtual=pag;
		}
		
		
	}

	@Override
	public void AvançarPagina() {
		if(pagAtual++<totalPag) {
			this.pagAtual++;
		}
		
		
	}

	@Override
	public void VoltarPagina() {
		if(pagAtual-->0) {
			this.pagAtual--;
		}
	
		
	}
	
	
}
