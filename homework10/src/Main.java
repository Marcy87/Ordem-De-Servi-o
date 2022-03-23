import entities.OrdemServico;
import entities.enums.StatusOrdemServico;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        ArrayList<OrdemServico> orSer = new ArrayList<OrdemServico>();

        int num = 0;

        while (num < 3){
            System.out.println("Escolhe uma Opção");
            System.out.println();
            System.out.println("1 - Criar Ordem de Serviço");
            System.out.println("2 - Mostrar as Informações do Veículo");
            System.out.println("3 - Alterar o Status");
            System.out.println("4 - Sair");

            num = teclado.nextInt();

            switch (num){
                case 1:
                    System.out.print("Informe a placa do veículo: ");
                    String placa = teclado.next();

                    System.out.print("Informe a Ordem de Serviço: ");
                    Integer numServico = teclado.nextInt();

                    StatusOrdemServico status = StatusOrdemServico.AGUARDANDO_ORCAMENTO;

                    OrdemServico os;
                    os = new OrdemServico(placa, numServico, status);
                    orSer.add(os);

                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Dados inseridos");

                    for (OrdemServico orServico : orSer){
                        System.out.println();

                        System.out.println("Placa: " + orServico.getPlaca() + "\nNúmero de Serviço: " + orServico.getNumOrdemServico()
                                           + "\nEstado do Serviço: " + orServico.getStatus());
                    }
                    System.out.println();
                    break;
                case 3:
                    for (OrdemServico orServico : orSer){
                        System.out.println("Deseja alterar o estado da Ordem Serviço (s/n)?");
                        String resp = teclado.next();

                        if (resp.equals("S") || resp.equals("s")){

                            int opc = 0;

                            System.out.println("Escolhe uma Opção");
                            System.out.println();
                            System.out.println("1 - Aguardando Orçamento");
                            System.out.println("2 - Orçamento Aprovado");
                            System.out.println("3 - Execução Serviço");
                            System.out.println("4 - Serviço Finalizado");
                            System.out.println("5 - Aguardando Retirada Veiculo");
                            System.out.println("6 - Finalizado");
                            opc = teclado.nextInt();

                            switch (opc){
                                case 1:
                                    orServico.aguardandoOrcamento();
                                    break;
                                case 2:
                                    orServico.orcamentoAprovado();
                                    break;
                                case 3:
                                    orServico.execucaoServico();
                                    break;
                                case 4:
                                    orServico.servicoFinalizado();
                                    break;
                                case 5:
                                    orServico.aguardandoRetiradaVeiculo();
                                    break;
                                case 6:
                                    orServico.finalizada();
                                    break;
                                default:
                                    System.out.println("Opção errada!!!");
                                    break;
                            }
                            System.out.println("Estado: " + orServico.getStatus());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida!!!");
                    break;
            }
        }


       /*
        System.out.println(os1.getStatus());
        os1.setStatus(StatusOrdemServico.EXECUCAO_SERVICOS);
        System.out.println(os1.getStatus());
        */
    }
}
