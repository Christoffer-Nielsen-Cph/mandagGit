package Git;

public class Kronhjort extends Command{
    public String brøl(){
        return "brøøøøl";
    }

    @Override
    public String execute() {
        return brøl();
    }
}
