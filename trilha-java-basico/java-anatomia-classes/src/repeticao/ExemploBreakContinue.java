package repeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        int numeros[] = { 1, 2, 3, 4, 5, 6, 7 };

        for (int x = 0; x < numeros.length; x++) {
            if (numeros[x] == 3) {
                continue;
                // diferente do break o continue não interrompe o laço for, ele interrompe
                // apenas a iteração
            }
            System.out.println(x);
        }
    }
}
