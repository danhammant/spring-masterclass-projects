package com.danhammant.springdemo.service;

public class RandomiserSessionScope {
	private int randomNumber = 4;
	
	public int getRandomNumber() {
		return randomNumber;
	}
	
	public void generateRandomNumber() {
		this.randomNumber = (int) (Math.random() * 9999); 
	}

}
