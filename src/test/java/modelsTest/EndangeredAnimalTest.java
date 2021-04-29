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

    @Test
    public void save_assignsTheObjectAndUpdatesToDatabase() {
        EndangeredAnimals testEndangeredAnimals = new EndangeredAnimals("Deer", "Sick", "Adult");
        testEndangeredAnimals.save();
        EndangeredAnimals savedEndangeredAnimal = EndangeredAnimals.all().get(0);
        assertEquals(testEndangeredAnimals.getId(), savedEndangeredAnimal.getId());

    }
}
