package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import modelo.Cliente;
import modelo.ContaCorrente;

public class TesteSerializacaoConta {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Cliente cliente = new Cliente();
		cliente.setNome("NomeTeste");
		cliente.setCpf("1232323232");
		cliente.setProfissao("profissãoTeste");
		
		ContaCorrente cc = new ContaCorrente(12122,11);
		cc.deposita(1000);
		cc.setTitular(cliente);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();

	}


}
