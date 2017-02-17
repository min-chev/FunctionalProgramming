import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FindEvensorOdds {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");

        Integer from = Integer.parseInt(input[0]);
        Integer to = Integer.parseInt(input[1]);

        String oddOrEven = reader.readLine();

        Predicate<Integer> chekerOdd = s -> s % 2 != 0;
        Predicate<Integer> chekerEven = s -> s % 2 == 0;

        for (int i = from; i <= to; i++) {
            if (oddOrEven.equals("odd")) {
                if (chekerOdd.test(i)) {
                    System.out.print(i + " ");
                }
            } else if (oddOrEven.equals("even")) {
                if (chekerEven.test(i)) {
                    System.out.print(i + " ");
                }

            }
        }


    }
}
