package pacote;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class LeituraArquivo {

	public static void main(String[] args) {
		FileReader arquivo;
		
		try {
			arquivo = new FileReader("E:/Lohayne/Java/Java2.0/Exemplo1/arquivoTeste.csv");
			BufferedReader lerArquivo = new BufferedReader(arquivo);
			int numeroLinha = 0;
			Socio objSocio = new Socio();
			String linha = lerArquivo.readLine(); //lendo a primeira linha do arquivo
			
			while(linha != null) {
				numeroLinha++;
				String [] dadosSocio = linha.split(";"); //separa o texto por ;
				objSocio.setNome(dadosSocio[0]);
				objSocio.setEndereco(dadosSocio[1]);
				objSocio.setTelefone(dadosSocio[2]);
				objSocio.setEmail(dadosSocio[3]);
				
				System.out.println("Linha: "+ numeroLinha);
				System.out.println("Nome: "+ objSocio.getNome());
				System.out.println("Endereço: "+ objSocio.getEndereco());
				System.out.println("Telefone: "+ objSocio.getTelefone());
				System.out.println("Email: "+ objSocio.getEmail());

				linha = lerArquivo.readLine();
			}
			
			arquivo.close();
		}catch (IOException ex){
			System.err.printf("Erro na abertura do arquivo:  %s \n" , ex.getMessage());
		}
	}

}
