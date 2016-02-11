import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;


public class Allergies {
  public static void main(String[] args) {
    // String layout = "templates/layout.vtl";
    //
    // get("/", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/home.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
    //
    // get("/detector", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/detector.vtl");
    //
    //   int changeDue = Integer.parseInt(request.queryParams("changeDue"));
    //   String results = makeChange(changeDue);
    //
    //   model.put("results", results);
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
  }

  public static ArrayList<String> convertScore(int score) {
    ArrayList<String> returnAllergy = new ArrayList<String>();
    if ( score % 2 == 1) {
      returnAllergy.add("eggs");
      score -= 1;
    }
    if ( score >= 128 ) {
      returnAllergy.add("cats");
      score -= 128;
    }
    if ( score >= 64 ) {
      returnAllergy.add("pollen");
      score -= 64;
    }
    if (score >= 32 ) {
      returnAllergy.add("chocolate");
      score -= 32;
    }
      return returnAllergy;
  }
}
