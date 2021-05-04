package modelsTest;

import models.Animals;
import models.EndangeredAnimals;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert.*;
import org.sql2o.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnimalTest {


    @Test
    public void endangeredAnimal_instantiatesCorrectly_true() {
        Animals testAnimals = new Animals("Lion",3);
        assertEquals(true, testAnimals instanceof Animals);
    }

//    @Test
//    public void getName_animalsInstaniatesWith_Deer() {
//        Animals testAnimals = new Animals("Deer", 4);
//        assertEquals("Lion", testAnimals.getName());
//    }
//
//    @Test
//    public void equalReturnsTrue_IfNameIsTheSame_false() {
//        Animals firstAnimals = new Animals("Lion",4);
//        Animals anotherAnimals = new Animals ("Deer",2);
//        assertTrue( firstAnimals.equals(anotherAnimals));
//    }
}
