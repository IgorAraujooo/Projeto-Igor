package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Triangulo {

    public double base;
    public double ladoB;
    public double ladoC;
    public double altura;
    public String nome;

    public void lerDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores para o Triângulo " + nome + ":");
        System.out.print("Base: ");
        base = scanner.nextDouble();
        System.out.print("Lado B: ");
        ladoB = scanner.nextDouble();
        System.out.print("Lado C: ");
        ladoC = scanner.nextDouble();
        System.out.print("Altura: ");
        altura = scanner.nextDouble();
    }

    public void exibirDados() {
        System.out.println("-------------------");
        System.out.println(nome);
        System.out.println("-------------------");
        System.out.println("Base: " + base);
        System.out.println("Lado B: " + ladoB);
        System.out.println("Lado C: " + ladoC);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
    }

    public double calcularArea() {
        return (base * altura) / 2.0;
    }
}
