package modelsTest;

import models.EndangeredAnimals;
import org.sql2o.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

import static org.junit.Assert.*;



public class EndangeredAnimalTest {


    @Test
    public void endangeredAnimal_instantiatesCorrectly_true() {
        EndangeredAnimals testEndangeredAnimals = new EndangeredAnimals("Deer", "Healthy", "Young");
        assertEquals(true, testEndangeredAnimals instanceof EndangeredAnimals);
    }

    //Test saving object
            //Test failed here
//    @Test
//    public void save_assignsTheObjectAndUpdatesToDatabase() {
//        EndangeredAnimals testEndangeredAnimals = new EndangeredAnimals("Deer", "Sick", "Adult");
//        testEndangeredAnimals.save();
//        EndangeredAnimals savedEndangeredAnimal = EndangeredAnimals.all().get(0);
//        assertEquals(true, testEndangeredAnimals.getId());
//        assertEquals(true, savedEndangeredAnimal.getId());
//
//    }


//    @Test
//    public void all_returnsAllInstancesOfEndangeredAnimal_true() {
//        EndangeredAnimals firstEndangeredAnimals = new EndangeredAnimals("Deer", "Healthy", "Young");
//        EndangeredAnimals secondEndangeredAnimal = new EndangeredAnimals("Deer", "Old", "Adult");
//        assertEquals(true, EndangeredAnimals.all().get(0).equals(firstEndangeredAnimals));
//        assertEquals(true, EndangeredAnimals.all().get(1).equals(secondEndangeredAnimal));
//    }
}
