import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline predator;

    @Test
    public void shouldGetSoundMeow() {
        Cat cat = new Cat(predator);
        String actual = cat.getSound();
        String expected = "Мяу";
        assertEquals(expected,actual);
    }

    @Test
    public void shouldGetFoodForCat() throws Exception {
        Cat cat = new Cat(predator);
        Mockito.when(predator.eatMeat()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> actual = cat.getFood();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected,actual);
    }
}

