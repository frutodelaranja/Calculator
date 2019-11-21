
import sun.misc.Unsafe;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * @author frutodelaranja
 * @email frutodelaranja@gmail.com
 */
class MyException {
    static Unsafe getUnsafe() {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            return (Unsafe) field.get(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
