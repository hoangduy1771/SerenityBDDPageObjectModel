package testcases;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Title;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.CarWaleSteps;

@RunWith(SerenityRunner.class)
public class FindCarTest {

    @Managed
    WebDriver driver;

    @Steps
    CarWaleSteps car;

    @Title("Finding Car Test")
    @Test
    public void findCarTest() {
        car.navigate();
        car.findNewCars();

    }




}
