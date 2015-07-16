package cdp;

public class FecharCommand implements Command {
    @Override
    public void execute() {
        System.out.println("fechando");
    }
}
