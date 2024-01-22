import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);
        System.out.println("Insira o número que deseja imprimir a tabuada:");
        int number = numInput.nextInt();

        System.out.println("Tabela de multiplicação de " + number);
        for (int i = 0; i <= 10; i++){
            int multiplier = number * i;
            System.out.println(number + " x " + i + " = " + multiplier);
        }
    }
}