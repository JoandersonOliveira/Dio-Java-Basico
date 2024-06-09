package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int parametro1 = scan.nextInt();
        int parametro2 = scan.nextInt();

        try {
            contar(parametro1, parametro2);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");

        }
    }

    static void contar(int valor1, int valor2) throws ParametrosInvalidosException {
        int contagem = (valor2 - valor1);

        if (valor1 > valor2) {
            throw new ParametrosInvalidosException();
        }

        for (int x = 0; x < contagem; x++) {
            System.out.println("Imprimindo o numero " + (x +1));
        }
    }
}
