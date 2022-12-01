package com.lautajamdev.logic;

public class Bush extends Plant {

//	Variables
	private double widthBush;
	private boolean domestic;
	private String bushType;
	private String leavesColor;
	private boolean prune;
	
//	Constructors
	public Bush() {
		super();
	}
	
	public Bush(String name, double stemHeight, boolean leaves, String weather) {
		super(name, stemHeight, leaves, weather);
	}

	public Bush(double widthBush, boolean domestic, String bushType, String leavesColor, boolean prune) {
		super();
		this.widthBush = widthBush;
		this.domestic = domestic;
		this.bushType = bushType;
		this.leavesColor = leavesColor;
		this.prune = prune;
	}

	public Bush(String name, double stemHeight, boolean leaves, String weather, double widthBush, boolean domestic,
			String bushType, String leavesColor, boolean prune) {
		super(name, stemHeight, leaves, weather);
		this.widthBush = widthBush;
		this.domestic = domestic;
		this.bushType = bushType;
		this.leavesColor = leavesColor;
		this.prune = prune;
	}

//	Getters & Setters
	public double getWidthBush() {
		return widthBush;
	}

	public void setWidthBush(double widthBush) {
		this.widthBush = widthBush;
	}

	public boolean isDomestic() {
		return domestic;
	}

	public void setDomestic(boolean domestic) {
		this.domestic = domestic;
	}

	public String getBushType() {
		return bushType;
	}

	public void setBushType(String bushType) {
		this.bushType = bushType;
	}

	public String getLeavesColor() {
		return leavesColor;
	}

	public void setLeavesColor(String leavesColor) {
		this.leavesColor = leavesColor;
	}

	public boolean isPrune() {
		return prune;
	}

	public void setPrune(boolean prune) {
		this.prune = prune;
	}

	@Override
	public void gretting() {
		System.out.println("Hi, i'm a Bush");
	}
	
}
