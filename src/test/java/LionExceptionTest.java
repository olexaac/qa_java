import com.example.Lion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LionExceptionTest {

    @Test
    public void checkInvalidSexLion() {
        Exception e = assertThrows(
                Exception.class, () -> {
                    Lion lion = new Lion("Оно");
                });
        String expected = "Используйте допустимые значения пола животного - самей или самка";
        String actual = e.getMessage();
        assertEquals(expected, actual);
    }
}
