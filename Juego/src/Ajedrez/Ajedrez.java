package Ajedrez;
import java.util.ArrayList;
import processing.core.PApplet;

public class Ajedrez extends PApplet {
    public static void main(String [] args) {
		String[] appletArgs = new String[] {"Ajedrez.Ajedrez"};
		PApplet.main(appletArgs);
		
	}
	char peon='P';
	char caballo='C';
	char alfil='A';
	char rey='r';
	char reina='R';
	char torre='T';
    int filas = 8;
    int columnas = 8;
	int dir=4;
	
	    public void setup() {
	    	size(800,800);
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
	    	text("r", 340, 50); 
	    	fill(255);
	    	textSize(26); 
	    	text("R", 440, 50); 
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
	    	text("r", 340, 750); 
	    	fill(255);
	    	textSize(26); 
	    	text("R", 440, 750); 
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
	    public void movimientos() {
	    	Object[] arreglo = new Object[8];
	    	Object[] arreglo1 = new Object[8];
		        for(int i = 0 ; i < arreglo.length  ; i++) {
		            for(int j = 0 ; j < arreglo.length ; j++){
		            	if(peon==UP) {
		            		peon=(char) arreglo1[j+1];
		            	}else if(peon==DOWN){
		            		peon=(char) arreglo1[j-1];
		            	}else if(peon==LEFT){
		            		peon=(char) arreglo1[i-1];		            		
		            	}else if(peon==RIGHT){
		            		peon=(char) arreglo1[i+1];
		            	}
		            	if(caballo==UP) {
		            		caballo=(char) arreglo1[j+3];
		            	}else if(caballo==DOWN){
		            		caballo=(char) arreglo1[j-3];
		            	}else if(caballo==LEFT){
		            		caballo=(char) arreglo1[i-1];		            		
		            	}else if(caballo==RIGHT){
		            		caballo=(char) arreglo1[i+1];
		            	}
		            	if(alfil==UP) {
		            		alfil=(char) arreglo1[j+1];
		            	}else if(alfil==DOWN){
		            		alfil=(char) arreglo1[j-1];
		            	}else if(alfil==LEFT){
		            		alfil=(char) arreglo1[i-1];		            		
		            	}else if(alfil==RIGHT){
		            		alfil=(char) arreglo1[i+1];	
		            	}
		            	if(rey==UP) {
		            		rey=(char) arreglo1[j+1];
		            	}else if(rey==DOWN){
		            		rey=(char) arreglo1[j-1];
		            	}else if(rey==LEFT){
		            		rey=(char) arreglo1[i+1];	            		
		            	}else if(rey==RIGHT){
		            		rey=(char) arreglo1[i-1];	
		            	}
		            	if(reina==UP) {
		            		reina=(char) arreglo1[j+7];
		            		reina=(char) arreglo1[j+1];
		            	}else if(reina==DOWN){
		            		reina=(char) arreglo1[j-7];
		            		reina=(char) arreglo1[j-1];
		            	}else if(reina==LEFT){
		            		reina=(char) arreglo1[i+7];
		            		reina=(char) arreglo1[i-1];	
		            	}else if(reina==RIGHT){
		            		reina=(char) arreglo1[i-7];	
		            		reina=(char) arreglo1[i+1];	
		            	}
		            	if(torre==UP) {
		            		torre=(char) arreglo1[j+7];
		            	}else if(torre==DOWN){
		            		torre=(char) arreglo1[j-7];
		            	}else if(torre==LEFT){
		            		torre=(char) arreglo1[i+7];	            		
		            	}else if(torre==RIGHT){
		            		torre=(char) arreglo1[i-7];	
		            	}
		            }
		         }    	
	    }
	    public void keyPressed() {
	    	  if(key=='w' || key==UP)
	    	    {
	    	     if(dir!=1)
	    	        dir=0;
	    	        
	    	    }
	    	  if(key=='s' || key==DOWN)
	    	    {
	    	      if(dir!=0)
	    	         dir=1;
	    	         
	    	    }
	    	  if(key=='a' || key==LEFT)
	    	    {
	    	     if(dir!=3)
	    	        dir=2; 
	    	        
	    	    } 
	    	  if(key=='d' || key==RIGHT)
	    	    {
	    	      if(dir!=2)
	    	         dir=3;
	    	    }
	    	  if(key=='j')
	    	    {
	    	      if(dir!=4)
	    	         dir=4;
	    	    }
	    }
}