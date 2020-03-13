package main;

import processing.core.PApplet;

public class Circulo extends Figura {
	
	private PApplet app; 
	
	public Circulo (int px,int py,int colR,int colG,int colB,PApplet app){
		super(px,py,colR,colG,colB);
		this.app= app; 	
		
	}

	public void moverse(){
		
		this.setPosx(this.getVelx()+ this.getPosx());
		if(this.getPosx()>=775 ||this.getPosx()<=25) {
			this.setVelx(this.getVelx() * -1);
		}
			
	}//moverse 
	
	public void pintar(){
		app.fill(this.getColorR(),this.getColorG(),this.getColorB());
		app.ellipse(this.getPosx(),this.getPosy(),this.getTamano(),this.getTamano());
		
	}//pintar
}
