package models;

public class Cliente extends Pessoa {

    public Cliente(String nome, String telefone, String cpf, String email) {
        super(nome, telefone, cpf, email);
    }

    public String visualizarDadosDoCliente(){
        return "Nome: " + getNome() + "CPF: " + getCpf();
    }

    public String visualizarImoveis() {
        return getImoveis().toString();
    }
}
