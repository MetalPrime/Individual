package model;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Logic {
	
	private PApplet app;
	private PImage image1;
	private PImage image2;
	private PImage image3;
	private PImage image4;
	private PImage image5;
	
	private ArrayList<ListType> types1;
	private ArrayList<ListType> types2;
	private ArrayList<ListType> types3;
	private String[] infoStrings;

	public Logic(PApplet app) {
		this.types1 =new ArrayList<ListType>();
		this.types2 = new ArrayList<ListType>();
		this.types3 = new ArrayList<ListType>();
		this.app=app;
		
	}
	
	public void timer(){
		int minutos = 00;
		int segundos= 00;
		
				
		
		if(segundos==60){
			segundos=00;
			minutos+=1;
		}
		System.out.println(minutos+":"+segundos);
	}
	
	public void loadImages(){
		image1=app.loadImage("data/amenaM1.png");
		image2=app.loadImage("data/amenaM2.png");
		image3=app.loadImage("data/amena3.png");
		image4=app.loadImage("data/amenaF1.png");
		image5=app.loadImage("data/amenaF2.png");
	}

	public void createInitialOrganisms() {
		infoStrings= app.loadStrings("data/info.txt");
		
		for (String texto : infoStrings) {
			
			int x = (int) app.random(50, 950);
			int y = (int) app.random(50, 750);
			
			String [] info = texto.split(",");

			int type = Integer.parseInt(info[0]);
			String status = info[1];
			int age = Integer.parseInt(info[2]);
			String gender = info[3];

			if(type == 0){
					types1.add(new ListType(x, y, age,status,gender,image1,app, type));
					System.out.println(gender);
				}
				
				
			
			if(type == 1){
				types2.add(new ListType(x, y, age,status,gender,image2,app, type));
			}
			
			if(type == 2){
				types3.add(new ListType(x, y, age,status,gender,image3,app, type));
			}
			
		}
		
	}
	
	public void paintOrganisms() {
		for(int i = 0; i < types1.size(); i++) {
			types1.get(i).draw();
		  }
		
        for(int i = 0; i < types2.size(); i++) {
			types2.get(i).draw();
		  }
        
        for(int i = 0; i < types3.size(); i++) {		
			types3.get(i).draw();
		  }
	}
	
	public void start(){
		
		for(int i = 0; i < types1.size(); i++) {
	
			if(types1.get(i).getStatus().equals("vivo")){	
				new Thread(types1.get(i)).start();	
			}
		  }
		
		for(int i = 0; i < types2.size(); i++) {
			
			if(types2.get(i).getStatus().equals("vivo")){	
				new Thread(types2.get(i)).start();	
			}
		  }
		
		for(int i = 0; i < types3.size(); i++) {
			
			types3.get(i).draw();
			
			if(types3.get(i).getStatus().equals("vivo")){	
				new Thread(types3.get(i)).start();	
			}
		  }
	}

	public ArrayList<ListType> getTypes1() {
		return types1;
	}

	public ArrayList<ListType> getTypes2() {
		return types2;
	}

	public ArrayList<ListType> getTypes3() {
		return types3;
	}
	
}
