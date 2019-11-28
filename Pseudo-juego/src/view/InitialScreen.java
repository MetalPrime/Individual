package view;

import processing.core.PApplet;
import processing.core.PImage;

public class InitialScreen {
	
	private PApplet app;
	private PImage background;
	private PImage botton;
	private Boolean continuar;
	
	public InitialScreen(PApplet app) {
		this.app = app;
		this.continuar=false;
		
	}
	
	public void loadImages() {
		background= app.loadImage("./data/background.png");
		botton = app.loadImage("./data/reload.png");
	}
	
	public void paintBg() {
		int width = 1000;
		int height = 800;
		
		app.image(background,width/2, height/2);
	}
	
	public void paintBotton() {
		app.image(botton,500,0);
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
