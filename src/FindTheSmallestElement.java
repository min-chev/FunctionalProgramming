import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindTheSmallestElement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= min) {
                index = i;
                min = nums[i];
            }

        }

        System.out.println(index);


    }
}
