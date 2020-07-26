package com.manish;

public class TestClass {
	public static void main(String[] args) {
		
		// Now either we can use setter method for dependency injection
		// or we can use constructor way.
		
		// 1st setter method way.
		IHotBeverage tea = new Tea();
		Resturant resturant1 = new Resturant();
		resturant1.setiHotBeverage(tea);
		resturant1.prepareBeverage();
		
		
		// 2nd constructor way
		Resturant resturant2 = new Resturant(new Tea());
		resturant2.prepareBeverage();
		
	}
}
