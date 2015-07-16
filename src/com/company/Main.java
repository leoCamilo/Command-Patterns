package com.company;

import cdp.*;

public class Main {

    public static void main(String[] args) {
        AbrirCommand ac = new AbrirCommand();
        FecharCommand fc = new FecharCommand();
        LigarCommand lc = new LigarCommand();
        DesligarCommand dc = new DesligarCommand();

        ControleUniversal control = new ControleUniversal();

        control.setComands(ac, fc);
        control.buttonOnPress();
        control.buttonOffPress();

        control.setComands(lc, dc);
        control.buttonOnPress();
        control.buttonOffPress();
    }
}
