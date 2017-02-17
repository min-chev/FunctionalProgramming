import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Consumer<String[]> printer = arr -> {
            for (String s : arr) {
                System.out.println(s);
            }
        };

        printer.accept(reader.readLine().split("\\s+"));

    }
}
