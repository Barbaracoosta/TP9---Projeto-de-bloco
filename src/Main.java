import models.Cliente;
import models.Funcionario;
import models.Imovel;
import models.Servico;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Funcionario recepcionista = new Funcionario("Recepcionista Teste", "81999999999", "9999999999", "email", "Recepcionista");
        Funcionario gerente = new Funcionario("Gerente Teste", "81999999999", "9999999999", "email", "Gerente");
        Funcionario faxineiro = new Funcionario("Faxineiro Teste", "81999999999", "9999999999", "email", "Faxineiro");

        Cliente cliente = new Cliente("models.Cliente Teste", "81999999999", "9999999999", "email");

        Imovel imovel = new Imovel("Rua 6", "116", "Casa", "Recife", "Recife", "Pernambuco", "5211000", cliente);
        cliente.getImoveis().add(imovel);

        //Recepcionista cria ordem de serviço para o local
        Servico servico = new Servico("Predio na Rua 6");

        //Recepcionista marca visita para cotacao
        servico.marcarVisitaParaCotacao(new Date(), imovel, gerente);

        //Gerente marca execucao do servico
        servico.marcarRealizacaoDoServico(new Date());
    }
}