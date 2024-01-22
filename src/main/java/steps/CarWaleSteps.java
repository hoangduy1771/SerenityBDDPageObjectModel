package steps;

import net.serenitybdd.annotations.Step;
import pages.HomePage;
import pages.NewCarsPage;

public class CarWaleSteps {

    HomePage home;
    NewCarsPage newCarsPage;

    @Step
    public void navigate() {
        home.openUrl("https://www.carwale.com/");

    }

    @Step
    public void findNewCars(String carMake) throws InterruptedException {
        home.findNewCars();
        newCarsPage.chooseCarBrand(carMake);
    }


}
