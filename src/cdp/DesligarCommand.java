package cdp;

public class DesligarCommand implements Command {
    @Override
    public void execute() {
        System.out.println("desligando");
    }
}
