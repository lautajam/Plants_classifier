package com.lautajamdev.logic;

public class Flower extends Plant{
	
//	Variables
	private String petalsColor;
	private int numberPetals;
	private String pistilColor;
	private String flowerType;
	private String season;
	
//	Constructors
	public Flower() {
		super();
	}
	
	public Flower(String name, double stemHeight, boolean leaves, String weather) {
		super(name, stemHeight, leaves, weather);
	}

	public Flower(String petalsColor, int numberPetals, String pistilColor, String flowerType, String season) {
		this.petalsColor = petalsColor;
		this.numberPetals = numberPetals;
		this.pistilColor = pistilColor;
		this.flowerType = flowerType;
		this.season = season;
	}

	public Flower(String name, double stemHeight, boolean leaves, String weather, String petalsColor, int numberPetals,
			String pistilColor, String flowerType, String season) {
		super(name, stemHeight, leaves, weather);
		this.petalsColor = petalsColor;
		this.numberPetals = numberPetals;
		this.pistilColor = pistilColor;
		this.flowerType = flowerType;
		this.season = season;
	}

//	Getters & Setters
	public String getPetalsColor() {
		return petalsColor;
	}

	public void setPetalsColor(String petalsColor) {
		this.petalsColor = petalsColor;
	}

	public int getNumberPetals() {
		return numberPetals;
	}

	public void setNumberPetals(int numberPetals) {
		this.numberPetals = numberPetals;
	}

	public String getPistilColor() {
		return pistilColor;
	}

	public void setPistilColor(String pistilColor) {
		this.pistilColor = pistilColor;
	}

	public String getFlowerType() {
		return flowerType;
	}

	public void setFlowerType(String flowerType) {
		this.flowerType = flowerType;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}
	
	@Override
	public void gretting() {
		System.out.println("Hi, i'm a Flower");
	}

}
