import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<String> array1 = new ArrayList<>();
        List<String> array2 = new ArrayList<>();

        array1.add("Morango");
        array1.add("Uva");
        array1.add("Acerola");
        array1.add("Manga");
        array1.add("Banana");

        array2.add("Pera");
        array2.add("Caju");
        array2.add("Manga");
        array2.add("Morango");
        array2.add("Kiwi");

        for (int i = 0; i < array1.toArray().length; i++) {
            for (int j = 0; j < array2.toArray().length; j++) {
                if (Objects.equals(array1.get(i), array2.get(j))){
                    System.out.println(array1.get(i));
                }
            }
        }
    }
}