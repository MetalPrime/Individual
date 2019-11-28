package view;

import processing.core.PApplet;
import processing.core.PImage;

public class GameScreen {

	private PApplet app;
	private PImage background;
	private PImage pauseIcon;
	private PImage reloadIcon;
	private Boolean pause;
	
	public GameScreen(PApplet app){
		this.app=app;
		this.pause=false;
	}
	
	public void loadImages(){
		background=app.loadImage("data/background.png");
		pauseIcon=app.loadImage("data/pause.png");
		reloadIcon=app.loadImage("data/reload.png");
	}
	
	public void paintBg() {
		int width = 1000;
		int height = 800;
		
		app.image(background, width/2, height/2);
	
	}
	
	public void paintIcons() {
		int width = 1000;
		int height = 800;
		int state;
		
		if(pause) {
			state=1;
		}else{
			state=0;
		}
		
		switch(state){
		case 0:
			app.image(pauseIcon, 905, 34);
			app.image(reloadIcon, 968, 34);
			
		break;
		case 1:
			app.image(pauseIcon, 905, 34);
			app.image(reloadIcon, 968, 34);
			app.fill(0,0,0,40);
			app.rect(0, 0, width, height);
		break;
		
		}
	}
	
	public void pause() {
		if(app.mouseX > 905-15 && app.mouseX< 905+15 &&
			app.mouseY > 34-15 && app.mouseY <34+15) {
			if(pause) {
				pause=false;
			}else {
				pause=true;
			}
			
		}
		
	}
	
	public Boolean getPause() {
		return pause;
	}

	public void setPause(Boolean pause) {
		this.pause = pause;
	}
}
