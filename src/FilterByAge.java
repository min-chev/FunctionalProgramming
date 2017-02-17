import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterByAge {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        LinkedHashMap<String, Integer> Map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(", ");
            Map.put(input[0], Integer.parseInt(input[1]));
        }

        String olderoryounger = reader.readLine();
        int age2 = Integer.parseInt(reader.readLine());
        String nameandage = reader.readLine();

        Predicate<Integer> tester = createTester(olderoryounger, age2);

        Consumer<Map.Entry<String, Integer>> printer = createPrinter(nameandage);

        printFilteredStudents(Map, tester, printer);

    }

    private static Consumer<Map.Entry<String, Integer>> createPrinter(String format) {
        switch (format) {
            case "name age":
                return person -> System.out.printf("%s - %d%n", person.getKey(), person.getValue());
            case "name":
                return person -> System.out.println(person.getKey());
            case "age":
                return person -> System.out.println(person.getValue());
            default: return null;

        }
    }

    private static Predicate<Integer> createTester(String condition, Integer age) {
        switch (condition) {
            case "younger":
                return x -> x <= age;
            case "older":
                return x -> x >= age;
            default:
                return null;
        }
    }

    private static void printFilteredStudents( LinkedHashMap<String, Integer> people,
                                               Predicate<Integer> tester,
                                               Consumer<Map.Entry<String, Integer>> printer) {

        for (Map.Entry<String, Integer> person : people.entrySet()) {
            if (tester.test(person.getValue())) {
                printer.accept(person);
            }
        }
    }
}
