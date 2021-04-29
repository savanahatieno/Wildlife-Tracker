import models.Animals;
import models.EndageredAnimals;
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
        String main = "templates/layout.hbs";


//        get("/", (request, response) -> {
//            Map <String, Object> model = new HashMap<>());
//            model.put("Animals", Animals.all());
//            model.put("endangeredAnimals", EndageredAnimals.all());
//            model.put("sightings", Sighting.all());
//            model.put("template", "templates/index.hbs");
//            return new ModelAndView(model, modelAndView());
//        }, new HandlebarsTemplateEngine());
    }
}
