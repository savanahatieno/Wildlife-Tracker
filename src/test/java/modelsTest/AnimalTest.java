package modelsTest;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert.*;
import org.sql2o.*;
import static org.junit.Assert.assertEquals;

public class AnimalTest {




    @Test
    public void animal_instatiatesCorrectly_false() {
        AnimalTest testAnimal = new AnimalTest("");
        assertEquals(true, testAnimal instanceof  AnimalTest);
    }
}
