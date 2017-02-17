import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUpperCaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split(" ");

        Predicate<String> checkerUppercase = s -> s.charAt(0) == s.toUpperCase().charAt(0);

        List<String> outList = new ArrayList<>();
        for (String s : text) {
            if (checkerUppercase.test(s)) {
                outList.add(s);
            }
        }

        System.out.println(outList.size());
        for (String s : outList) {
            System.out.println(s);
        }
    }
}
