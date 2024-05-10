package operadores;

public class Operadores {
    public static void main(String[] args) {
        int numero = 5;
        boolean teste = false;
        teste = !teste; //negando o valor

        // imprimindo o numero negativo
        System.out.println(-numero);

        numero++;
        System.out.println(numero);

        System.out.println(numero++);

        numero = -numero;
        System.out.println(numero);

        System.out.println(numero * -1);

        int numero2 = 100;

    }
}
