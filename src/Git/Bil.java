package Git;

public class Bil extends Command {
    public String start (){
        return "wrum wruuum";
    }

    @Override
    public String execute() {
        return start();
    }
}
