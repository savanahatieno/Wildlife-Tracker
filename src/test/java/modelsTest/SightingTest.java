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
        testAnimals.save();
        Sighting testSighting = new Sighting(testAnimals.getId(),"1.2545N,36.8141S","Ranger Luke");
        assertEquals(true, testSighting instanceof Sighting);
    }

//    @Test
//    public void all_returnsAllInstancesOfSighting_true() {
//        Animals testAnimals = new Animals("Deer");
//        testAnimals.save();
//        Sighting testSighting = new Sighting (testAnimals.getId(), "45.472428, -121.946466", "Ranger Avery");
//        testSighting.save();
//        Animals secondTestAnimal = new Animals("Badger");
//        secondTestAnimal.save();
//        Sighting secondTestSighting = new Sighting (testAnimals.getId(), "45.472428, -121.946466", "Ranger Reese");
//        secondTestSighting.save();
//        assertEquals(true, Sighting.all().get(0).equals(testSighting));
//        assertEquals(true, Sighting.all().get(1).equals(secondTestSighting));
//    }


}
