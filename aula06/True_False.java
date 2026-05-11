package aula06;

public class True_False {
    public static void main(String[] args) {

        //operadores condicionais
        int x = 67;

        //igual
        System.out.println(x == 20); //false - pois x nao é igual a 20

        //diferente
        System.out.println(x != 20 ); //true - pois x é diferente de 20

        //maior que
        System.out.println(x > 20); //true - pois x é maior que 20

        //menor que 
        System.out.println(x < 20); //false - porque x é menor que 67

        //menor ou igual
        System.out.println(x <= 20); //false - pois 67 não é menor que 20 nem igual a 20

        //maior ou igual
        System.out.println(x >= 20); //true - pois 67 é maior que 20

        //
        System.out.println(x == 20 + 20 + 20 + 7); //true - pois 20 + 20 + 20 + 7 é igual a 67
    }
}