package view;

import model.*;
import processing.core.PApplet;


public class Main extends PApplet{

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}
	
	Logic logic= new Logic(this);
	GameScreen gameScreen = new GameScreen(this);
	
	
	public void settings() {
		size(1000,800);
	}
	
	public void setup() {
		imageMode(CENTER);
		logic.loadImages();
		gameScreen.loadImages();
		logic.createInitialOrganisms();
	}
	
	public void draw() {
		background(255);
		gameScreen.paintBg();
		logic.paintOrganisms();
		gameScreen.paintIcons();
		if(!gameScreen.getPause()){
		logic.start();
		}
		//logic.timer();
		int yolo=0;
		System.out.println(yolo);
	}
	
	public void mousePressed() {
		gameScreen.pause();
	
	}


}
