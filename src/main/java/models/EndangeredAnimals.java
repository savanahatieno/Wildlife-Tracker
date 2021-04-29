package models;

import org.sql2o.Connection;
import sun.util.resources.ext.CalendarData_da;

import javax.swing.border.EmptyBorder;
import java.util.List;

public class EndangeredAnimals {
    public String name ;
    public int id;
    public String health;
    public String age_type;
    public boolean endangered;

    public EndangeredAnimals (String name, String health, String age_type){
        this.name = name;
        this.id = id;
        this.health = health;
        this.age_type= age_type;
    }

    //getter methods
    public String getName(){
        return name;
    }
    public String getAge_type(){
        return age_type;
    }
    public  String getHealth(){
        return health;
    }
    public int getId (){
        return id;
    }


    //Added an override to avoid duplicate errors
    @Override
    public boolean equals(Object otherEndangeredAnimals) {
        if(!(otherEndangeredAnimals instanceof EndangeredAnimals)) {
            return false;
        } else {
            EndangeredAnimals newEndangeredAnimals = (EndangeredAnimals) otherEndangeredAnimals;
            return this.getName().equals(newEndangeredAnimals.getName())
                    && this.getHealth().equals(newEndangeredAnimals.getHealth())
                    && this.getAge_type().equals(newEndangeredAnimals.getAge_type());
        }
    }

    //where one can view all the selected EndangeredAnimals
    public static List<EndangeredAnimals> all() {
        try(Connection connection = DB.sql2o.open()) {
            String sql = "SELECT * FROM endangered_animlas;";
            return connection.createQuery(sql)
                    .executeAndFetch(EndangeredAnimals.class);
        }
    }

    //where one can find an endangeredanimals using their id
    public static EndangeredAnimals find(int id) {
        try(Connection connection = DB.sql2o.open()) {
            String sql = "SELECT * FROM endangered_animals WHERE id=:id;";
            EndangeredAnimals endangeredanimals = connection.createQuery(sql)
                    .addParameter("id", id)
                    .executeAndFetchFirst(EndangeredAnimals.class);
            return endangeredanimals;
        }
    }

    //where one can enter details and is able to save/update it
    public void save() {
        try(Connection connection = DB.sql2o.open()) {
            String sql = "INSERT INTO endangered_animals (name) VALUES (:name);";
            this.id = (int) connection.createQuery(sql, true)
                    .addParameter("name", this.name)
                    .addParameter("age_type", this.age_type)
                    .addParameter("health", this.health)
                    .executeUpdate()
                    .getKey();
        }
    }
    //UPDATES TO THE DATABASE

    public void updateHealth (String health){
        try (Connection connection = DB.sql2o.open()){
            String sql = "UPDATE endangered_animals SET health=:health WHERE id=:id;";
            connection.createQuery(sql)
                    .addParameter("id", id)
                    .addParameter("health", health)
                    .executeUpdate();
        }
    }

    public void updateAge_Type (String age_type){
        try (Connection connection = DB.sql2o.open()) {
            String sql = "UPDATE endangered_animals SET age=:age WHERE id=:id;";
            connection.createQuery(sql)
                    .addParameter("age_type", age_type)
                    .addParameter("id", id)
                    .executeUpdate();
        }
    }


    //where the user can update the database
    public void updateEndangeredNames (String name) {
        try(Connection connection = DB.sql2o.open()){
            String sql = "UPDATE endangered_animals SET name=:name WHERE id=:id;";
            connection.createQuery(sql)
                    .addParameter("name", name)
                    .addParameter("id", id)
                    .executeUpdate();
        }
    }

    //where one can delete an animal in case of wrong details
    public void dropEndangeredAnimals() {
        try (Connection connection = DB.sql2o.open()) {
            String sql = "DROP FROM endangered_animals WHERE id = :id;";
            connection.createQuery(sql)
                    .addParameter("id", id)
                    .executeUpdate();
        }
    }


    //where one can get a list of all the sightings
    public List<Sighting> getAllSightings() {
        try(Connection connection = DB.sql2o.open()) {
            String sql = "SELECT * FROM sightings WHERE endangered_animals_id =:id;";
            List<Sighting> sightings = connection.createQuery(sql)
                    .addParameter("id", id)
                    .executeAndFetch(Sighting.class);
            return sightings;
        }
    }

}
