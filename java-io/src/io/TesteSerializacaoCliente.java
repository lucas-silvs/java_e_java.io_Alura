package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import modelo.Cliente;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Cliente cliente = new Cliente();
		cliente.setNome("NomeTeste");
		cliente.setCpf("1232323232");
		cliente.setProfissao("profissãoTeste");
		
		
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		Cliente clienteRetorno = (Cliente) ois.readObject();
		ois.close();
		
		System.out.println(clienteRetorno.getNome());

	}


}
