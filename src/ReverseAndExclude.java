import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class ReverseAndExclude {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] integers = reader.readLine().split("\\s+");

        Integer n = Integer.parseInt(reader.readLine());

        Predicate<Integer> notdivisible = s -> s%n != 0;

        List<Integer> out = new ArrayList<>();
        for (String integer : integers) {
            if(notdivisible.test(Integer.parseInt(integer))){
             out.add(Integer.parseInt(integer));
            }
        }
        Collections.reverse(out);
        for (Integer integer : out) {
            System.out.print(integer +" ");
        }


    }
}

