package model;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Amoeba {
	
	protected float x;
	protected float y;
	protected int age;
	protected String status;
	protected String gender;
	protected PApplet app;
	protected PImage img;
	protected int type;

	
	public Amoeba(float x,float y,int age,String status,String gender,PImage img,PApplet app,int type){
		this.x=x;
		this.y=y;
		this.age=age;
		this.status=status;
		this.gender=gender;
		this.img=img;
		this.app=app;
		this.type=type;
		
	} 
	
	abstract void eat();
	
	abstract void draw();
	
	abstract void move();
	
	abstract void grow();
	
	abstract void dieByAge();
	
	abstract void sex();
	//getters y setters

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}

