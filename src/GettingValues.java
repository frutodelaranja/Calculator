import java.io.IOException;
import java.util.Arrays;

/**
 * @author frutodelaranja
 * @email frutodelaranja@gmail.com
 */
public class GettingValues {
    private String[] romanNumbersArray = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    private String[] intNumbersArray = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    private String[] withoutSignsString;

    private int a;

    private int b;


    private boolean romanNumbers = false;


    public GettingValues(String[] withoutSignsString) {
        this.withoutSignsString = withoutSignsString;
        setAB();

    }

    public void setAB() {


        if (isIntValues()) {
            a = Integer.parseInt(withoutSignsString[0]);
            b = Integer.parseInt(withoutSignsString[1]);
        } else if (isRomanNumbers()) {
            setRomanNumbers(true);
            for (int i = 0; i < romanNumbersArray.length; i++) {

                if (withoutSignsString[0].equals(romanNumbersArray[i])) {
                    a = i + 1;
                }
                if (withoutSignsString[1].equals(romanNumbersArray[i])) {
                    b = i + 1;
                }
            }

        } else {
            MyException.getUnsafe().throwException(new IOException(
                "неподходящее значение!!! \nВычисления возможны только с римскими числами I - X,\n" +
                    " или только с десятичными целыми 1 - 10."));
        }

    }

    public boolean isIntValues() {
        boolean a1 = false;
        boolean b1 = false;

        for (int i = 0; i < intNumbersArray.length; i++) {
            if (withoutSignsString[0].equals(intNumbersArray[i])) {
                a1 = true;
            }
            if (withoutSignsString[1].equals(intNumbersArray[i])) {
                b1 = true;
            }
        }
        if (a1 && b1) {
            return true;
        } else {
            return false;
        }


    }

    public boolean isRomanNumbers() {
        boolean a2 = false;
        boolean b2 = false;

        for (int i = 0; i < romanNumbersArray.length; i++) {
            if (withoutSignsString[0].equals(romanNumbersArray[i])) {
                a2 = true;
            }
            if (withoutSignsString[1].equals(romanNumbersArray[i])) {
                b2 = true;
            }
        }
        if (a2 && b2) {
            return true;
        } else {
            return false;
        }
    }


    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }


    public void setRomanNumbers(final boolean romanNumbers) {
        this.romanNumbers = romanNumbers;
    }

    public boolean getRomanNumbers() {
        return romanNumbers;
    }
}
