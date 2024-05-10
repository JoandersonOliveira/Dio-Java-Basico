package operadores;

public class OperadorTernario {
    public static void main(String[] args) {
        int a, b;
        a = 6;
        b = 5;

        String resultado = " ";
        if (a == b)
            resultado = "Verdadeiro";
        else
            resultado = "False";

        String verdadeira = a == b ? "verdadeira" : "falso";

        System.out.println(resultado);
        System.out.println(verdadeira);
    }

}
