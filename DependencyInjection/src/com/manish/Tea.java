package com.manish;

public class Tea implements IHotBeverage{
	
	@Override
	public void prepareBeverage() {
		System.out.println("Preparing Tea");
	}
	
}
