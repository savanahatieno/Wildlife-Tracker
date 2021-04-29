package modelsTest;

import models.Animals;
import models.EndangeredAnimals;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert.*;
import org.sql2o.*;
import static org.junit.Assert.assertEquals;

public class AnimalTest {


    @Test
    public void endangeredAnimal_instantiatesCorrectly_true() {
        Animals testAnimals = new Animals("Lion",3);
        assertEquals(true, testAnimals instanceof Animals);
    }

}
