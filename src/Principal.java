import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) throws IOException{
		Scanner teclado=new Scanner(System.in);
		String nome,texto,texto_novo;
		int opc;
		System.out.println("Qual nome do arquivo? ");
		nome=teclado.next();
		File f=Operacoes.criar(nome);
		System.out.println("Qual nome quer inserir no arquivo? ");
		texto=teclado.next();
		Operacoes.escrever(f,texto);
		boolean ok=true;
		while(ok){
			try {
					do{ 
		        		opc=Operacoes.menu();
			        	if (opc==1){
				        	System.out.println("Qual nome quer inserir no arquivo? ");
				        	texto_novo=teclado.next();
				        	Operacoes.escrever(f,texto_novo);
				        }
				        else if(opc==2){
				        	FileReader fr = new FileReader(f);
				        	BufferedReader br = new BufferedReader(fr);
				        	while (br.ready()) {
				        		//lê a proxima linha
				        		String linha = br.readLine();
				        		 
				        		//faz algo com a linha
				        		System.out.println(linha);
				        		ok=false;
				        	}
				        }else{
			        		System.out.println("Opção inválida");
			        		Operacoes.menu();
			        	}
					}while(opc==1);
				     
		        	
		        } catch (InputMismatchException e) {
		            System.out.println("Por favor, digite apenas números!");
		        }
	
		}
	}
	
}
