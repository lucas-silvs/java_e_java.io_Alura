package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteLeitura2 {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("conta.csv"));
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			
			System.out.println(linha);
			
		}
		
		
	}

}
