import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.BiPredicate;

public class ListOfPredicates {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        String[] divid = reader.readLine().split("\\s+");
        int[] dividers = new int[divid.length];

        for (int i = 0; i < divid.length; i++) {
            dividers[i] = Integer.parseInt(divid[i]);
        }

        BiPredicate<Integer, Integer> isDivisible = (x, y) -> x % y == 0;
        BiPredicate<Integer, int[]> isDivisibleByArray = (x, y) -> {
            boolean divisible = true;
            for (int number : y) {
                if (!isDivisible.test(x, number)){
                    divisible = false;
                }
            }
            return divisible;
        };

        for (int i = 1; i <= n; i++) {
            if (isDivisibleByArray.test(i, dividers)) {
                System.out.print(i + " ");
            }
        }



    }
}
