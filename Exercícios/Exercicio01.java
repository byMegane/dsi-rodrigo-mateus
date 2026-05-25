package Exercícios;

import java.util.Scanner;  // Importa o Scanner

public class Exercicio01 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);  // Cria o scanner

        //Nome
        System.out.print("Digite o nome do funcionário: \n");
        String nome = scanner.nextLine(); 

        //Horas trabalhadas
        System.out.print("Digite o número de horas trabalhadas: \n");
        double horasTrabalhadas = scanner.nextDouble();

        //Valor da hora trabalhada
        System.out.print("Digite o valor da hora trabalhada: \n");
        double valorHora = scanner.nextDouble();

        //Verificando se possui filhos
        System.out.print("O funcionário possui filhos? (true/false) \n");
        boolean possuiFilhos = scanner.nextBoolean();

        int filhosMenos14;
        //Quantos filhos tem menos de 14 anos
        if (possuiFilhos == true) {
            System.out.println("Quantos tem menos de 14 anos? \n");
            filhosMenos14 = scanner.nextInt();
        } else {
            filhosMenos14 = 0;
        }
        
        //Idade de funcionário
        System.out.println("Qual a idade do funcionário? \n");
        int idade = scanner.nextInt();

        //Tempo de serviço        
        System.out.println("Qual o tempo de serviço do funcionário? \n");
        float tempoServico = scanner.nextFloat();

        //Exibindo os dados do funcionario
        System.out.println("O nome do funcionário é: " + nome);
        System.out.println("O número de horas trabalhadas é: " + horasTrabalhadas);
        System.out.println("O valor da hora trabalhada é: " + valorHora);
        System.out.println("A idade do funcionário é: " + idade);
        System.out.println("O tempo de serviço do funcionário é: " + tempoServico);

        //Parte familiar 

        System.out.println("Quantidade de filhos com menos de 14 anos: " + filhosMenos14);
        System.out.println("O valor do salário famíliar é: " + (filhosMenos14 * 100));  //Valor do salario familia

        //Parte salarial
        double salarioBruto = horasTrabalhadas * valorHora;
        System.out.println("O salário bruto do funcionário é: " + salarioBruto);  //Salário bruto
        System.out.println("O valor do desconto do INPS é: " + (salarioBruto * 8.5 / 100));  //Salário com desconto do INPS

        scanner.close();  // Close the scanner
    }
}
