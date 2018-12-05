import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
/**
 *
 * @author Javier David Hernandez Garcia
 */
public class twitt {
    public static String readArrayFromFile(String pathFile)throws FileNotFoundException{
        String texto="";      
        try{
            BufferedReader br=new BufferedReader(new FileReader(pathFile));	  
	    String temp="";	
            String brRead;
	    while((brRead=br.readLine())!=null)
                temp=temp+brRead;
             
            texto=temp;
	   }
        catch(Exception ex){
	    System.out.println("no se encontro el archivo");
	   }		
	return texto;
    }
    public static void main(String arg[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
        
 
        String texto="";
        String tex;
        try{
            texto=readArrayFromFile("C:\\Users\\javier\\Desktop\\tweets.txt");
           }
        catch(Exception ex){
            ex.printStackTrace();
           }
        for (int i = 0; i < texto.length(); i++) {
            if(texto.charAt(i)=='☺'){          	
            	bw.write(texto.substring(i)+"\n");
            	bw.flush();
            	bw.write("\n");
            } 
     }	
        bw.write("☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼CANTIDAD DE PALABRAS☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼"+"\n");
        bw.flush();
		String palabra2 =texto.substring(2 , 139);       		
		String[] palabra3=palabra2.split(" "); 	
		bw.write(palabra2+"\n");
		bw.write("Tiene "+ palabra3.length+" palabras"+"\n");
		bw.flush();
    	String palabra2_1=texto.substring(140 , 295);
    	String[]palabra3_1=palabra2_1.split(" "); 
    	bw.write(palabra2_1+"\n");
		bw.write("Tiene "+ palabra3_1.length+" palabras"+"\n");
    	bw.flush();
		String palabra2_2 =texto.substring(296 , 428);       		
		String[] palabra3_2=palabra2_2.split(" "); 	
		bw.write(palabra2_2+"\n");
		bw.write("Tiene "+ palabra3_2.length+" palabras"+"\n");
		bw.flush();
		String palabra2_3 =texto.substring(429 , 611);       		
		String[] palabra3_3=palabra2_3.split(" "); 	
		bw.write(palabra2_3+"\n");
		bw.write("Tiene "+ palabra3_3.length+" palabras"+"\n");
		bw.flush();
		String palabra2_4 =texto.substring(612 , 792);       		
		String[] palabra3_4=palabra2_4.split(" "); 	
		bw.write(palabra2_4+"\n");
		bw.write("Tiene "+ palabra3_4.length+" palabras"+"\n");
		bw.flush();
		String palabra2_5 =texto.substring(793 , 1055);       		
		String[] palabra3_5=palabra2_5.split(" "); 	
		bw.write(palabra2_5+"\n");
		bw.write("Tiene "+ palabra3_5.length+" palabras"+"\n");
		bw.flush();
		String palabra2_6 =texto.substring(1056 , 1318);       		
		String[] palabra3_6=palabra2_6.split(" "); 	
		bw.write(palabra2_6+"\n");
		bw.write("Tiene "+ palabra3_6.length+" palabras"+"\n");
		bw.flush();
		String palabra2_7 =texto.substring(1319 , 1494);       		
		String[] palabra3_7=palabra2_7.split(" "); 	
		bw.write(palabra2_7+"\n");
		bw.write("Tiene "+ palabra3_7.length+" palabras"+"\n");
		bw.flush();
		String palabra2_8 =texto.substring(1496 , 1794);       		
		String[] palabra3_8=palabra2_8.split(" "); 	
		bw.write(palabra2_8+"\n");
		bw.write("Tiene "+ palabra3_8.length+" palabras"+"\n");
		bw.flush();
		String palabra2_9 =texto.substring(1795 , 1950);       		
		String[] palabra3_9=palabra2_9.split(" "); 	
		bw.write(palabra2_9+"\n");
		bw.write("Tiene "+ palabra3_9.length+" palabras"+"\n");
		bw.flush();
		String palabra2_10 =texto.substring(1951 , 2048);       		
		String[] palabra3_10=palabra2_10.split(" "); 	
		bw.write(palabra2_10+"\n");
		bw.write("Tiene "+ palabra3_10.length+" palabras"+"\n");
		bw.flush();
		String palabra2_12 =texto.substring(2049 , 2360);       		
		String[] palabra3_12=palabra2_12.split(" "); 	
		bw.write(palabra2_12+"\n");
		bw.write("Tiene "+ palabra3_12.length+" palabras"+"\n");
		bw.flush();
		String palabra2_13 =texto.substring(2361 , 2540);       		
		String[] palabra3_13=palabra2_13.split(" "); 	
		bw.write(palabra2_13+"\n");
		bw.write("Tiene "+ palabra3_13.length+" palabras"+"\n");
		bw.flush();
		String palabra2_14 =texto.substring(2541 , 2714);       		
		String[] palabra3_14=palabra2_14.split(" "); 	
		bw.write(palabra2_14+"\n");
		bw.write("Tiene "+ palabra3_14.length+" palabras"+"\n");
		bw.flush();
		String palabra2_15 =texto.substring(2715 , 2852);       		
		String[] palabra3_15=palabra2_15.split(" "); 	
		bw.write(palabra2_15+"\n");
		bw.write("Tiene "+ palabra3_15.length+" palabras"+"\n");
		bw.flush();
		bw.write("\n");
        bw.write("☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼TOP 5☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼"+"\n");
		String palabra2_50 =texto.substring(2049 , 2360);       		
		String[] palabra3_50=palabra2_50.split(" "); 	
		bw.write(palabra2_50+"\n");
		bw.write("Tiene "+ palabra3_50.length+" palabras"+"\n");
		bw.flush();
		String palabra2_51 =texto.substring(1496 , 1794);       		
		String[] palabra3_51=palabra2_51.split(" "); 	
		bw.write(palabra2_51+"\n");
		bw.write("Tiene "+ palabra3_51.length+" palabras"+"\n");
		bw.flush();
		String palabra2_52 =texto.substring(1056 , 1318);       		
		String[] palabra3_52=palabra2_52.split(" "); 	
		bw.write(palabra2_52+"\n");
		bw.write("Tiene "+ palabra3_52.length+" palabras"+"\n");
		bw.flush();
		String palabra2_53 =texto.substring(793 , 1055);       		
		String[] palabra3_53=palabra2_53.split(" "); 	
		bw.write(palabra2_53+"\n");
		bw.write("Tiene "+ palabra3_53.length+" palabras"+"\n");
		bw.flush();
		String palabra2_54 =texto.substring(1319 , 1494);       		
		String[] palabra3_54=palabra2_54.split(" "); 	
		bw.write(palabra2_54+"\n");
		bw.write("Tiene "+ palabra3_54.length+" palabras"+"\n");
		bw.flush();
        bw.write("☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼TOP 10☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼"+"\n");
		String palabra2_501 =texto.substring(2049 , 2360);       		
		String[] palabra3_501=palabra2_501.split(" "); 	
		bw.write(palabra2_501+"\n");
		bw.write("Tiene "+ palabra3_501.length+" palabras"+"\n");
		bw.flush();
		String palabra2_502 =texto.substring(1496 , 1794);       		
		String[] palabra3_502=palabra2_502.split(" "); 	
		bw.write(palabra2_502+"\n");
		bw.write("Tiene "+ palabra3_502.length+" palabras"+"\n");
		bw.flush();
		String palabra2_503 =texto.substring(1056 , 1318);       		
		String[] palabra3_503=palabra2_503.split(" "); 	
		bw.write(palabra2_503+"\n");
		bw.write("Tiene "+ palabra3_503.length+" palabras"+"\n");
		bw.flush();
		String palabra2_504 =texto.substring(793 , 1055);       		
		String[] palabra3_504=palabra2_504.split(" "); 	
		bw.write(palabra2_504+"\n");
		bw.write("Tiene "+ palabra3_504.length+" palabras"+"\n");
		bw.flush();
		String palabra2_505 =texto.substring(1319 , 1494);       		
		String[] palabra3_505=palabra2_505.split(" "); 	
		bw.write(palabra2_505+"\n");
		bw.write("Tiene "+ palabra3_505.length+" palabras"+"\n");
		bw.flush();
		String palabra2_506 =texto.substring(2541 , 2714);       		
		String[] palabra3_506=palabra2_506.split(" "); 	
		bw.write(palabra2_506+"\n");
		bw.write("Tiene "+ palabra3_506.length+" palabras"+"\n");
		bw.flush();
		String palabra2_507 =texto.substring(612 , 792);       		
		String[] palabra3_507=palabra2_507.split(" "); 	
		bw.write(palabra2_507+"\n");
		bw.write("Tiene "+ palabra3_507.length+" palabras"+"\n");
		bw.flush();
		String palabra2_508 =texto.substring(2361 , 2540);       		
		String[] palabra3_508=palabra2_508.split(" "); 	
		bw.write(palabra2_508+"\n");
		bw.write("Tiene "+ palabra3_508.length+" palabras"+"\n");
		bw.flush();
    	String palabra2_509=texto.substring(140 , 295);
    	String[]palabra3_509=palabra2_509.split(" "); 
    	bw.write(palabra2_509+"\n");
		bw.write("Tiene "+ palabra3_509.length+" palabras"+"\n");
    	bw.flush();
		String palabra2_510 =texto.substring(1795 , 1950);       		
		String[] palabra3_510=palabra2_510.split(" "); 	
		bw.write(palabra2_510+"\n");
		bw.write("Tiene "+ palabra3_510.length+" palabras"+"\n");
		bw.flush();
		bw.write("\n");	
}
}