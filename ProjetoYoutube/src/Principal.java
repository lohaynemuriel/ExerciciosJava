import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nome, sexo, login, titulo;
		int idade, opcao;
	
		
		Scanner ler=new Scanner(System.in);
		
		Video[] vid=new Video[3];
		
		for(int i=0; i<3; i++) {
			titulo=ler.next();
			vid[i]=new Video(titulo);
			
			System.out.println("O que deseja fazer? "
					+ "1.Play"
					+ "\n2.Pause"
					+ "\n3.Like"
					+ "\n4.Ver detalhes");
			
			opcao=ler.nextInt();
			switch(opcao) {
			case 1:
				vid[i].play();
				break;
				
			case 2:
				vid[i].pause();
				break;
				
			case 3:
				vid[i].like();
				break;
				
			case 4:
				vid[i].Detalhes();
				break;
			}
			
			
		}
		
		Espectador[] esp=new Espectador[2];
		esp[0]=new Espectador("Renato", "M", 32, "renato");
		esp[1]=new Espectador("Lara", "F", 17, "Lara");
		
		for(int i=0; i<2; i++) {
			System.out.println(esp[0].toString());
		}
		
		
		
		
		
		
	}

}
