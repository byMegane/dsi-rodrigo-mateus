package aula05;

public class LicaoDeCasa {
    public static void main(String[] args) {
        int x = 10;
        x += 2;
        System.out.println(x);

        //aqui, o valor final de x é 12, já que o operador += adiciona 2 (que eu declarei) ao valor atual de x (que era 10), então x = 12

        x -= 3;
        System.out.println(x);

        //aqui, é a mesma lógica, o -= subtrai 3 do valor atual de x (que é 12), então x = 9

        x *= 2;
        System.out.println(x);

        //mesma lógica, o *= multiplica o valor atual de x (que é 9) por 2, logo x = 18

        x /= 3;
        System.out.println(x);

        //novamente, o /= divide o valor atual de x (que é 18) por 3, então x = 6

        x %= 4;
        System.out.println(x);

        //nesse, o operador %= age um pouco diferente, ele calcula o resto da divisão do valor atual de x (que é 6) por 4, então ficando x = 2 (6 dividido por 4 é 1, com resto 2)

        x &= 22;
        System.out.println(x);

        //o operador &= é um operador que trabalha com bit, ele analisa os bits dos 2 numeros e mostra um novo número que tem os bits 1 na mesma posição dos 2 números
        //No caso, o número 2 (número atual) é 00000010, e o número 22 é 00010110, perceba que o único bit 1 que os dois números tem na mesma posição é o segundo bit, então o resultado é 00000010. Portanto, x = 2

        x |= 5;
        System.out.println(x);

        //já aqui é um pouco mais simples, já que ao invés dele pegar apenas os bits semelhantes, ele mescla os bits "1" de ambos os números
        //No caso, o número 2 (número atual) é 00000010, e o número 5 é 00000101, então o resultado é 00000111, que é igual a 7. Logo, x = 7

        x ^= 3;
        System.out.println(x);

        //agora, se o &= só exibe semelhantes(1 com 1), o |= mescla (sobrepõe o 1 do 0), o ^= trabalha com as diferenças, ou seja, ele só exibe os bits "1" que estão em posições diferentes nos dois números
        //No caso, o número 7 (número atual) é 00000111, e o número 3 é 00000011, então o resultado é 00000100, que é igual a 4. Logo, x = 4

        x >>= 2;
        System.out.println(x);

        //o operador >>= trabalha com deslocamento de bits para a direita. Os bits que saem pela direita são descartados, e os bits que entram pela esquerda são preenchidos com o bit mais a esquerda
        //Nesse caso, o número 4 (número atual) é 00000100, e ao mover os bits para a direita 2 vezes, o resultado é 00000001, que é igual a 1. Logo, x = 1

        x <<= 5;
        System.out.println(x);

        //o operador <<= é o oposto do >>=, ele desloca os bits para a esquerda, os bits que saem pela esquerda são descartados, e os bits que entram pela direita são preenchidos com 0
        //Nesse caso, o número 1 (número atual) é 00000001, e ao mover os bits para a esquerda 5 vezes, o resultado é 00100000, que é igual a 32. Logo, x = 32
    }
}