package modelsTest;

import models.Animals;
import models.Sighting;
import org.sql2o.*;
import org.junit.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Date;


import  static org.junit.Assert.*;


public class SightingTest {

    //The basic test


    @Test
    public void sighting_instantiatesCorrectly_true() {
        Animals testAnimals = new Animals("Lion", 3);
        Sighting testSighting = new Sighting(testAnimals.name,"Ranger Luke",6);
        assertEquals(true, testSighting instanceof Sighting);
    }

    @Test
    public void all_returnsAllInstancesOfSighting_true() {
        Animals testAnimals = new Animals("Deer");
        Sighting testSighting = new Sighting (testAnimals.name, "45.472428, -121.946466", 78);
        Animals secondTestAnimal = new Animals("Badger");
        Sighting secondTestSighting = new Sighting (testAnimals.name, "45.472428, -121.946466", 7);
        secondTestSighting.save();
        assertEquals(true, Sighting.all().get(0).equals(testSighting));
        assertEquals(true, Sighting.all().get(1).equals(secondTestSighting));
    }


}
