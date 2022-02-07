package Git;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Command> objectList = new ArrayList<>();
        objectList.add(new Kronhjort());
        objectList.add(new Kaffemaskine());
        objectList.add(new Person("Nikolaj"));
        objectList.add(new Bil());
        objectList.add(new Muhko());
        objectList.add(new Kaffemaskine());
        objectList.add(new Kronhjort());
        objectList.add(new Bil());
        objectList.add(new Person("Nikolaj"));
        objectList.add(new Kop());

        for (Object o : objectList) {
            if(o instanceof Bil){
                System.out.println(((Bil) o).start());
            }
            if(o instanceof Muhko){
                System.out.println(((Muhko) o).muher());
            }
            if(o instanceof Kaffemaskine){
                System.out.println(((Kaffemaskine) o).bryg());
            }
            if(o instanceof  Kronhjort){
                System.out.println(((Kronhjort) o).brøl());
            }
            if(o instanceof Person){
                System.out.println(((Person) o).brok());
            }
        }
        for (Command command : objectList) {
            System.out.println(command.execute());
        }
    }
}
