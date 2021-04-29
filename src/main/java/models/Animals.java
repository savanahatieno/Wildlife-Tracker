package models;
import models.BasicInterface;

import org.sql2o.*;
import java.util.ArrayList;
import java.util.List;


public class Animals  {
    public String name;
    public int id;

   public Animals (String name, int id){
    this.name = name;
    this.id = id;
    }
     public String getName(){
       return name;
     }
     public int getId(){
       return id;
     }



    @Override
    public boolean equals(Object otherAnimal) {
        if(!(otherAnimal instanceof Animals)) {
            return false;
        } else {
            Animals newAnimal = (Animals) otherAnimal;
            return this.getName().equals(newAnimal.getName());
        }
    }


    //where one can enter details and is able to save/update it
    public void save() {
        try(Connection connection = DB.sql2o.open()) {
            String sql = "INSERT INTO animals (name) VALUES (:name);";
            this.id = (int) connection.createQuery(sql, true)
                    .addParameter("name", this.name)
                    .executeUpdate()
                    .getKey();
        }
    }

    //where one can view all the selected animals
    public static  List<Animals> all() {
       try(Connection connection = DB.sql2o.open()) {
           String sql = "SELECT * FROM animlas;";
           return connection.createQuery(sql)
                   .executeAndFetch(Animals.class);
       }
    }

    //where one can find an animal using their id
    public static Animals find(int id) {
       try(Connection connection = DB.sql2o.open()) {
           String sql = "SELECT * FROM animals WHERE id=:id;";
           Animals animals = connection.createQuery(sql)
                   .addParameter("id", id)
                   .executeAndFetchFirst(Animals.class);
               return animals;
       }
    }



}
