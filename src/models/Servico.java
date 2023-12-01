package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Servico {

    private String local;
    private Double valor;
    private Date dataHoraCotacao;
    private Date dataHoraExecucao;
    private int avaliacao;
    private Imovel imovel;
    private List<Funcionario> faxineiros;
    private Funcionario gerente;
    private Fatura fatura;

    public Servico(String local) {
        this.local = local;
        this.faxineiros = new ArrayList<>();
    }

    public String avaliar(int nota) {
        this.avaliacao = nota;
        return "avaliado com nota: " + nota + "!";
    }

    public void adicionarMembro(Funcionario funcionario) {
        this.faxineiros.add(funcionario);
    }

    public void marcarVisitaParaCotacao(Date data, Imovel imovel, Funcionario gerente) {
        this.dataHoraCotacao = data;
        this.imovel = imovel;
        this.gerente = gerente;
    }

    public void marcarRealizacaoDoServico(Date data) {
        this.dataHoraExecucao = data;
    }

}
