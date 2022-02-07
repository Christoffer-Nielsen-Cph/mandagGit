package Git;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Nikolaj",50);
        Person person1 = new Person("Nikolaj",50);
        System.out.println(person.hashCode());
        System.out.println(person.toString());
        System.out.println(person.equals(person1));

    }
}
