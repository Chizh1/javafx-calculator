package javafx.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * Created by Admin on 08.06.2016.
 */
public class Calculator  {


    private Display display;
    private boolean LastButtonWasDigit = false;

    public Calculator(Display display) {
        this.display = display;
    }

    public void clear() {
        display.setDisplayNumber("0");
        LastButtonWasDigit=false;
    }

    public void sqrtroot() {
        double number = getNumber();
        number=Math.sqrt(number);
        NumberToString(number);
    }

    public void xsquared() {
        double number = getNumber();
        number*=number;
        NumberToString(number);
    }

    public void deriv() {
        double number = 1/getNumber();
        NumberToString(number);
    }

    public void plusminus() {
        double number = getNumber()*-1;
        NumberToString(number);
    }

    public void comma() {
        if(!display.getDisplayNumber().contains(","))
            display.setDisplayNumber(display.getDisplayNumber()+",");
        LastButtonWasDigit=true;
    }

    public void digit(String digit) {
        if (LastButtonWasDigit)
            display.setDisplayNumber(display.getDisplayNumber()+digit);
        else
            display.setDisplayNumber(digit);
        LastButtonWasDigit=true;
    }

    public double getNumber() {
        return Double.parseDouble(display.getDisplayNumber());
    }

    public void NumberToString(double number) {
        display.setDisplayNumber(String.valueOf(number));
    }



}
