package view;

import model.*;
import processing.core.PApplet;


public class Main extends PApplet{

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}
	
	Logic logic= new Logic(this);
	GameScreen gameScreen = new GameScreen(this);
	int screen;
	
	public void settings() {
		size(1000,800);
	}
	
	public void setup() {
		imageMode(CENTER);
		logic.loadImages();
		gameScreen.loadImages();
		logic.createInitialOrganisms();
		screen = 0;
	}
	
	public void draw() {
		background(255);
		switch(screen) {
		case 0:
			
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
			
			break;
		case 1:
			gameScreen.pause();
			break;
		}
		
	
	}


}
