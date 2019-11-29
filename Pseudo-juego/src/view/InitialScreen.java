package view;

import processing.core.PApplet;
import processing.core.PImage;

public class InitialScreen {
	
	private PApplet app;
	private PImage background;
	private PImage botton;
	private PImage title;
	private Boolean continuar;
	
	public InitialScreen(PApplet app) {
		this.app = app;
		this.continuar=false;
		
	}
	
	public void loadImages() {
		background= app.loadImage("./data/background.png");
		botton = app.loadImage("./data/reload.png");
		title = app.loadImage("./data/name.png");
	}
	
	public void paintBg() {

		
		app.image(background,app.width/2, app.height/2);
	}
	
	public void paintBotton() {
		app.image(title, app.width/2,app.height/3,450,300);
		app.image(botton,500,500);
	}
	
	public void nextPage() {
		if(app.mouseX>0 && app.mouseY>0) {
			if(continuar) {
				continuar=false;
			}else {
				continuar=true;
			}
		}
	}

	public boolean isContinuar() {
		return continuar;
	}

	public void setContinuar(boolean continuar) {
		this.continuar = continuar;
	}
}
