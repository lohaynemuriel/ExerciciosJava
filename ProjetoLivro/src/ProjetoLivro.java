import java.util.Scanner;

public class ProjetoLivro {

	public static void main(String[] args) {
		Pessoa vetorPessoa[] = new Pessoa[2];
		Livro vetorLivros[] = new Livro[2];
		String nome, titulo, autor;
		int idade, totalPag, pagAtual, leitor, pagina;
		String sexo;
		
		Scanner ler=new Scanner(System.in);
		
		for(int i=0; i<2; i++) {
			System.out.println("Nome:");
			nome=ler.next();
			System.out.println("Idade:");
			idade=ler.nextInt();
			System.out.println("Sexo:");
			sexo=ler.next();
			vetorPessoa[i]=new Pessoa(nome, idade, sexo);
		}
		
		for(int i=0; i<3; i++) {
			System.out.println("Titulo:");
			titulo=ler.next();
			System.out.println("Autor:");
			autor=ler.next();
			System.out.println("Total de paginas:");
			totalPag=ler.nextInt();
			System.out.println("Pagina atual:");
			pagAtual=ler.nextInt();
			System.out.println("Qual leitor deseja 1 ou 2?");
			leitor=ler.nextInt();
			vetorLivros[i]=new Livro(titulo, autor, totalPag, pagAtual, vetorPessoa[leitor]);
			
			System.out.println("O que dejesa fazer?"
					+ "1.Abrir Livro"
					+ "2.Folhear Livro"
					+ "3.Avançar Pagina do Livro"
					+ "4.Mostra detalhes do Livro"
					+ "5.Fechar Livro"
					+ "6.Voltar Pagina");
			int opcao=ler.nextInt();
			switch(opcao) {
			case 1:
				vetorLivros[i].Abrir();
				break;
				
			case 2:
				System.out.println("Qual pagina deseja?");
				pagina=ler.nextInt();
				vetorLivros[i].Folhear(pagina);
				break;
				
			case 3:
				vetorLivros[i].AvançarPagina();
				break;
				
			case 4:
				vetorLivros[i].Detalhes();
				break;
				
			case 5:
				vetorLivros[i].Fechar();
				break;
				
			case 6:
				vetorLivros[i].VoltarPagina();
				break;
			}
			
		}

	}

}
