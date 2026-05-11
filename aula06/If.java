package aula06;

public class If {
    public static void main(String[] args) {

        //exemplo de um evento com capacidade de 100 pessoas, e 50 pessoas já compraram ingressos
        int capacidade = 100;
        int pessoas = 50;
        
        //checa uma condição e executa o codigo dentro da chave
        if(pessoas < capacidade){
        System.out.println("\n Ainda há espaço disponível \n");
        }

        //else if é a condição caso a condição anterior não tenha sido cumprida
        else if (pessoas == capacidade){
            System.out.println("O evento está cheio");
        }

        //+60 pessoas compraram
        System.out.println("60 pessoas compraram ingressos!! \n");
        pessoas += 60;

        //checando se o evento está superlotado
        if (pessoas > capacidade){
            System.out.println("O evento está superlotado");
        }
        //else é a condição caso nenhuma das anteriores tenha sido cumprida
        else {
            System.out.println("Ainda há espaço disponível");
        }
    }
}
