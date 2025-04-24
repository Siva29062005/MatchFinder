import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchFinder {

    public static Map<String, Person> manageFamily(List<String> input) {
        Map<String, Person> familyMap = new HashMap<>();
        for (String line : input) {
            String[] parts = line.split(",\\s*");
            String name = parts[0], gender = parts[1], fatherName = parts[2], motherName = parts[3];

            familyMap.putIfAbsent(name, new Person(name, gender));
            familyMap.putIfAbsent(fatherName, new Person(fatherName, "Male"));
            familyMap.putIfAbsent(motherName, new Person(motherName, "Female"));

            Person child = familyMap.get(name);
            Person father = familyMap.get(fatherName);
            Person mother = familyMap.get(motherName);

            child.setFather(father);
            child.setMother(mother);
        }

        for (Person person : familyMap.values()) {
            if (person.getFather() != null) {
                if ("Male".equalsIgnoreCase(person.getGender()))
                    person.getFather().addSons(person);
                else
                    person.getFather().addDaughters(person);
            }
            if (person.getMother() != null) {
                if ("Male".equalsIgnoreCase(person.getGender()))
                    person.getMother().addSons(person);
                else
                    person.getMother().addDaughters(person);
            }
        }

        for (Person person1 : familyMap.values()) {
            for (Person person2 : familyMap.values()) {
                if (!person1.equals(person2) &&
                        person1.getFather() != null &&
                        person1.getMother() != null &&
                        person2.getFather() != null &&
                        person2.getMother() != null &&
                        person1.getFather().equals(person2.getFather()) &&
                        person1.getMother().equals(person2.getMother())) {

                    if ("Male".equalsIgnoreCase(person2.getGender()))
                        person1.addBrothers(person2);
                    else
                        person1.addSisters(person2);
                }
            }
        }
        return familyMap;
    }

    private static void matchFinder(Person p, String relation, List<Person> siblings) {
        System.out.println(relation + " side Marriage Partners:");
        boolean flag = true;
        for (Person i : siblings) {
            List<Person> partners = p.getGender().equalsIgnoreCase("Male") ? i.getDaughters() : i.getSons();
            if (!partners.isEmpty()) {
                for (Person j : partners) {
                    flag = false;
                    System.out.println(j.getName());
                }
            }
        }
        if (flag) {
            System.out.println("No Marriage Partners!");
        }
    }

    public static void findMatch(Person p) {
        Person mother = p.getMother();
        List<Person> mothersBrothers = mother != null ? mother.getBrothers() : List.of();
        matchFinder(p, "Mother", mothersBrothers);

        Person father = p.getFather();
        List<Person> fathersSisters = father != null ? father.getSisters() : List.of();
        matchFinder(p, "Father", fathersSisters);
    }
}
