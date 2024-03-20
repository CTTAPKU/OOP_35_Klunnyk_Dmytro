/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package src_ex5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import src_ex3.Item2d;

/**
 *
 * @author cttar
 */
public class ChangeItemCommandTest {
    
    public ChangeItemCommandTest() {
    }
    
   @Test
    public void testExecute_ChangesItemDescription() {

        Item2d item = new Item2d();

        ChangeItemCommand command = new ChangeItemCommand();

        command.setItem(item);

        String newDescription = "Новий опис";
        
        item.setInString(newDescription);

        assertEquals(newDescription, item.getInString());
    }
    
}
