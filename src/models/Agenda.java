package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Agenda {

    private List<Integer> diasDaSemana; //de 1 a 7
    private List<Integer> diasDeTrabalho;

    private Funcionario funcionario;

    public Agenda () {
        this.diasDaSemana = new ArrayList<>();
        this.diasDaSemana.add(1);
        this.diasDaSemana.add(2);
        this.diasDaSemana.add(3);
        this.diasDaSemana.add(4);
        this.diasDaSemana.add(5);
        this.diasDaSemana.add(6);
        this.diasDaSemana.add(7);
    }

    public void verificarDatasDisponiveis(){

    }

    public void verificarSeDataEstaDisponivel(Date data){

    }

    public void verificarCompromissos(Date dataInicial, Date dataFinal) {

    }

    public String visualizarFuncionario() {
        return "Nome: " + funcionario.getNome() + " Perfil: " + funcionario.getPerfil();
    }
}
