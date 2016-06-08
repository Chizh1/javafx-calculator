package javafx.calculator;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by Admin on 08.06.2016.
 */
public class CalculatorTest {


    private Calculator calculator;
    private Display display = new DisplayStub();


    @Before
    public void setUp() throws Exception {
        calculator = new Calculator(display);
    }

    @Test
    public void clear() throws Exception {

    }

    @Test
    public void sqrtroot() throws Exception {

    }

    @Test
    public void xsquared() throws Exception {

    }

    @Test
    public void deriv() throws Exception {

    }

    @Test
    public void plusminus() throws Exception {

    }

    @Test
    public void comma() throws Exception {

    }

    @Test
    public void digit() throws Exception {

    }
    @Test
    public void getNumber() throws Exception {
        //given
        display.setDisplayNumber("0");
        //when
        double number = calculator.getNumber();
        //than
        assert number == 0;
    }

    @Test
    public void numberToString() throws Exception {
        //given

        //when

        //than

    }
    private static class DisplayStub implements Display{
        private String displayNumber;
        @Override
        public String getDisplayNumber() {
            return displayNumber;
        }

        @Override
        public void setDisplayNumber(String displayNumber) {
            this.displayNumber = displayNumber;
        }
    }
}