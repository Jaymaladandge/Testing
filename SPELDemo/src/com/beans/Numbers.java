package com.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("nums")
public class Numbers {

	@Value("100")
	private int a;

	@Value("200")
	private int b;

	public Numbers() {
		System.out.println("Numbers()");
	}

	public Numbers(int a, int b) {
		System.out.println("Numbers(int a, int b)");
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
