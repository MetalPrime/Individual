package model;

import processing.core.PApplet;
import processing.core.PImage;

public class ListType extends Amoeba implements Runnable{
	
	private double speedX;
	private double speedY;

	public ListType(float x, float y, int age, String status, String gender, PImage img, PApplet app, int type) {
		super(x, y, age, status, gender, img, app, type );
		switch(type) {
		case 0:
			this.speedX= 2;
			this.speedY= 2;
			break;
		case 1:
			this.speedX=2.5;
			this.speedY=2.5;
			break;
		case 2:
			this.speedX=0.5;
			this.speedY=0.5;
			break;
		}
	
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		move();
		grow();
		dieByAge();
		eat();
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		switch(type) {
		case 0:
			app.image(img, x, y);
			break;
		case 1:
			app.image(img, x, y);
			break;
		case 2:
			app.image(img, x, y);
			break;
		}
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
		int width = 1000;
		int height = 800;
		
		switch(type) {
		case 0:
			x+=speedX;
			y+=speedY;
			
			if(x<10 || x>width-10) {
				speedX*=-1;
			}
			
			if(y<11 || y>height-11) {
				speedY*=-1;
			}
			break;
		case 1:
			x-=speedX;
			y-=speedY;
			
			if(x<20 || x>width-20) {
				speedX*=-1;
			}
			
			if(y<20 || y>height-20) {
				speedY*=-1;
			}
			break;
		case 2:
			x+=speedX;
			y-=speedY;
			
			if(x<30 || x>width-30) {
				speedX*=-1;
			}
			
			if(y<30 || y>height-30) {
				speedY*=-1;
			}
			break;
		}
	}

	@Override
	public void grow() {
		// TODO Auto-generated method stub
		int time= 0;
		
			if(app.frameCount%180==0){
				time+=1;
			}
			int test = time%10;
					
			age+=test;
	}

	@Override
	public void dieByAge() {
		// TODO Auto-generated method stub
		switch(type) {
		case 0:
			if(age==10){	
				status="muerto";
			}
			break;
		case 1:
			if(age==5){	
				status="muerto";
			}
			break;
		case 2:
			if(age==20){	
				status="muerto";
			}
			break;
		}
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}


}
