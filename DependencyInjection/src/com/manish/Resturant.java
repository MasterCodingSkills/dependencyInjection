package com.manish;

public class Resturant implements IBeverageResturant {
	//Tea tea = new Tea();
	private IHotBeverage iHotBeverage;
	
	public Resturant() {}
	
	// dependency injection by constructor
	public Resturant(IHotBeverage iHotBeverage) {
		this.iHotBeverage = iHotBeverage;
	}
	
	public IHotBeverage getiHotBeverage() {
		return iHotBeverage;
	}
	
	// dependency injection by setter method
	public void setiHotBeverage(IHotBeverage iHotBeverage) {
		this.iHotBeverage = iHotBeverage;
	}

	@Override
	public void prepareBeverage() {
		iHotBeverage.prepareBeverage();
	}
}
