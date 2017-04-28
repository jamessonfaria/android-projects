package jamesson.com.br.ex02_activity;

import java.io.Serializable;

/**
 * Created by jamesson on 4/28/17.
 */

public class ClienteSerializable implements Serializable{

    public String nome;
    public int idade;

    public ClienteSerializable(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
