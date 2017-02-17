import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class AppliedArithmetics {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] nums = reader.readLine().split("\\s+");

        Integer[] integers = new Integer[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            integers[i] = Integer.parseInt(nums[i]);
        }

        BiFunction<String, Integer, Integer> doMagic = (x, y) -> {
            switch (x) {
                case "add":
                    return y + 1;
                case "multiply":
                    return y * 2;
                case "subtract":
                    return y - 1;
                default:
                    return null;
            }
        };

        String comm = reader.readLine();
        while (true){
            if(comm.equals("end")){
                break;
            }
            if(comm.equals("print")){
                String out = "";
                for (Integer integer : integers) {
                    out += integer + " ";
                }
                System.out.println(out.trim());
            }else{
                for (int i = 0; i < integers.length; i++) {
                    integers[i] = doMagic.apply(comm, integers[i]);
                }
            }

            comm = reader.readLine();
        }

    }
}
