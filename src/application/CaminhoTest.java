package application;

import java.io.File;
import java.util.Scanner;

public class CaminhoTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o caminho da pasta: ");
		String strgPath = sc.nextLine();
		
		File path = new File(strgPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean sucess = new File(strgPath + "\\subpasta").mkdir();
		System.out.println("Diretório criado com sucesso: " + sucess);
		
		sc.close();

	}

}
