import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    private final String sex;
    private final boolean expected;

    public LionParametrizedTest(String sex, boolean expected){
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    //Метод проверяет, есть ли грива в зависимости от пола
    @Test
    public void doesHaveManeTrueAndFalse() throws Exception {
        Lion lion = new Lion(sex);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
}
