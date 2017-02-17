import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class AddVAT {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] prices = reader.readLine().split(", ");

        List<Double> doubles = new ArrayList<>();
        for (String price : prices) {
            doubles.add(Double.parseDouble(price));
        }

        UnaryOperator<Double> VATer = x -> x*1.2;

        System.out.println("Prices with VAT:");
        for (Double doubl : doubles) {
            System.out.println(String.format("%.2f", VATer.apply(doubl)).replace(".", ","));
        }

    }
}
