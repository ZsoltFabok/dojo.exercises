package dojo.factory;

import java.util.Random;

public class Main {

	static Random random = new Random();

	public static void main(String... args) {
		FarmApp farmApp = AppFactory.getInstance().buildApp(random);
		farmApp.run();
	}

}
