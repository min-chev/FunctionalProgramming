import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] integers = reader.readLine().split("\\s+");

        Integer[] integers1 = new Integer[integers.length];
        for (int i = 0; i <integers.length; i++) {
            integers1[i] = Integer.parseInt(integers[i]);
        }

        Function<Integer[], Integer> smallest = num -> {
            int min = Integer.MAX_VALUE;
            for (Integer integer : num) {
                if(integer<min){
                    min=integer;
                }
            }
            return min;
        };


        System.out.println(smallest.apply(integers1));


    }
}
