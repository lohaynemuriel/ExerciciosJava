package pacote;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 
public class Arquivo01 {
    public static void main(String[] args) {
        String nome = "Lohyane Muriel";
        int idade = 17;
        double temperatura = 25;
        FileWriter gravaArquivo = null;
        try {
    		gravaArquivo.write("<htm>\n");
			gravaArquivo.write("<body>\n");
			gravaArquivo.write(" <table cellspacing='0' cellpadding='0' width='50%' align='center' border='1'>\n");
			gravaArquivo.write("   <tr><td align='center' colspan='3'><b>Relação e Clientes</b></td></tr>\n");
			gravaArquivo.write("   <tr>\n");
			gravaArquivo.write("      <th>Nome</th>\n");
			gravaArquivo.write("      <th>e-mail</th>\n");
			gravaArquivo.write("      <th>Telefone</th>\n");
			gravaArquivo.write("   </tr>\n");
			gravaArquivo.write("   <tr>\n");
			gravaArquivo.write("      <td>Manoel da Silva</td>\n");
			gravaArquivo.write("      <td>mane@mane.com.br</td>\n");
			gravaArquivo.write("      <td>(11) 99999-9999</td>\n");
			gravaArquivo.write("   </tr>\n");
			gravaArquivo.write("   <tr>\n");
			gravaArquivo.write("      <td>Jose da Silva</td>\n");
			gravaArquivo.write("      <td>jose@jose.com.br</td>\n");
			gravaArquivo.write("      <td>(11) 99999-0999</td>\n");
			gravaArquivo.write("   </tr>\n");
			gravaArquivo.write("  </table>\n");
			gravaArquivo.write("</body>\n");
			gravaArquivo.write("</html>\n");

        	gravaArquivo.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
         
        System.out.println("Fim");
         
    }
 
}