import java.io.IOException;
import java.util.Arrays;

/**
 * @author frutodelaranja
 * @email frutodelaranja@gmail.com
 */
public class PreparationString {
    private String sourceString;

    private String withoutSpacesString;

    private String[] withoutSignsString;

    private String[] legalOperations = {"+", "-", "*", "/"};

    private String simbolOperation = " ";


    public PreparationString(String sourceString) {
        this.sourceString = sourceString;
        clearingSpaces();
        clearingSigns();
        setSimbolOperation();
    }

    public void clearingSpaces() {
        withoutSpacesString = sourceString.replaceAll("\\s+", "");
    }

    public void clearingSigns() {
        withoutSignsString = new String[2];
        withoutSignsString = withoutSpacesString.split("[+,\\-,*,/]");

    }

    public String getWithoutSpacesString() {
        return withoutSpacesString;
    }

    public String[] getWithoutSignsString() {
        return withoutSignsString;
    }

    public void setSimbolOperation() {
        boolean s = false;

        for (String d :
            legalOperations) {
            if (withoutSpacesString.contains(d)) {
                this.simbolOperation = d;
                s = true;
            }

        }
        if (!s) {
            MyException.getUnsafe().throwException(new IOException(
                "Вам доступны только следующие операции: a + b, a - b, a * b, a/b"));
        }
    }

    public String getSimbolOperation() {
        return simbolOperation;
    }
}
