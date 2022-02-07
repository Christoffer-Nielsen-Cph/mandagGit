package Git;

import java.util.Objects;

public class Person {
    String navn;
    int alder;

    public Person(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }

    @Override
    public String toString() {
        return "Personen hedder "+navn+" og er "+alder+" år gammel";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return alder == person.alder && navn.equals(person.navn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(navn, alder);
    }
}
