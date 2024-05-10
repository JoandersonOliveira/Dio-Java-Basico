package tiposvariaveis;

public class TiposVariaveis {
    public static void main(String[] args) {

        double salario = 2.500;
        float salario2 = 2.500F; // para o tipo float precisamos informar um 'F' no final.
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
        float pi = 3.14F;

        // CONSTANTES
        // por convenção usamos variaveis contantes em caixa alta mas isso por si só não
        // a tornará uma constantes imutável. É necessário usar o final.

        final double VALOR_DE_PI = 3.14;


    }
}
