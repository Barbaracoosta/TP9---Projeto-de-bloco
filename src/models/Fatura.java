package models;

import java.util.Date;

public class Fatura {

    public Double valor;
    public Date dataEmissao;
    public Date dataVencimento;
    public Double valorPago;
    public Servico servico;

    public void atualizarPagamento(Double valor) {
        this.valorPago = valor;
    }

}
