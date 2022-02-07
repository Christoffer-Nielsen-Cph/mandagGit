package Git;

public class Kaffemaskine extends Command {

    public String bryg(){
        return "Dryp... Dryp.. Dryp.";
    }

    @Override
    public String execute() {
        return bryg();
    }
}
