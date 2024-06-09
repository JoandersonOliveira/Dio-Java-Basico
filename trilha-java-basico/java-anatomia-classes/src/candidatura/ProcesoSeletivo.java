package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcesoSeletivo {

    public static void main(String[] args) {
        selecaoCandidatos();

    }

    static void selecaoCandidatos() {
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
                "DANIELA", "JORGE" };

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        // while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
        // String candidato = candidatos[candidatosAtual];
        // double salarioPretendido = valorPretendido();
        // System.out.println("o candidato " + candidato + " solicitou o valor de
        // salario " + salarioPretendido);

        // if (salarioBase >= salarioPretendido) {
        // System.out.println("O candidato " + candidato + " foi selecionado para a
        // vaga");
        // candidatosSelecionados++;
        // }

        // candidatosAtual++;
        // }

        // for (int x = 0; x < candidatos.length; x++) {
        // System.err.println("O candidato n° " + (x + 1) + " e o candidato " +
        // candidatos[x]);
        // }

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi o " + candidato);
        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato!");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}
