package models;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {
    private String perfil;
    private List<Servico> servicos;
    private Agenda agenda;

    public Funcionario(String nome, String telefone, String cpf, String email, String perfil) {
        super(nome, telefone, cpf, email);
        this.perfil = perfil;
        this.servicos = new ArrayList<>();
        this.agenda = new Agenda();
    }

    public String getPerfil() {
        return perfil;
    }

}
