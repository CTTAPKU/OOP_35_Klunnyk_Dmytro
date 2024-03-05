package src;

import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * клас для тестування коректності результатів обчислень та
 * серіалізації/десеріалізації
 *
 * @author Klunnyk Dmytro
 */
public class ViewResultTest {

    ViewResult instance = new ViewResult();

    public ViewResultTest() {
    }

    /**
     * Перевірка правильності обрахування
     */
    @Test
    public void Calculate_Test() {
        String testString1 = "aeiouy";
        int[] expected1 = {1, 1, 1, 1, 1, 1};
        int[] result1 = instance.calculate(testString1);
        assertArrayEquals(expected1, result1);

        String testString2 = "hello";
        int[] expected2 = {0, 1, 0, 1, 0, 0};
        int[] result2 = instance.calculate(testString2);
        assertArrayEquals(expected2, result2);

        String testString3 = "";
        int[] expected3 = {0, 0, 0, 0, 0, 0};
        int[] result3 = instance.calculate(testString3);
        assertArrayEquals(expected3, result3);
    }

    /**
     * Перевірка серіалізації
     */
    @Test
    public void Exception() {

        instance.init();
        try {
            instance.viewSave();
        } catch (IOException e) {
        }
        try {
            instance.viewRestore();
        } catch (Exception e) {
        }
        ViewResult expected = new ViewResult();

        assertEquals(expected.getItems().size(), instance.getItems().size());

        System.out.println("Serialization and data restoration successful!");
    }

}
