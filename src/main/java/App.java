import models.Animals;
import models.EndangeredAnimals;
//import models.Ranger;
import models.Sighting;
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
        String index = "templates/index.hbs";

        //MAIN PAGE
        // Main Page
        get("/", (request, response) -> {
            return new ModelAndView(new HashMap(), "index.hbs");
        }, new HandlebarsTemplateEngine());

        //Nav Section
        get("/nav", (request, response) -> {
            return new ModelAndView(new HashMap(), "nav.hbs");
        }, new HandlebarsTemplateEngine());

        //Endangered Animals
        get("/endangeredanimals", (request, response) -> {
            return new ModelAndView(new HashMap(), "endangeredanimals.hbs");
        }, new HandlebarsTemplateEngine());

        //Animals
        get("/animals/new", (request, response) -> {
            return new ModelAndView(new HashMap(), "animals-form.hbs");
        }, new HandlebarsTemplateEngine());

        //Animals
        get("/animals", (request, response) -> {
            return new ModelAndView(new HashMap(), "animals.hbs");
        }, new HandlebarsTemplateEngine());

//
//        get("/", (request, response) -> {
//            Map<String, Object> model = new HashMap<String, Object>();
//            model.put("animals", Animals.all());
//            model.put("endangeredAnimals", EndangeredAnimals.all());
////            model.put("sightings", Sighting.all());
//            model.put("template", "templates/index.hbs");
//            return new ModelAndView(model, index);
//        }, new HandlebarsTemplateEngine());
//
//
//        //Adding new animals (GET)
//        get("/animals/new", (request, response) -> {
//            Map <String, Object> model = new HashMap<String, Object>();
//            model.put("template", "templates/animals-form.hbs");
//            return  new ModelAndView(model, index);
//        }, new HandlebarsTemplateEngine());
//
//        //Adding new animals (POST)
//        post("/animals/new", (request, response) -> {
//            Map<String, Object> model = new HashMap<String, Object>();
//            boolean endangered = request.queryParamsValues("endangered")!=null;
//            if (endangered) {
//                String name = request.queryParams("name");
//                String health = request.queryParams("health");
//                String age = request.queryParams("age");
//                EndangeredAnimals endangeredAnimals = new EndangeredAnimals(name, health, age);
//                endangeredAnimals.save();
//                model.put("animals", Animals.all());
//                model.put("endangeredAnimals", EndangeredAnimals.all());
//            } else {
//                String name = request.queryParams("name");
//                Animals animals = new Animals("name",3);
//                animals.save();
//                model.put("animals", Animals.all());
//                model.put("endangeredAnimals", EndangeredAnimals.all());
//            }
//            response.redirect("/");
//            return null;
//        });
//
//        //VIEW ALL ANIMALS
//        get("/animals", (request, response) -> {
//            Map<String, Object> model = new HashMap<String, Object>();
//            model.put("animals", Animals.all());
//            model.put("endangeredAnimals", EndangeredAnimals.all());
//            model.put("sightings", Sighting.all());
//            model.put("template", "templates/animals.hbs");
//            return new ModelAndView(model, index);
//        }, new HandlebarsTemplateEngine());
//
//
//
//        //Adding Endangered animals
//
//        get("/endangered_animals/:id", (request, response) -> {
//            Map<String, Object> model = new HashMap<String, Object>();
//            EndangeredAnimals endangeredAnimals = EndangeredAnimals.find(Integer.parseInt(request.params("id")));
//            model.put("endangeredAnimals", endangeredAnimals);
//            model.put("template", "templates/endangeredanimals.hbs");
//            return new ModelAndView(model, index);
//        }, new HandlebarsTemplateEngine());
//
//        //Sightings (GET)
//        get("/sighting", (request, response) -> {
//            Map<String, Object> model = new HashMap<String, Object>();
//            model.put("animals", Animals.all());
//            model.put("endangeredAnimals", EndangeredAnimals.all());
//            model.put("template", "templates/sighting.hbs");
//            return new ModelAndView(model, index);
//        }, new HandlebarsTemplateEngine());
//
//        //Sightings (POST)
//        post("/sighting", (request, response) -> {
//            Map<String, Object> model = new HashMap<String, Object>();
//            int animalIdSelected = Integer.parseInt(request.queryParams("animalSelected"));
//            String latLong = request.queryParams("latLong");
//            String rangerName = request.queryParams("rangerName");
//            Sighting sighting = new Sighting(rangerName, latLong, animalIdSelected);
//            sighting.save();
//            model.put("sightings", sighting);
//            model.put("animals", Animals.all());
//            String animals = Animals.find(animalIdSelected).getName();
//            model.put("animals", animals);
//            model.put("template", "templates/success.hbs");
//            return new ModelAndView(model, index);
//        }, new HandlebarsTemplateEngine());
//
//
//        post("/endangered_sighting", (request, response) -> {
//            Map<String, Object> model = new HashMap<String, Object>();
//            int animalIdSelected = Integer.parseInt(request.queryParams("endangeredAnimalSelected"));
//            String health = request.queryParams("health");
//            String age = request.queryParams("age");
//            String latLong = request.queryParams("latLong");
//            String rangerName = request.queryParams("rangerName");
//            Sighting sighting = new Sighting(rangerName, latLong, animalIdSelected);
//            sighting.save();
//            String animals = EndangeredAnimals.find(animalIdSelected).getName();
//            int animalId = Integer.parseInt(request.queryParams("endangeredAnimalSelected"));
//            EndangeredAnimals updatedAnimal = EndangeredAnimals.find(animalId);
//            updatedAnimal.updateHealth(health);
//            updatedAnimal.updateAge_Type(updatedAnimal.age_type);
//            model.put("animals", animals);
//            model.put("template", "templates/endangeredanimals.hbs");
//            return new ModelAndView(model, index);
//        }, new HandlebarsTemplateEngine());
//
//        //ERRORS
//        get("/error", (request, response) -> {
//            Map<String, Object> model = new HashMap<String, Object>();
//            model.put("template", "templates/error.hbs");
//            return new ModelAndView(model, index);
//        }, new HandlebarsTemplateEngine());
//    }
//
    }
}






