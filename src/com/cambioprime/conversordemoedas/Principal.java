package com.cambioprime.conversordemoedas;

import com.cambioprime.conversordemoedas.modelo.Moeda;
import com.cambioprime.conversordemoedas.servico.ConversorMoeda;
import com.cambioprime.conversordemoedas.servico.ServicoMoeda;

import java.util.Map;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try {
            ServicoMoeda servicoMoeda = new ServicoMoeda();
            Map<String, Moeda> taxasDeCambio = servicoMoeda.obterTaxasDeCambio();
            ConversorMoeda conversorMoeda = new ConversorMoeda(taxasDeCambio);

            Scanner scanner = new Scanner(System.in);
            while (true) {

                System.out.println("****************************************************************");
                System.out.println("----------------------------------------------------------------");
                System.out.println("██████╗  █████╗ ███╗   ███╗██████╗ ██╗ ██████╗ ");
                System.out.println("██╔════╝██╔══██╗████╗ ████║██╔══██╗██║██╔═══██╗");
                System.out.println("██║     ███████║██╔████╔██║██████╔╝██║██║   ██║");
                System.out.println("██║     ██╔══██║██║╚██╔╝██║██╔══██╗██║██║   ██║");
                System.out.println("╚██████╗██║  ██║██║ ╚═╝ ██║██████╔╝██║╚██████╔╝");
                System.out.println(" ╚═════╝╚═╝  ╚═╝╚═╝     ╚═╝╚═════╝ ╚═╝ ╚═════╝ ");
                System.out.println("██████╗  ██████╗ ██╗███╗   ███╗███████╗");
                System.out.println("██╔══██╗██╔═══██╗██║████╗ ████║██╔════╝");
                System.out.println("██████╔╝██║   ██║██║██╔████╔██║█████╗  ");
                System.out.println("██╔═══╝ ██║   ██║██║██║╚██╔╝██║██╔══╝  ");
                System.out.println("██║     ██║   ██║██║██║ ╚═╝ ██║███████╗");
                System.out.println("╚═╝     ╚═╝   ╚═╝╚═╝╚═╝     ╚═╝╚══════╝");

                System.out.println("----------------------------------------------------------------");
                System.out.println("****************************************************************");

                System.out.println("Bem vindo a Cambio Prime, a sua casa de cambio!");
                System.out.println("Qual moeda você deseja realizar a conversão? ");
                System.out.println("1. BRL para USD (Dólar Americano)");
                System.out.println("2. BRL para EUR (Euro)");
                System.out.println("3. BRL para GBP (Libra Esterlina)");
                System.out.println("4. BRL para JPY (Iene Japonês)");
                System.out.println("5. BRL para AUD (Dólar Australiano)");
                System.out.println("6. BRL para CAD (Dólar Canadense)");
                System.out.println("0. Sair do sistema");
                System.out.print("Escolha uma opção: ");

                try {
                    int escolha = scanner.nextInt();

                    if (escolha == 0) {
                        System.out.println("Agradecemos sua visita a Cambio Prime.");
                        break; // Sai do loop while
                    }

                    System.out.print("Digite o valor em BRL: ");
                    double valor = scanner.nextDouble();

                    String moedaDestino;
                    switch (escolha) {
                        case 1:
                            moedaDestino = "USD";
                            break;
                        case 2:
                            moedaDestino = "EUR";
                            break;
                        case 3:
                            moedaDestino = "GBP";
                            break;
                        case 4:
                            moedaDestino = "JPY";
                            break;
                        case 5:
                            moedaDestino = "AUD";
                            break;
                        case 6:
                            moedaDestino = "CAD";
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            continue;
                    }

                    if (taxasDeCambio.containsKey("BRL") && taxasDeCambio.containsKey(moedaDestino)) {
                        double valorConvertido = conversorMoeda.converter("BRL", moedaDestino, valor);
                        System.out.printf
                                ("Valor convertido: %.2f %s%n", valorConvertido, moedaDestino);
                    } else {
                        System.out.println("Taxa de câmbio não disponível para a moeda selecionada.");
                    }
                } catch (Exception e) {
                    System.out.println("Entrada inválida, por favor tente novamente.");
                    scanner.nextLine(); // limpa o buffer do scanner
                }
            }
        } catch (Exception e) {
            e.printStackTrace();

            System.out.println("Ocorreu um erro ao obter as taxas de câmbio. Tente novamente mais tarde.");
        }
    }
}