package Exercicios;

import java.util.Scanner;  // Importa o Scanner

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Cria o scanner

        //Código do funcionário
        System.out.print("\nDigite o código do funcionário: ");
        int codigoDoFuncionario = scanner.nextInt();

        scanner.nextLine(); // PESQUISEI | Conserta o problema de pular a inserção do sexo, pois o nextInt() não consome o \n (quebra de linha), deixando o próximo nextLine() ler apenas o \n e não o valor digitado

        //Sexo do funcionário
        System.out.print("\nDigite o sexo do funcionário (M/F): ");
        String sexo = scanner.nextLine();

        //Tempo de serviço
        System.out.print("\nDigite o tempo de serviço do funcionário em anos: ");
        int tempoServico = scanner.nextInt();

        //Salario do funcionário
        System.out.print("\nDigite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        //Calculando o bonus de natal

        double bonus;
        if (sexo.equalsIgnoreCase("M") && tempoServico > 15) {
            bonus = salario * 0.20; // Adicional de 20% para homens com mais de 15 anos de serviço
        } else if (sexo.equalsIgnoreCase("F") && tempoServico > 10) {
             bonus = salario * 0.25; // Adicional de 25% para mulheres com mais de 10 anos de serviço
        } else {
            bonus = 100; // Sem adicional para os demais casos
        }
        
        //Exibindo os dados

        System.out.println("\nCódigo do funcionário: " + codigoDoFuncionario);
        System.out.println("Sexo do funcionário: " + sexo);
        System.out.println("Tempo de serviço: " + tempoServico + " anos");
        System.out.println("Salário com bônus: R$ " + (salario + bonus));
        System.out.println("Valor do bônus de natal: R$ " + bonus);
        scanner.close();
    }
}
