
package src;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * клас для тестування коректності результатів обчислень та серіалізації/десеріалізації.
 * @author Klunnyk Dmytro
 */
public class test {
    
    public test() {
    }
    
   @Test
public void testInit_setsResultAndReturnsCounts() {
    Calculate calculate = new Calculate();
    String input = "Mississippi";
    int[] expected = calculate.calculate(input);
    int[] actual = calculate.init(input);
    assertArrayEquals(expected, actual);
}

@Test
    public void testCalculate_emptyString() {
        Calculate calculate = new Calculate();
        int[] expected = {0, 0, 0, 0, 0, 0};
        int[] actual = calculate.calculate("");
        assertArrayEquals(expected, actual);
    }

}
