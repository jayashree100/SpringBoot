package com.bridgelab.ioc;

public class Airtel implements Sim{

	@Override
	public void calling() {
		System.out.println("calling using Airtel sim");
		
	}

	@Override
	public void data() {
		System.out.println("browse the data using Airtel sim");
		
	}

}
