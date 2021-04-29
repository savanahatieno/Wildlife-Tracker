package models;

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
}
