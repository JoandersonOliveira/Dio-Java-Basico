package edu.joanderson.segundasemana;

public class MinhaClasse {

    public static void main(String[] args) {
        String primeiroNome = "Joanderson";
        String segundoNome = "Ferreira";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "O resultado do método é " + primeiroNome.concat(" ").concat(segundoNome);
    }

}

// Toda classe precisa existir dentro do método SRC do projeto
// Toda classe precisa iniciar com nome maiúsculo
// dentro de uma aplicação recomenda se que soometne uma classe tenha o metodo
// main para iniciar a aplicão.
// O metodo main recebe um parametro do tipo array de strings
// todo arquivo java deve começar com nome maiúsculo