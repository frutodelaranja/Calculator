import java.io.IOException;

/**
 * @author frutodelaranja
 * @email frutodelaranja@gmail.com
 */
public class Calculator {
//    private String[] romanNumbersArray = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    private Start start;

//    private MyException calcException = new MyException();

    private PreparationString preparationString;

    private GettingValues gettingValues;

    private int a;

    private int b;

    private int result;

    private String simbolOperation;

    public Calculator() {
        start = new Start();
        preparationString = new PreparationString(start.getSourceString());
        gettingValues = new GettingValues(preparationString.getWithoutSignsString());
        this.a = gettingValues.getA();
        this.b = gettingValues.getB();
        this.simbolOperation = preparationString.getSimbolOperation();

    }


    public int getResult() {
        return result;
    }


    public void calculate() {
        switch (simbolOperation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "/":
                if (a < b) {
                    MyException.getUnsafe().throwException(new IOException("\nрезультат должен быть целым числом!!!"));
                } else {
                    result = a / b;
                }
                break;
            case "*":
                result = a * b;
                break;
            default:
                MyException.getUnsafe().throwException(new IOException("\nВам доступны только следующие операции:\n a + b, a - b, a * b, a/b"));
                break;
        }

    }

    public void showResult() {
        if (gettingValues.getRomanNumbers()) {
            System.out.println("Output:\n\n" + RomanNumbersConvert.convert(getResult()));
        } else {
            System.out.println("Output:\n\n" + getResult());
        }

    }

}
