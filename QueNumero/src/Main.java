import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número inteiro:");

        if (sc.hasNextInt()) {
            long numero = sc.nextInt();
            if (numero >= 0) {
                System.out.print(numero + " é positivo e ");
                if (numero % 2 == 0) {
                    System.out.println("par!");
                } else {
                    System.out.println("ímpar!");
                }
            }
            if (numero < 0) {
                System.out.print(numero + " é negativo e ");
                if (numero % 2 == 0) {
                    System.out.println("par!");
                } else {
                    System.out.println("ímpar!");
                }
            }
        }
        else {
            System.out.println("Tipo de variável incorreta!");
        }


    }
}