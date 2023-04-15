package pacote;

		import java.io.File;
		import java.io.FileWriter;
		import java.io.IOException;
		 
		public class Principal {
		    public static void main(String[] args) {
		        FileWriter gravaArquivo;
		        try {
		        	gravaArquivo = new FileWriter(new File("arquivoTeste.txt"));
					gravaArquivo.write("nome,email,telefone\n");
					gravaArquivo.write("Lohayne Muriel,lohaynemuriel@gmail.com.br,(11) 99999-9999\n");
					gravaArquivo.write("Larissa Farias,larissafarias@gmail.com.br,(11) 99999-0999\n");
		        	gravaArquivo.close();
		        } catch (IOException ex) {
		            ex.printStackTrace();
		        }
		        System.out.println("Fim");      
		}
		 
}

	