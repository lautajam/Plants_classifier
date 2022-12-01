package com.lautajamdev.logic;

public abstract class Plant {

//	Variables
	protected String name;
	protected double stemHeight;
	protected boolean leaves;
	protected String weather;
	
//	Constructors
	public Plant() {
		
	}

	public Plant(String name, double stemHeight, boolean leaves, String weather) {
		this.name = name;
		this.stemHeight = stemHeight;
		this.leaves = leaves;
		this.weather = weather;
	}
	
//	Getters & Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getStemHeight() {
		return stemHeight;
	}

	public void setStemHeight(double stemHeight) {
		this.stemHeight = stemHeight;
	}

	public boolean isLeaves() {
		return leaves;
	}

	public void setLeaves(boolean leaves) {
		this.leaves = leaves;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}
	
//	Methods
	protected abstract void gretting();
	
}