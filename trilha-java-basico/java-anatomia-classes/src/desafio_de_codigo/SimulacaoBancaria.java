package desafio_de_codigo;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            double valor;

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Digite o valor: ");
                    valor = scanner.nextDouble();
                    saldo += valor;
                    System.out.printf("Saldo atual: %.1f ", saldo);
                    break;

                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Informe o valor que ira sacar");
                    valor = scanner.nextDouble();
                    if (saldo < valor) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valor;
                        System.out.printf("Saldo atual: %.1f", saldo);
                    }
                    break;

                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.printf("Saldo atual: %.1f", saldo);

                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false; // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}