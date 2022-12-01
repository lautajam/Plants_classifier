package com.lautajamdev.logic;

public class Tree extends Plant{

//	Variables
	private String variety;
	private String trunkType;
	private double trunkRadius;
	private String color;
	private String leavesType;
	
//	Constructors
	public Tree() {
		super();
	}
	
	public Tree(String name, double stemHeight, boolean leaves, String weather) {
		super(name, stemHeight, leaves, weather);
	}

	public Tree(String variety, String trunkType, double trunkRadius, String color, String leavesType) {
		super();
		this.variety = variety;
		this.trunkType = trunkType;
		this.trunkRadius = trunkRadius;
		this.color = color;
		this.leavesType = leavesType;
	}

	public Tree(String name, double stemHeight, boolean leaves, String weather, String variety, String trunkType,
			double trunkRadius, String color, String leavesType) {
		super(name, stemHeight, leaves, weather);
		this.variety = variety;
		this.trunkType = trunkType;
		this.trunkRadius = trunkRadius;
		this.color = color;
		this.leavesType = leavesType;
	}

//	Getters & Setters
	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public String getTrunkType() {
		return trunkType;
	}

	public void setTrunkType(String trunkType) {
		this.trunkType = trunkType;
	}

	public double getTrunkRadius() {
		return trunkRadius;
	}

	public void setTrunkRadius(double trunkRadius) {
		this.trunkRadius = trunkRadius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLeavesType() {
		return leavesType;
	}

	public void setLeavesType(String leavesType) {
		this.leavesType = leavesType;
	}
	
	@Override
	public void gretting() {
		System.out.println("Hi, i'm a Tree");
	}
	
}
