import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Operacoes {
	public static void escrever(File f, String texto) throws IOException {
			FileWriter fw = new FileWriter(f, true); 
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(texto); //Escreve no arquivo
			bw.newLine();   //Quebra de linha
			bw.close();		//Fecha o Buffered
	}
	
	public static File criar(String nome) throws IOException{
		File f = new File("C:/Users/ricog/Desktop/"+nome+".txt"); //Cria o arquivo
		if (!f.exists()) {  // Verifica se o arquivo existe
            f.createNewFile(); //Senão existir gera o arquivo
        }
		return f;
	}
	
	public static int menu(){
		Scanner teclado=new Scanner(System.in);
		int opc;
		System.out.println("Escolha opção desejada: ");
        System.out.println("1-Inserir outro nome");
        System.out.println("2-Exibir conteúdo do arquivo");
        opc=teclado.nextInt();
        return opc;
	}
		
}
