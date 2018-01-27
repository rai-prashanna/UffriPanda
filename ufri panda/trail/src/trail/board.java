package trail;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
 
public class board extends JPanel implements ActionListener {
        private static final long serialVersionUID = 1L;
		Dude p;
		step q;
        public Image img;
        public Image img1;
        public Image wel;
        Timer time;
        int check=0;
        int flag;
        int flag1=1;
        int endingflag=0;
        public board() {
        	
                p = new Dude();
                q= new step();   
                addKeyListener(new AL());
                setFocusable(true);
                ImageIcon i = new ImageIcon("C:/background.png");
                ImageIcon ij = new ImageIcon("C:/endingpanda.png");
                ImageIcon ijk=new ImageIcon("C:/panda-ufree.png");
                wel=ijk.getImage();
                img = i.getImage();
                img1 = ij.getImage();
                time = new Timer(5, this);
                time.start();
                flag=1;
        }
 
        public void actionPerformed(ActionEvent e) {
        if(p.m>-1)
        {
                q.enemydxi();
                if(p.y<300 && p.m!=0)
                {
                	p.y++;
                q.scrolldown();
                }
                else if(p.y>500)
                {
                	q.scrollup();
                	p.y--;
                }
                p.move();
                checkCollisions();
        }
                repaint();
        
        }
        public void checkCollisions()
        {
        		Rectangle rbstep=q.getbound();
        		Rectangle r2=p.getBounds();
                Rectangle r3=p.getBounds1();
                Rectangle rstep1=q.getba1();
                Rectangle enemyposition=q.getenemyposition(); 	
        	if (check==0 && p.n==1 && (rbstep.intersects(r2)))
            {
            	p.m=130;
            }
               if (p.n==1 && (rstep1.intersects(r2)))
                {
            	   p.score+=100;
                	p.m=130;
                }
              Rectangle rstep2=q.getba2();
       		
               if (p.n==1 && (rstep2.intersects(r2)))
                {
            	   p.score+=100;
                	p.m=130;
                }	
                  Rectangle rstep3=q.getba3();
       		
               if (p.n==1 && (rstep3.intersects(r2)))
                {
            	   check=1;
            
                	p.m=130;
                }	
               Rectangle rstep4=q.getba4();
       		
               if (p.n==1 && (rstep4.intersects(r2)))
                {
            
                	p.m=130;
                }	
               Rectangle rstep5=q.getba5();
       		
               if (p.n==1 && (rstep5.intersects(r2)))
                {
                          	p.m=130;
                }	
               Rectangle rstep6=q.getba6();
       		
               if (p.n==1 && (rstep6.intersects(r2)))
                {
                            	p.m=130;
                }	
               Rectangle rstep7=q.getba7();
       		
               if (p.n==1 && (rstep7.intersects(r2)))
                {
            
                	p.m=130;
                }	
               Rectangle rstep8=q.getba8();
       		
               if (p.n==1 && (rstep8.intersects(r2)))
                {
                            	p.m=130;
                }	
               Rectangle rstep9=q.getba9();
       		
               if (p.n==1 && (rstep9.intersects(r2)))
                {
            
                	p.m=130;
                }	
               Rectangle rstep10=q.getba10();
       		
               if (p.n==1 && (rstep10.intersects(r2)))
                {
                	p.m=130;
                }	
        if (enemyposition.intersects(r3))
                {
                   endingflag=1;
                 }			
               

        }
 
        public void paint(Graphics g) {
                super.paint(g);
                Graphics2D g2d = (Graphics2D) g;
                	
                
                g2d.drawImage(img, 0, 0, null);
                flag = p.getflag();
                int[] x= new int[10];
            	int[] y= new int[10];
            	Image[] bamboo = new Image[10];
                int rnum=q.getrnum();
            	Image bstep;
            	x=q.x;
            	y=q.y;
            	bamboo=q.bamboo;
            	bstep=q.getImg();
                int z;
                for(z=0;z<10;z++)
                {
                	g2d.drawImage(bamboo[z], x[z], y[z], null);
                }
                g2d.drawImage(q.getenemy(),x[rnum]+p.getenemydx(),y[rnum]-36,null);
                if(check==0)
                g2d.drawImage(bstep, 0, y[0]+100, null);
                g2d.drawImage(p.getImage(), p.getX(), p.getY(), null);
                
                Font font = new Font("Arial", Font.BOLD, 24);
                
                g2d.setFont(font);
                g2d.drawString(String.valueOf(q.score), 200, 20);
                if(p.getflag()==2)
                    g2d.drawImage(img1, 0, 0, null); 
                if(endingflag==1)
                    g2d.drawImage(img1, 0, 0, null); 
                if(p.getwvisible())
                    g2d.drawImage(wel, 0, 0, null);  
        }
 
        private class AL extends KeyAdapter {
                public void keyReleased(KeyEvent e) {
                        p.keyReleased(e);
                }
 
                public void keyPressed(KeyEvent e) {
                        p.keyPressed(e);
                }
        }
}