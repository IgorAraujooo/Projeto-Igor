package br.senai.sp.jandira.model;

public class GeometriaApp {

    public static void main(String[] args) {
        System.out.println("Criando triângulos...");

        Triangulo t1 = new Triangulo();
        t1.nome = "Triângulo 1";
        t1.lerDados();

        Triangulo t2 = new Triangulo();
        t2.nome = "Triângulo 2";
        t2.lerDados();

        t1.exibirDados();
        t2.exibirDados();
    }
}
