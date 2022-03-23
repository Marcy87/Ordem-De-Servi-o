package entities;

import entities.enums.StatusOrdemServico;

import java.util.Scanner;

public class OrdemServico {

    Scanner teclado = new Scanner(System.in);

    //Atributos
    private String placa;
    private Integer numOrdemServico;
    private StatusOrdemServico status;

    //Método Construtor
    public OrdemServico(String placa, Integer numOrdemServico, StatusOrdemServico status){
        this.placa = placa;
        this.numOrdemServico = numOrdemServico;
        this.status = status;
    }

    //MÉTODOS DE ACESSO SET E GET
    public void setNumOrdemServico(Integer numOrdemServico){
        this.numOrdemServico = numOrdemServico;
    }

    public Integer getNumOrdemServico(){
        return numOrdemServico;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca(){
        return placa;
    }

    private void setStatus(StatusOrdemServico status){
        this.status = status;
    }

    public StatusOrdemServico getStatus(){
        return status;
    }

    //STATUS ORDEM DE SERVIÇO
    public void aguardandoOrcamento(){
        this.status = StatusOrdemServico.AGUARDANDO_ORCAMENTO;
    }

    public void orcamentoAprovado(){
        this.status = StatusOrdemServico.ORCAMENTO_APROVADO;
    }

    public void execucaoServico(){
        this.status = StatusOrdemServico.EXECUCAO_SERVICOS;
    }

    public void servicoFinalizado(){
        this.status = StatusOrdemServico.SERVICO_FINALIZADO;
    }

    public void aguardandoRetiradaVeiculo(){
        this.status = StatusOrdemServico.AGUARDANDO_RETIRADA_VEICULO;
    }

    public void finalizada(){
        this.status = StatusOrdemServico.FINALIZADA;
    }
}
