package view;

import processing.core.PApplet;
import processing.core.PImage;

public class InitialScreen {
	
	private PApplet app;
	private PImage background;
	private PImage botton;
	
	public InitialScreen(PApplet app) {
		this.app = app;
		
	}
	
	public void loadImages() {
		background=  app.loadImage("data/background.png");
	}
}
