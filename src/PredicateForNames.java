import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());

        String[] names = reader.readLine().split("\\s+");

        Predicate<String> isLessOrEqual = s -> s.length()<= n;

        for (String name : names) {
            if(isLessOrEqual.test(name)){
                System.out.println(name);
            }

        }

    }
}
