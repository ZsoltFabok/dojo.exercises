package dojo.factory;

public class Game {

    public static void main(String args[]) {
        ApplicationFactory appFactory = ApplicationFactory.getInstance();
        // fabokzs: interesting variable name, why this kind of injection?
        Farmer farmerTest = appFactory.getFarmer(appFactory);
        farmerTest.start();
    }
}
