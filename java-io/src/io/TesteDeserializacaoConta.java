package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import modelo.Cliente;
import modelo.ContaCorrente;

public class TesteDeserializacaoConta {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		ContaCorrente contaCorrente = (ContaCorrente) ois.readObject();
		ois.close();
		
		System.out.println(contaCorrente.getAgencia());
		//System.out.println(contaCorrente.getTitular().getNome());

	}


}
