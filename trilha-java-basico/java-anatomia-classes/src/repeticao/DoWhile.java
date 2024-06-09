package repeticao;

import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Discando..");

        // O do while permite que o código execute ao menos uma vez
        do {

            System.out.println("Telefone tocando!");

        } while (tocando());

        System.out.println("Alô!");

    }

    public static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        return !atendeu;


        
    }

}