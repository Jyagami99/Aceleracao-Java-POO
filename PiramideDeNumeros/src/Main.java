import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);
        System.out.println("Insira o número de iterações que deseja fazer na piramide:");
        int number = numInput.nextInt();

        for (int i = 1; i <= number; i++){
            System.out.println(String.valueOf(i).repeat(Math.max(0, i)));
        }
    }
}