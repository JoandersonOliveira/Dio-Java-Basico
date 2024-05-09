package edu.joanderson.primeirasemana;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 7;
        
        if (mediaFinal > 6)
            System.out.println("Aprovado");
        else if (mediaFinal == 6)
            System.out.println("prova de recuperação");
        else
            System.out.println("Reprovado");
    }
}
