package main;

public abstract class Figura  {

private int posx;	
private int posy;	
private int velx;	
private int vely;
private int tamano;	
private int colorcR;
private int colorcG;
private int colorcB;

public Figura(int px,int py,int colR,int colG,int colB) {
	
	posx=px;
	posy=py;
	colorcR=colR;
	colorcG=colG;
	colorcB=colB;
	velx=4;
	vely=4;
	tamano=50;		
}
// metodo moverse 

public abstract void moverse (); 

public abstract void pintar ();

//

public int getPosx() {
	return posx;
}

public void setPosx(int posx) {
	this.posx = posx;
}

public int getPosy() {
	return posy;
}

public void setPosy(int posy) {
	this.posy = posy;
}

public int getVelx() {
	return velx;
}

public void setVelx(int velx) {
	this.velx = velx;
}

public int getVely() {
	return vely;
}

public void setVely(int vely) {
	this.vely = vely;
}

public int getTamano() {
	return tamano;
}

public void setTamano(int tamano) {
	this.tamano = tamano;
}

public int getColorR() {
	return colorcR;
}

public void setColorR(int colorc) {
	this.colorcR = colorc;
}
public int getColorG() {
	return colorcG;
}

public void setColorG(int colorc) {
	this.colorcG = colorc;
}
public int getColorB() {
	return colorcB;
}

public void setColorB(int colorc) {
	this.colorcB = colorc;
}
	

}
