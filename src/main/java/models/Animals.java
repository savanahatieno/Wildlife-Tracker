package models;

import org.sql2o.*;
import java.util.ArrayList;
import java.util.List;


public class Animals {
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

    public static List<Animals> all(){
       try(Connection connection = DB.sql2o.open()){
           String sql = "SELECT * FROM animals;";
           return connection.createQuery(sql)
                   .executeAndFetch(Animals.class);
       }
    }


}
