package modelo;

import java.io.Serializable;

/**
 * 
 * @author Lucas Santos
 * o '/**' é utilizado para documentar o código, descrevendo a classe
 * @version 1.0.0
 *
 */

public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
	private String nome;
    private String cpf;
    private String profissao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

}
