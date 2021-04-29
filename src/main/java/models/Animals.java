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

     ///where the user is able to list all the animals using query

    @Override
    public boolean equals(Object otherAnimal) {
        if(!(otherAnimal instanceof Animals)) {
            return false;
        } else {
            Animals newAnimal = (Animals) otherAnimal;
            return this.getName().equals(newAnimal.getName());
        }
    }

//    @Override
//    public void save() {
//
//    }

//    public void save() {
//        try(Connection con = DB..open()) {
//            String sql = "INSERT INTO animals (name) VALUES (:name);";
//            this.id = (int) con.createQuery(sql, true)
//                    .addParameter("name", this.name)
//                    .executeUpdate()
//                    .getKey();
//        }
//    }

}
