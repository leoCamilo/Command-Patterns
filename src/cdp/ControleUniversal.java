package cdp;

public class ControleUniversal {
    private Command buttonOn, buttonOff;

    public void setComands(Command buttonOn, Command buttonOff){
        this.buttonOn = buttonOn;
        this.buttonOff = buttonOff;
    }

    public void buttonOnPress(){
        buttonOn.execute();
    }

    public void buttonOffPress(){
        buttonOff.execute();
    }
}
