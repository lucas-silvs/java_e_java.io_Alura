package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		String nome = "Lucas Santos";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		
		oos.writeObject(nome);
		
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nomeRetorno = (String) ois.readObject();
		ois.close();
		
		System.out.println(nomeRetorno);

	}

}
