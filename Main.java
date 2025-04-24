import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> input = Arrays.asList(
                "John, Male, Brad, Lisa",
                "Emma, Female, Brad, Lisa",
                "Mark, Male, Putin, Jenifer",
                "Jenny, Female, Putin, Jenifer",
                "Alex, Male, John, Jenny",
                "Elizabeth, Female, Mark, Kiara",
                "Emily, Female, Steve, Emma",
                "Rachel, Female, Steve, Emma");

        Map<String, Person> familyMap = MatchFinder.manageFamily(input);
        Person alex = familyMap.get("Alex");
        MatchFinder.findMatch(alex);
    }

}
