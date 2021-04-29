import models.Animals;
import models.EndangeredAnimals;
import models.Ranger;
import models.Sighting;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    //connecting to localhost
    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }

    public static void main(String[] args) {
        port(getHerokuAssignedPort());
        staticFileLocation("/public");
        String layout = "templates/layout.hbs";

       //MAIN PAGE
        get("/", (request, response) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("animals", Animals.all());
            model.put("endangeredAnimals", EndangeredAnimals.all());
//            model.put("sightings", Sighting.all());
            model.put("template", "templates/index.hbs");
            return new ModelAndView(model , layout);
        } , new HandlebarsTemplateEngine());


        //Adding new animals
        get("/aniamls/new", (request, response) -> {
            Map <String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/animals_")
        });


    }
}
