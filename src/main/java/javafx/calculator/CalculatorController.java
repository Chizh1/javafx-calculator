package javafx.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController implements Display  {

    @FXML
    private TextField Display;

    private Calculator calculator;

    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }

    public CalculatorController() {
        calculator = new Calculator(this);
    }



    @Override
    public String getDisplayNumber() {
        return Display.getText();
    }

    @Override
    public void setDisplayNumber(String displayNumber) {
        Display.setText(displayNumber);
    }
    public void ClearClick(ActionEvent actionEvent) {
        calculator.clear();
    }



    public void PercentClick(ActionEvent actionEvent) {
    }

    public void SquareRootClick(ActionEvent actionEvent) {
        calculator.sqrtroot();
    }



    public void XSquaredClick(ActionEvent actionEvent) {
        calculator.xsquared();
    }



    public void DerivClick(ActionEvent actionEvent) {
        calculator.deriv();
    }


    public void CorrectionClick(ActionEvent actionEvent) {
    }

    public void BackspaceClick(ActionEvent actionEvent) {

    }

    public void DivisionClick(ActionEvent actionEvent) {


    }

    public void ButtonDigitClick(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        String digit = button.getText();
        calculator.digit(digit);
    }



    public void MultiplicationClick(ActionEvent actionEvent) {
    }

    public void MinusClick(ActionEvent actionEvent) {
    }

    public void PlusClick(ActionEvent actionEvent) {
    }

    public void PlusMinusClick(ActionEvent actionEvent) {
        calculator.plusminus();
    }
    public void PoindClick(ActionEvent actionEvent) {
        calculator.comma();

    }



    public void EqualClick(ActionEvent actionEvent) {
    }
}
