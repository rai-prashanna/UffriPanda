package trail;

import java.awt.Image;
import java.awt.Rectangle;
//import trail.Dude.java;
import javax.swing.*;

public class step {
	Dude ds;

	int j,rnum,enemydx,enemydxflag;
	int[] x= new int[10];
	int[] y= new int[10];
	Image[] bamboo = new Image[10];
	Image bstep;
        Image enemy;
        int score;
	public step()
	{
		ImageIcon i = new ImageIcon("C:/bamboo.png");
		ImageIcon im= new ImageIcon("C:/basestep.png");
                ImageIcon imm= new ImageIcon("C:/percupine.png");
                enemy=imm.getImage();
		bstep=im.getImage();
		for(j=0 ; j<10 ; j++)
		{
		bamboo[j]=i.getImage();
		x[j]=(int)(Math.random()*380);
                rnum=5+((int)(Math.random()*4));
		y[j]=400-j*83;
		}
                enemydxflag=0;
                enemydx=0;
	}
        public void enemydxi()
        {
            if(enemydx==0)
                enemydxflag=0;
            if(enemydx==142)
                enemydxflag=1;
            if(enemydxflag==0)
                enemydx++;
            else
                enemydx--;
        }
	public void scrolldown()
	{
            
		for(j=0 ; j<10 ; j++)
		{
			y[j]++;
			if(y[j]>700)
			{
				y[j]-=850;
				x[j]=(int)(Math.random()*380);
			}
		}
		score++;
	}
		public void scrollup()
		{
                    for(j=0 ; j<10 ; j++)
			{
				y[j]--;
				
			}
		}
	 public int []getX() {
         return x;
 }
 public int getrnum()
 {
     return rnum;
 }
 public Image getenemy()
 {
     return enemy;
 }
	

 public int []getY() {
         return y;
 }

 public Image []getImage() {
     return bamboo;
}
 public Image getImg() {
     return bstep;
}
public Rectangle getba1() {
	 return new Rectangle(x[0],y[0], 180, 16);
}
public Rectangle getba2() {
	 return new Rectangle(x[1],y[1], 180, 16);
}
public Rectangle getba3() {
	 return new Rectangle(x[2],y[2], 180, 16);
}
public Rectangle getba4() {
	 return new Rectangle(x[3],y[3], 180, 16);
}
public Rectangle getba5() {
	 return new Rectangle(x[4],y[4], 180, 16);
}
public Rectangle getba6() {
	 return new Rectangle(x[5],y[5], 180, 16);
}
public Rectangle getba7() {
	 return new Rectangle(x[6],y[6], 180, 16);
}
public Rectangle getba8() {
	 return new Rectangle(x[7],y[7], 180, 16);
}
public Rectangle getba9() {
	 return new Rectangle(x[8],y[8], 180, 16);
}
public Rectangle getba10() {
	 return new Rectangle(x[9],y[9], 180, 16);
}
public Rectangle getenemyposition() {
	 return new Rectangle(x[rnum]+enemydx+8,y[rnum]-38+7, 44, 28);
}
public Rectangle getbound() {
	 return new Rectangle(0,y[0]+100, 480, 140);
}
}
