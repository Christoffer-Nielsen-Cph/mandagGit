package Git;

public class Kop extends Command{
    public String sætKop(){
        return "duk duk";
    }

    @Override
    public String execute() {
        return sætKop();
    }
}
