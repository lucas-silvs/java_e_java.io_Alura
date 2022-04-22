package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.io.Reader;

public class TesteLeitura {
	
	public static void main(String[] args) throws IOException {
		

		
		InputStream fis = new FileInputStream("texto.txt");
		Reader isr = new InputStreamReader(fis,"UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		
		String linha = br.readLine();
		
		System.out.println(linha);
		
	}
	
	
	

}
