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

       //MAIN PAGE
        get("/", (request, response) ->{
            return new ModelAndView(new HashMap(), "index.hbs");
        } , new HandlebarsTemplateEngine());


    }
}
