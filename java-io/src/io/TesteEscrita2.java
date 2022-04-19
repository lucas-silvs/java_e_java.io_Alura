package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscrita2 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("escrita2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Lucas Santos");
		bw.newLine();
		bw.newLine();
		bw.write("Bolado dms");
		
		bw.flush();
	}

}
