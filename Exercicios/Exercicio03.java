package Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Lendo os lados A, B e C do triângulo
        System.out.print("\nDigite o comprimento de um lado do triângulo: ");
        double ladoA = scanner.nextDouble();

        System.out.print("\nDigite o comprimento de outro lado do triângulo: ");
        double ladoB = scanner.nextDouble();

        System.out.print("\nDigite o comprimento do último lado do triângulo: ");
        double ladoC = scanner.nextDouble();

        //Ordenando pro maior lado ser o ladoA, o medio ser ladoB e o menor ser ladoC

        double auxiliar; //Para armazenar o valor inserido e não perde-lo na troca de lados

        if (ladoA < ladoB) {
            auxiliar = ladoA;
            ladoA = ladoB;
            ladoB = auxiliar;
        }

        if (ladoA < ladoC) {
            auxiliar = ladoA;
            ladoA = ladoC;
            ladoC = auxiliar;
        }

        if (ladoB < ladoC) {
            auxiliar = ladoB;
            ladoB = ladoC;
            ladoC = auxiliar;
        }
        
        //Checando o tipo de triângulo
        if (ladoA >= ladoB + ladoC) {
            System.out.println("Não há como existir um triângulo com essas dimensões");
        } else {
            //BLOCO 1: CLASSIFICAÇÃO DOS ÂNGULOS
            if (Math.pow(ladoA, 2) == Math.pow(ladoB, 2) + Math.pow(ladoC, 2)) {
                System.out.println("Você obteve um triângulo retângulo, com as dimensões " + ladoA + ", " + ladoB + ", " + ladoC);
            } else if (Math.pow(ladoA, 2) > Math.pow(ladoB, 2) + Math.pow(ladoC, 2)) {
                System.out.println("Você obteve um triângulo obtusângulo, com as dimensões " + ladoA + ", " + ladoB + ", " + ladoC);
            } else if (Math.pow(ladoA, 2) < Math.pow(ladoB, 2) + Math.pow(ladoC, 2)) {
                System.out.println("Você obteve um triângulo acutângulo, com as dimensões " + ladoA + ", " + ladoB + ", " + ladoC);
            }

            //BLOCO 2: CLASSIFICAÇÃO DOS LADOS
            if (ladoA == ladoB && ladoB == ladoC) { 
                System.out.println("Você obteve um triângulo equilátero, com as dimensões " + ladoA + ", " + ladoB + ", " + ladoC);
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("Você obteve um triângulo isósceles, com as dimensões " + ladoA + ", " + ladoB + ", " + ladoC);
            }
        }
        
        scanner.close();
    }
}
