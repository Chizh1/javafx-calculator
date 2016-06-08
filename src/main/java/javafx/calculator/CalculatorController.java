package javafx.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {


    @FXML
    private TextField Display;
    private boolean LastButtonWasDigit = false;


    public void ClearClick(ActionEvent actionEvent) {
        setDisplayNumber("0");
        LastButtonWasDigit=false;
    }

    public void PercentClick(ActionEvent actionEvent) {
    }

    public void SquareRootClick(ActionEvent actionEvent) {
        double number = getNumber();
        number=Math.sqrt(number);
        NumberToString(number);
    }

    public void XSquaredClick(ActionEvent actionEvent) {
        double number = getNumber();
        number*=number;
        NumberToString(number);
    }

    public void DerivClick(ActionEvent actionEvent) {
        double number = 1/getNumber();
        NumberToString(number);
    }

    public void CorrectionClick(ActionEvent actionEvent) {
    }

    public void BackspaceClick(ActionEvent actionEvent) {
        System.out.println("Button backspace click");
    }

    public void DivisionClick(ActionEvent actionEvent) {
        double number = getNumber();
        
    }

    public void ButtonDigitClick(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        String digit = button.getText();
        if (LastButtonWasDigit)
            setDisplayNumber(getDisplayNumber()+digit);
        else
            setDisplayNumber(digit);
        LastButtonWasDigit=true;
    }

    public void MultiplicationClick(ActionEvent actionEvent) {
    }

    public void MinusClick(ActionEvent actionEvent) {
    }

    public void PlusClick(ActionEvent actionEvent) {
    }

    public void PlusMinusClick(ActionEvent actionEvent) {
        double number = getNumber()*-1;
        NumberToString(number);
    }
    public void PoindClick(ActionEvent actionEvent) {
        if(!getDisplayNumber().contains(","))
            setDisplayNumber(getDisplayNumber()+",");
        LastButtonWasDigit=true;

    }

    public void EqualClick(ActionEvent actionEvent) {
    }


    private double getNumber() {
        return Double.parseDouble(getDisplayNumber());
    }

    private void NumberToString(double number) {
        setDisplayNumber(String.valueOf(number));
    }

    private String getDisplayNumber() {
        return Display.getText();
    }

    private void setDisplayNumber(String displayNumber) {
        Display.setText(displayNumber);
    }
} 
