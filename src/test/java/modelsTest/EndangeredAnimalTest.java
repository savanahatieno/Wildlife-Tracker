package modelsTest;

import models.EndangeredAnimals;
import org.sql2o.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

import static org.junit.Assert.*;



public class EndangeredAnimalTest {
//    @Rule
//    public DatabaseRule database = new DatabaseRule();

    @Test
    public void endangeredAnimal_instantiatesCorrectly_true() {
        EndangeredAnimals testEndangeredAnimals = new EndangeredAnimals("Fox", "Healthy", "Young");
        assertEquals(true, testEndangeredAnimals instanceof EndangeredAnimals);
    }
}
