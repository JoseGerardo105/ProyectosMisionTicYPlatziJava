package controller;

import view.ViewCalculator;

public class Controller {
    private ViewCalculator view;
    public Controller(){
        view = new ViewCalculator();
        view.setVisible(true);
    }
}
