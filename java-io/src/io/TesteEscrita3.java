package io;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscrita3 {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter ps = new PrintWriter("escrita2.txt");
		
		//PrintStream ps = new PrintStream("escrita2.txt");
		
		ps.println("pulando linha");
		ps.println();
		ps.println("linha abaixo");
		
		ps.close();
		
		

	}

}
