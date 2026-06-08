package Exercicios;

import java.util.Scanner;  // Importa o Scanner

public class Exercicio01 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);  // Cria o scanner

        //Nome
        System.out.print("\nDigite o nome do funcionário: ");
        String nome = scanner.nextLine(); 

        //Horas trabalhadas
        System.out.print("\nDigite o número de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        //Valor da hora trabalhada
        System.out.print("\nDigite o valor da hora trabalhada:");
        double valorHora = scanner.nextDouble();

        //Verificando se possui filhos
        System.out.print("\nO funcionário possui filhos? (true/false)  -> ");
        boolean possuiFilhos = scanner.nextBoolean();

        int filhosMenos14;
        //Quantos filhos tem menos de 14 anos
        if (possuiFilhos == true) {
            System.out.println("\nQuantos tem menos de 14 anos? ");
            filhosMenos14 = scanner.nextInt();
        } else {
            filhosMenos14 = 0;
        }
        
        //Idade de funcionário
        System.out.println("\nQual a idade do funcionário? ");
        int idade = scanner.nextInt();

        //Tempo de serviço        
        System.out.println("\nQual o tempo de serviço do funcionário? ");
        double tempoServico = scanner.nextDouble();

        //Parte salarial
        double salarioBruto = horasTrabalhadas * valorHora; //Definindo o salário bruto

        //CALCULANDO OS DESCONTOS

        float descontoINPS = (float) (salarioBruto * 8.5 / 100); //Calculando o desconto do INPS

        //calculando o IR

        float impostoDeRenda;
        if (salarioBruto > 1500) {
            impostoDeRenda = (float) (salarioBruto * 15 / 100);
        } else if (salarioBruto > 500) {
            impostoDeRenda = (float) (salarioBruto * 8 / 100);
        } else {
            impostoDeRenda = 0;
        }

        //Calculando o total de descontos
        float totalDescontos = (float) (descontoINPS + impostoDeRenda);
        
        //CALCULANDO OS ADICIONAIS

        float salarioFamiliar = (float) (filhosMenos14 * 100); //Calculando o salário familiar

        //Idade avançada
        float adicionalIdade;
        if (idade > 40) {
            adicionalIdade = (float) (salarioBruto * 2 / 100);
        } else {
            adicionalIdade = 0;
        }
        
        //Tempo de serviço avançado
        float adicionalTempoServico;
        if (tempoServico > 15) {
            adicionalTempoServico = (float) (salarioBruto * 3.5 / 100);
        } else if (tempoServico <= 15 && tempoSservico > 5 && idade > 30) {
            adicionalTempoServico = (float) (salarioBruto * 1.5 / 100);
        } else {
            adicionalTempoServico = 0;
        }

        //Calculando o total de adicionais
        float totalAdicionais = salarioFamiliar + adicionalIdade + adicionalTempoServico; 

        //Exibindo o salário líquido e seus dados
        double salarioLiquido = salarioBruto - totalDescontos + totalAdicionais;

        System.out.println("\nNome do funcionário: " + nome);
        System.out.println("\nSalário bruto: " + salarioBruto);
        System.out.println("\nTotal de descontos: " + totalDescontos);
        System.out.println("\nTotal de adicionais: " + totalAdicionais);
        System.out.println("\nSalário líquido: " + salarioLiquido);
        
        scanner.close();  // Close the scanner
    }
}
