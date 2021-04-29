package models;

import org.sql2o.*;
import java.util.Arrays;
import java.util.ArrayList;





public class Sighting {
   private String rangers_name;
   private String location;
   private int animals_id;
   private int id;

   public Sighting(String rangers_name, String location, int animals_id) {
       this.rangers_name = rangers_name;
       this.location = location;
       this.animals_id = animals_id;
       this.id = animals_id;
     }

    public String getRangersName() {
        return rangers_name;
    }
    public String getLocation(){
       return location;
    }
    public int getAnimals_id(){
       return animals_id;
    }
    public int getId(){
       return id;
    }

    //OVERRIDE

    @Override
    public boolean equals(Object otherSIghtings){
       if ((otherSIghtings instanceof  Sighting)){
           return false;
       }else{
           Sighting newSighting = (Sighting) otherSIghtings;
           return this.getAnimals_id() == (newSighting.getAnimals_id())
                   && this.getLocation().equals(newSighting.getLocation())
                   && this.getRangersName().equals(newSighting.getRangersName());
       }
    }







}


