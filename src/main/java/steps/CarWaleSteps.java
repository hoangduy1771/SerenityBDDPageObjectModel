package steps;

import net.serenitybdd.annotations.Step;
import pages.HomePage;

public class CarWaleSteps {

    HomePage home;

    @Step
    public void navigate() {
        home.openUrl("https://www.carwale.com/");

    }

    @Step
    public void findNewCars() {
        home.findNewCars();
    }


}
