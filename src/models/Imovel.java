package models;

import java.util.ArrayList;
import java.util.List;

public class Imovel {

    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private Cliente cliente;
    private List<Servico> servicos;

    public Imovel(String logradouro, String numero, String complemento, String bairro, String cidade, String estado, String cep, Cliente cliente) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.cliente = cliente;
        this.servicos = new ArrayList<>();
    }

    public String visualizarDadosImovel(){
        return "Endereço: " + logradouro + " nº " + numero;
    }

    public String visualizarDadosProprietario() {
        return cliente.visualizarDadosDoCliente();
    }

    public String visualizarHistoricoServicos() {
        return servicos.toString();
    }

}
