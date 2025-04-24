import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String gender;
    private Person father;
    private Person mother;
    private List<Person> brothers;
    private List<Person> sisters;
    private List<Person> sons;
    private List<Person> daughters;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
        brothers = new ArrayList<>();
        sisters = new ArrayList<>();
        sons = new ArrayList<>();
        daughters = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Person getFather() {
        return father;
    }

    public Person getMother() {
        return mother;
    }

    public List<Person> getBrothers() {
        return brothers;
    }

    public List<Person> getSisters() {
        return sisters;
    }

    public List<Person> getSons() {
        return sons;
    }

    public List<Person> getDaughters() {
        return daughters;
    }

    public void setName(String str) {
        name = str;
    }

    public void setGender(String g) {
        gender = g;
    }

    public void setFather(Person p) {
        father = p;
    }

    public void setMother(Person p) {
        mother = p;
    }

    public void addBrothers(Person p) {
        brothers.add(p);
    }

    public void addSisters(Person p) {
        sisters.add(p);
    }

    public void addSons(Person p) {
        sons.add(p);
    }

    public void addDaughters(Person p) {
        daughters.add(p);
    }
}