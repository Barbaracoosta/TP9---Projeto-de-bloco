package models;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String telefone;
    private String cpf;
    private String email;
    private List<Imovel> imoveis;

    public Pessoa(String nome, String telefone, String cpf, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
        this.imoveis = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Imovel> getImoveis() {
        return imoveis;
    }

}
