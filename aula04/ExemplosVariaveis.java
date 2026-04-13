package aula04;

public class ExemplosVariaveis {

    public static void main(String[] args) {

        //usando int
        int n1, n2, n3;
        n1 = n2 = 10;
        n3 = 5;
        System.out.println(n1 + n2 + n3);

        //booleanos
        boolean LouieLovePartenoppi = true;
        boolean LouieHatePartenoppi = false;

        System.out.println(LouieLovePartenoppi);
        System.out.println(LouieHatePartenoppi);

        //String

        String True_Love = "Partenoppi";
        System.out.println("O que a Louie realmente gosta MUITO: " + True_Love);

        //long

        long NUMERO_LONGO = 67676767;
        System.out.println("Meu número grande favorito: " + NUMERO_LONGO);

        // float && double
        float testeFloat = 10f;
        double testeDouble = 10d;
        double testePotencia = 10e2d;
        System.out.println(testeFloat);
        System.out.println(testeDouble);
        System.out.println(testeFloat + testeDouble);
        System.out.println(testePotencia);

        // Tipos de declaração de número
        byte BYTE = 10;
        short SHORT = 5000;
        int INT = 123456789;
        long LONG = 222222222;

        System.out.println("Junção dos numeros: " + BYTE + SHORT + INT + LONG);
    }
}