package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcao;
        boolean continuar = true;
        Scanner input = new Scanner(System.in);
        while (continuar) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("DUVIDA CALCULA SOBRE CONSUMO, DISTANCIA E VALOR");
            System.out.println("1-Quantos distancia km e quantos precisa ter litro");
            System.out.println("2-Quantos litros e quantos valor para pagar");
            System.out.println("3-Quantos valor vai pagar gasolina e vai receber quanto litro");
            System.out.println("4-Quantos litros e quantos capaz distancia");
            System.out.println("0-SAIR");
            System.out.println("----------------------------------------------------------------");
            System.out.print("Opção: ");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    Calcular.distanciaCosumoLitro();
                    break;
                case 2:
                    Calcular.litroVlrGasolinaVlrPaga();
                    break;
                case 3:
                    Calcular.vlrPagaVlrGasolinaReceberLitro();
                    break;
                case 4:
                    Calcular.litroCosumoCapazDistancia();
                    break;
                case 0:
                    continuar = false;
                    System.out.println("TERMINA...");
                    break;
                default:
                    System.out.println("INVALIDO e TENTA NOVAMENTE");
            }
        }
    }
}
