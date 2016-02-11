import org.junit.*;
import static org.junit.Assert.*;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class AllergiesTest {
  // extends FluentTest
  // public WebDriver webDriver = new HtmlUnitDriver();
  // public WebDriver getDefaultDriver() {
  //     return webDriver;
  // }
  //
  // @ClassRule
  // public static ServerRule server = new ServerRule();
  //
  // @Test
  // public void rootTest() {
  //     goTo("http://localhost:4567/");
  //     assertThat(pageSource()).contains("Cash Register, FOR CHANGE ONLY");
  // }
  // @Test
  // public void makeChange() {
  // goTo("http://localhost:4567");
  // fill("#changeDue").with("95");
  // submit(".btn");
  // assertThat(pageSource()).contains("Quarters: 3 Dimes: 2 Nickels: 0 Pennies: 0");
  // }
  // @Test
  // public void makeMoreChange() {
  //   goTo("http://localhost:4567");
  //   fill("#changeDue").with("11");
  //   submit(".btn");
  //   assertThat(pageSource()).contains("Quarters: 0 Dimes: 1 Nickels: 0 Pennies: 1");
  // }
  @Test
  public void convertScore_input1_eggs() {
    Allergies returnAllergy = new Allergies();
    ArrayList<String> userAllergy = new ArrayList<String>();
    userAllergy.add("eggs");
    assertEquals(userAllergy, returnAllergy.convertScore(1));
  }
  @Test
  public void convertScore_input129_catseggs() {
    Allergies returnAllergy = new Allergies();
    ArrayList<String> userAllergy = new ArrayList<String>();
    userAllergy.add("eggs");
    userAllergy.add("cats");
    assertEquals(userAllergy, returnAllergy.convertScore(129));
  }
  @Test
  public void convertScore_input193_catseggspollen() {
    Allergies returnAllergy = new Allergies();
    ArrayList<String> userAllergy = new ArrayList<String>();
    userAllergy.add("eggs");
    userAllergy.add("cats");
    userAllergy.add("pollen");
    assertEquals(userAllergy, returnAllergy.convertScore(193));
  }
}
