import sun.misc.Unsafe;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Scanner;

/**
 * @author frutodelaranja
 * @email frutodelaranja@gmail.com
 */
public class Start {

    private String sourceString;


    public Start() {

        showStart();
        Scanner in = new Scanner(System.in);
        sourceString = in.nextLine();
        System.out.println();


    }

    public void showStart() {
        System.out.println("Вам доступны следующие операции с римскими и арабскими и числами 1 - 10 :\n a + b, a - b, a * b, a/b\n\ninput:\n");
    }

    public String getSourceString() {
        return sourceString;
    }
}
