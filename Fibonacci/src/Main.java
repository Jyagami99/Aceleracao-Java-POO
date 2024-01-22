import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sequencia = new ArrayList<>();
        System.out.println("Insira quantos termos da sequência de Fibonacci você deseja:");
        long numero = scanner.nextInt();

        for (int i = 0; i < numero; i ++) {
            if (i == 0 || i == 1) {
                sequencia.add(i);
            }
            else {
                int penultima = sequencia.get(i-2);
                int ultima = sequencia.get(i-1);
                sequencia.add(penultima + ultima);
            }
        }

        for (int integer : sequencia) {
            System.out.print(integer + " ");
        }

    }
}