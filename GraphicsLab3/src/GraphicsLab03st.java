// GraphicsLab03st.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 
																

public class GraphicsLab03st extends Applet
{
	
	public void paint(Graphics g) 	
	{
		// Draw Grid
		g.drawRect(10,10,780,580);
		g.drawLine(400,10,400,590);
		g.drawLine(10,300,790,300);
		
		Random rnd = new Random(1234);
		
		// Draw Random Lines
		Random rndInt = new Random (12345);
		for (int k = 1; k <= 100; k++)
		{
			int blue = rndInt.nextInt(256);
			int red = rndInt.nextInt(256);
			int green = rndInt.nextInt(256);
			int x1 = rndInt.nextInt(390)+10;
			int y1 = rndInt.nextInt(290)+10;
			int x2 = rndInt.nextInt(390)+10;
			int y2 = rndInt.nextInt(290)+10;
			g.setColor(new Color(red,blue,green));
			g.drawLine(x1, y1, x2, y2);
		}
		// Draw Random Squares
		Random rndInt1 = new Random (12345);
		for (int k = 1; k <=100; k++)
		{
			int x = rndInt.nextInt(340)+400;
			int y = rndInt.nextInt(240)+10;
			int blue = rndInt.nextInt(256);
			int red = rndInt.nextInt(256);
			int green = rndInt.nextInt(256);
			g.setColor(new Color(red,blue,green));
			g.fillRect(x, y, 50, 50);
		}
		// Draw Random Circles
		Random rndInt2 = new Random (12345);
		for (int k = 1; k <= 100; k++)
		{
			int blue = rndInt.nextInt(256);
			int red = rndInt.nextInt(256);
			int green = rndInt.nextInt(256);
			int width = rndInt.nextInt(200);
			int height = width;
			int x = rndInt.nextInt(390-width)+10;
			int y = rndInt.nextInt(290-width)+300;
			g.setColor(new Color(red,blue,green));
			g.drawOval(x, y, width, height);
		}
		// Draw 3-D Box
		//g.setColor(Color.red);
		//Polygon left = new Polygon ();
		//left.addPoint(475,350);
		//left.addPoint(475,425);
		//left.addPoint(525,475);
		//left.addPoint(525,400);
		//g.setColor(Color.green);
		//g.fillPolygon(left);
		//g.drawPolygon(left);
		//g.setColor(Color.blue);
		//int x = 475;
		//int y = 350;
		//g.setColor(Color.yellow);
		//g.fillRect(x, y, 75, 75);
	
	}
		
}



    
 