package com.company;

import java.util.Scanner;

public class Calcular {
    public static Scanner input = new Scanner(System.in);
    public static int distancia, consumo;
    public static double litros, valor, valor1, total;

    public static void distanciaCosumoLitro() {
        System.out.print("Quantos distancia: ");
        distancia = input.nextInt();
        System.out.print("Quantos consumo do veiculo: ");
        consumo = input.nextInt();
        total = (double)distancia/consumo;
        System.out.printf("Deve ter litros: %.2f", total);
        System.out.println();
    }
    public static void litroVlrGasolinaVlrPaga() {
        System.out.print("Quantos litros que voce quer botar? ");
        litros = input.nextDouble();
        System.out.print("Quantos valor gasolina: ");
        valor = input.nextDouble();
        total = litros*valor;
        System.out.printf("Valor para pagar: %.2f", total);
        System.out.println();
    }
    public static void vlrPagaVlrGasolinaReceberLitro() {
        System.out.print("Quantos valor que voce vai pagar? ");
        valor = input.nextDouble();
        System.out.print("Quantos valor gasolina: ");
        valor1 = input.nextDouble();
        total = valor/valor1;
        System.out.printf("Voce recebeu litros: %.2f", total);
        System.out.println();
    }
    public static void litroCosumoCapazDistancia() {
        System.out.print("Quantos litros tem? ");
        litros = input.nextDouble();
        System.out.print("Quantos consumo do veiculo? ");
        consumo = input.nextInt();
        total = litros*consumo;
        System.out.printf("Pode ir distancia até %.0f km", total);
        System.out.println();
    }
}
