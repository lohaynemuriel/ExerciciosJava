package pacote;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 
public class ListaCSV {
    public static void main(String[] args) {
        String[] lista = new String[3];
        lista [0] = "Manoel da Silva,mane@mane.com.br,(11) 99999-9999";
        lista [1] = "Jose da Silva,jose@jose.com.br,(11) 99999-0999";
        lista [2] = "Bertolino Astolfo,berto@berto.com.br,(11) 99999-0999";
        FileWriter gravaArquivo;
        try {
        	gravaArquivo = new FileWriter(new File("arquivoTeste.txt"));
			gravaArquivo.write("nome,email,telefone\n");
			for (int i = 0; i < 3; i++) {
			    gravaArquivo.write(lista[i] + "\n");
			}
			gravaArquivo.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("Fim");      
    }
 
}
