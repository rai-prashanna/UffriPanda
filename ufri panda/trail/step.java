package trail;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.*;

public class step {

	int inc,j;
	int[] x= new int[10];
	int[] y= new int[10];
	Image[] bamboo = new Image[10];
	public step()
	{
		ImageIcon i = new ImageIcon("C:/bamboo.png");
		for(j=0 ; j<10 ; j++)
		{
		bamboo[j]=i.getImage();
		x[j]=(int)(Math.random()*380);
		y[j]=400-j*100;
		}
		inc=1;
	}
	public void scrolldown()
	{
		for(j=0 ; j<10 ; j++)
		{
			y[j]++;
			if(y[j]>800)
			{
				y[j]-=800;
				x[j]=(int)(Math.random()*380);
			}
		}
	}
		public void scrollup()
		{
			for(j=0 ; j<10 ; j++)
			{
				y[j]--;
				
			}
		}
	/*	public void check()
		{
		/*	for(j=0;j<10;j++)
			{
				/*if((ds.y+60)==y[j])
				{
					if((ds.x+28)>x[j] && (ds.x+28)<(x[j]+120))
					{
						ds.m=400;
						ds.move();
					}
				}
			}
		}*/
		 public Rectangle get()
	        {

	                return new Rectangle(x[0],y[0], 120, 16);

	        }
		 
	 public int []getX() {
         return x;
 }
	

 public int []getY() {
         return y;
 }

 public Image []getImage() {
         return bamboo;
 }
}
