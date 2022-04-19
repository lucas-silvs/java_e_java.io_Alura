package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteSeparaLinha {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("conta.csv"));
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			
			Scanner linhaScanner = new Scanner(linha);
			
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			String valor1 = linhaScanner.next();
			int valor2 = linhaScanner.nextInt();
			int valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			double valor5 = linhaScanner.nextDouble();

			
			
			String formatado = String.format("%s - %04d-%08d, %s: %08.2f",valor1,valor2,valor3,valor4,valor5);
			System.out.println(formatado);


			
			
			//System.out.println(linha);
			
//			String[] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));
			
		}
		
		
	}

}
