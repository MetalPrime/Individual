package view;

import model.*;
import processing.core.PApplet;


public class Main extends PApplet{

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}
	
	Logic logic= new Logic(this);
	GameScreen gameScreen = new GameScreen(this);
	InitialScreen initialScreen = new InitialScreen(this);
	int screen;
	
	public void settings() {
		size(1000,800);
	}
	
	public void setup() {
		imageMode(CENTER);
		logic.loadImages();
		gameScreen.loadImages();
		initialScreen.loadImages();
		logic.createInitialOrganisms();
		screen = 0;
	}
	
	public void draw() {
		background(255);
		switch(screen) {
		case 0:
		initialScreen.paintBg();
		initialScreen.paintBotton();
			break;
		case 1:
		gameScreen.paintBg();
		logic.paintOrganisms();
		gameScreen.paintIcons();
		if(!gameScreen.getPause()){
		logic.start();
		}
		//logic.timer();
		break;
		}
	
		
	}
	
	public void mousePressed() {
		switch(screen) {
		case 0:
			initialScreen.nextPage();
			if(initialScreen.isContinuar()==true && screen==0) {
				screen=1;
			}
			
			break;
		case 1:
			gameScreen.pause();
			break;
		}
		
	
	}


}
