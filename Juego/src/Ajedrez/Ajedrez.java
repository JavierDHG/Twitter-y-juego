package Ajedrez;
import java.util.ArrayList;

import processing.core.PApplet;


public class Ajedrez extends PApplet {
    public static void main(String [] args) {
		String[] appletArgs = new String[] {"Ajedrez.Ajedrez"};
		PApplet.main(appletArgs);
		
	}
	float y=0;
	float x=0;
	    public void setup() {
	    	size(800,800);
	        int filas = 8;
	        int columnas = 8;
	        for(int i = 0 ; i < filas ; i++) {
	            for(int j = 0 ; j < columnas ; j++){
	            	if((j*j)/8==0){
	            		fill(100);
	            	}
	            	rect(i*100,j*100,100,100);
	            }
	        }  
	    }
	    public void settings() {
	    	  size(800, 800);	    	  
		    }
	    public void draw() {
			ellipse((width/2)+x,(height/2)+y,10,10);
	    	if(keyPressed &&key == CODED) {
	    		if(keyCode==LEFT) {
	    			x=x-10;
	    		}
	    		else if(keyCode == RIGHT) {
	    			x=x+10;
	    		}
	    		else if(keyCode==UP) {
	    			y= y -10;
	    		}
	    		else if(keyCode == DOWN) {
	    			y=y+10;
	    		}
	    		if((x+320)<=0) {
	    			x=x+10;
	    		}
	    		if((x+320)>=width) {
	    			x=x-10;
	    		}
	    	}if((y+240)<=0) {
	    		y=y+10;
	    	}
	    	if((y+240)>=height) {
	    	y=y-10;
	    	}
	    	fill(255);
	    	textSize(26); 
	    	text("T", 40, 50); 
	    	fill(255);
	    	textSize(26); 
	    	text("C", 140, 50); 
	    	fill(255);
	    	textSize(26); 
	    	text("A", 240, 50); 
	    	fill(255);
	    	textSize(26); 
	    	text("R", 340, 50); 
	    	fill(255);
	    	textSize(26); 
	    	text("RN", 440, 50); 
	    	fill(255);
	    	textSize(26); 
	    	text("A", 540, 50); 
	    	fill(255);
	    	textSize(26); 
	    	text("C", 640, 50); 
	    	fill(255);
	    	textSize(26); 
	    	text("T", 740, 50); 
	    	fill(255);
	    	textSize(26); 
	    	text("P", 40, 150); 
	    	fill(255);
	    	textSize(26); 
	    	text("P", 140, 150); 
	    	fill(255);
	    	textSize(26); 
	    	text("P", 240, 150); 
	    	fill(255);
	    	textSize(26); 
	    	text("P", 340, 150); 
	    	fill(255);
	    	textSize(26); 
	    	text("P", 440, 150); 
	    	fill(255);
	    	textSize(26); 
	    	text("P", 540, 150); 
	    	fill(255);
	    	textSize(26); 
	    	text("P", 640, 150); 
	    	fill(255);
	    	textSize(26); 
	    	text("P", 740, 150); 
	    	textSize(26); 
	    	text("P", 40, 650); 
	    	fill(255);
	    	textSize(26); 
	    	text("P", 140, 650); 
	    	fill(255);
	    	textSize(26); 
	    	text("P", 240, 650); 
	    	fill(255);
	    	textSize(26); 
	    	text("P", 340, 650); 
	    	fill(255);
	    	textSize(26); 
	    	text("P", 440, 650); 
	    	fill(255);
	    	textSize(26); 
	    	text("P", 540, 650); 
	    	fill(255);
	    	textSize(26); 
	    	text("P", 640, 650); 
	    	fill(255);
	    	textSize(26); 
	    	text("P", 740, 650); 
	    	fill(255);
	    	textSize(26); 
	    	text("T", 40, 750); 
	    	fill(255);
	    	textSize(26); 
	    	text("C", 140, 750); 
	    	fill(255);
	    	textSize(26); 
	    	text("A", 240, 750); 
	    	fill(255);
	    	textSize(26); 
	    	text("R", 340, 750); 
	    	fill(255);
	    	textSize(26); 
	    	text("RN", 440, 750); 
	    	fill(255);
	    	textSize(26); 
	    	text("A", 540, 750); 
	    	fill(255);
	    	textSize(26); 
	    	text("C", 640, 750); 
	    	fill(255);
	    	textSize(26); 
	    	text("T", 740, 750); 
	    	fill(255);
	    	textSize(26);
	    	
}	
}