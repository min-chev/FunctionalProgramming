import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String[] input = scanner.nextLine().split(", ");

        Function<String, Integer> parser = x -> Integer.parseInt(x);

        int sum = 0;
        for (String s : input) {
            sum+=parser.apply(s);
        }

        System.out.println("Count = " + input.length);
        System.out.println("Sum = " + sum);

    }
}
