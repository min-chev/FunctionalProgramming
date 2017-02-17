import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] peopl = reader.readLine().split("\\s+");

        ArrayList<String> people = new ArrayList<>();
        Collections.addAll(people, peopl);

        String comm = reader.readLine();

        while (true) {
            if (comm.equals("Party!")) {
                break;
            }
            String[] command = comm.split("\\s+");

            if (command[0].equals("Remove")) {
                BiPredicate<String, String> filter = createChecker(command[1]);
                people = people.stream()
                        .filter(a -> !filter.test(command[2], a))
                        .collect(Collectors.toCollection(ArrayList::new));
            } else {
                BiPredicate<String,String> checker = createChecker(command[1]);
                ArrayList<String> result = new ArrayList<>();
                for (int i = 0; i < people.size(); i++) {
                    if(checker.test(command[2], people.get(i))) {
                        result.add(people.get(i));
                    }
                    result.add(people.get(i));
                }
                people = (ArrayList<String>)result.clone();
            }

            comm = reader.readLine();
        }
        if (people.size() == 0) {
            System.out.println("Nobody is going to the party!");
        } else {
            String users = String.join(", ", people);
            System.out.println(users + " are going to the party!");
        }
    }

    private static BiPredicate<String, String> createChecker(String crt) {
        switch (crt) {
            case "StartsWith":
                return (s, name) -> name.startsWith(s);
            case "EndsWith":
                return (s, name) -> name.endsWith(s);
            case "Length":
                return (s, name) -> name.length() == Integer.parseInt(s);
            default: return null;
        }
    }
}

