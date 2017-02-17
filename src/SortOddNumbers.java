import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.asList(scanner.nextLine().split(", "));

        List<Integer> nums = new ArrayList<>();
        for (String s : list) {
            nums.add(Integer.parseInt(s));
        }

        nums.removeIf(n -> n % 2 != 0);


        String out = String.join(", ", nums.toString());
        System.out.println(out.substring(1, out.length()-1));

        nums.sort((a,b)-> a.compareTo(b));

        String out2 = String.join(", ", nums.toString());
        System.out.println(out2.substring(1, out2.length()-1));


    }
}
