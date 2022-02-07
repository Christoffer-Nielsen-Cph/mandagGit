package Git;

import java.util.Objects;

public class Person extends Command{
    String navn;
    int alder;

    public Person(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }

    public Person(String navn) {
        this.navn = navn;
        this.alder = 100;
    }
    public String brok(){
        return "bla bla bla";
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
        return alder == person.alder && Objects.equals(navn, person.navn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(navn, alder);
    }

    @Override
    public String execute() {
        return brok();
    }
}
