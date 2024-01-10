package pages;

import base.BasePage;

public class HomePage extends BasePage {
    String newCarMenu = "xpath=//div[contains(text(), 'NEW CARS')]";
    String findNewCar = "xpath=//div[contains(text(), 'Find New Cars')]";

//    all business pages will extend BasePage

    public void login() {

    }

    public void checkOnRoadPrice() {

    }

    public void findNewCars() {
        moveMouseTo(newCarMenu);
        click(findNewCar);

    }

    public void findUsedCars() {

    }


}
