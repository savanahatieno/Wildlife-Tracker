package models;

import org.sql2o.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


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

    public String getLocation() {
        return location;
    }

    public int getAnimals_id() {
        return animals_id;
    }

    public int getId() {
        return id;
    }

    //OVERRIDE

    @Override
    public boolean equals(Object otherSIghtings) {
        if ((otherSIghtings instanceof Sighting)) {
            return false;
        } else {
            Sighting newSighting = (Sighting) otherSIghtings;
            return this.getAnimals_id() == (newSighting.getAnimals_id())
                    && this.getLocation().equals(newSighting.getLocation())
                    && this.getRangersName().equals(newSighting.getRangersName());
        }
    }

    //WHere user can see all list of sightings

    public static List<Sighting> all() {
        try (Connection connection = DB.sql2o.open()) {
            String sql = "SELECT * FROM sighting;";
            return connection.createQuery(sql)
                    //Added mappings to ignore fails during listing columns
                    .throwOnMappingFailure(false)

                    .executeAndFetch(Sighting.class);
        }
    }

    //Finding ids

    public static Sighting find(int id) {
        try (Connection connection = DB.sql2o.open()) {
            String sql = "SELECT * FROM sighting WHERE id=:id;";
            Sighting sighting = connection.createQuery(sql)
                    .addParameter("id", id)
                    .executeAndFetchFirst(Sighting.class);
            return sighting;
        } catch (IndexOutOfBoundsException exception) {
            return null;
        }

        //Saving


    }
}


