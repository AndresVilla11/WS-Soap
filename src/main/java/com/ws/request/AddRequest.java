package com.ws.request;

public class AddRequest {
	private int intA;
	private int intB;
	
	public AddRequest() {}
	
	public AddRequest(int intA, int intB) {
		this.intA = intA;
		this.intB = intB;
	}

	public int getIntA() {
		return intA;
	}

	public void setIntA(int intA) {
		this.intA = intA;
	}

	public int getIntB() {
		return intB;
	}

	public void setIntB(int intB) {
		this.intB = intB;
	}

}
