import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author frutodelaranja
 * @email frutodelaranja@gmail.com
 */
public class Main {

    public static void main(String[] args) throws Exception {


        Calculator calculator = new Calculator();
        calculator.calculate();
        calculator.showResult();
    }

}
