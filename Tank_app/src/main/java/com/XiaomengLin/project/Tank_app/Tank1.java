package com.XiaomengLin.project.Tank_app;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Tank_app
 *Author:XiaomengLin
 *Since:2017/09/03
 */
public class Tank1 extends JFrame{
	MyPanel myPanel=null;
	
	
	
    public static void main( String[] args )
    {
        Tank1 tank1=new Tank1();
    }
    public Tank1(){
    	myPanel=new MyPanel();
    	this.add(myPanel);
    	this.addKeyListener(myPanel);
    	
    	this.setSize(400, 300);
    	this.setLocation(300, 280);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
    }
}
class MyPanel extends JPanel implements KeyListener{
	MyTank myTank=null;
	public MyPanel(){
		myTank=new MyTank(100,100);
	}
	public void paint(Graphics g){
		super.paint(g);
		g.fillRect(0, 0, 400, 300);
		this.drawTank(myTank.getX(), myTank.getY(), g, 3, 0);
//		g.setColor(Color.YELLOW);
//		g.fill3DRect(myTank.getX(), myTank.getY(), 5, 30, false);
//		g.fill3DRect(myTank.getX()+15, myTank.getY(), 5, 30, false);
//		g.fill3DRect(myTank.getX()+5, myTank.getY()+5, 10, 20, false);
//		g.fillOval(myTank.getX()+5, myTank.getY()+10, 10, 10);
//		g.drawLine(myTank.getX()+10, myTank.getY()+15, myTank.getX()+10, myTank.getY()-3);
	}
	
	public void drawTank(int x,int y,Graphics g,int fangxiang,int leixing){
		switch(leixing){
		case 0://我的坦克
			g.setColor(Color.YELLOW);
			break;
		case 1://敌人的坦克
			g.setColor(Color.GREEN);
			break;
		
		}
		switch(fangxiang){//坦克方向
		case 0://方向：上
			g.fill3DRect(x, y, 5, 30, false);
			g.fill3DRect(x+15, y, 5, 30, false);
			g.fill3DRect(x+5, y+5, 10, 20, false);
			g.fillOval(x+5, y+10, 10, 10);
			g.drawLine(x+10, y+15, x+10, y-3);
			break;
		case 1://方向：左
			g.fill3DRect(x, y, 30, 5, false);
			g.fill3DRect(x, y+15, 30, 5, false);
			g.fill3DRect(x+5, y+5, 20, 10, false);
			g.fillOval(x+10, y+5, 10, 10);
			g.drawLine(x+15, y+10, x-3, y+10);
			break;
		case 2://方向：下
			g.fill3DRect(x, y, 5, 30, false);
			g.fill3DRect(x+15, y, 5, 30, false);
			g.fill3DRect(x+5, y+5, 10, 20, false);
			g.fillOval(x+5, y+10, 10, 10);
			g.drawLine(x+10, y+15, x+10, y+33);
			break;
		case 3://方向：右
			g.fill3DRect(x, y, 30, 5, false);
			g.fill3DRect(x, y+15, 30, 5, false);
			g.fill3DRect(x+5, y+5, 20, 10, false);
			g.fillOval(x+10, y+5, 10, 10);
			g.drawLine(x+15, y+10, x+33, y+10);
			break;
			
		}
	}
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_W){
			this.myTank.setfangxiang(0);
			this.myTank.xiangshang();
		}else if(e.getKeyCode()==KeyEvent.VK_A){
			this.myTank.setfangxiang(1);
			this.myTank.xiangzuo();
		}else if(e.getKeyCode()==KeyEvent.VK_S){
			this.myTank.setfangxiang(2);
			this.myTank.xiangxia();
		}else if(e.getKeyCode()==KeyEvent.VK_D){
			this.myTank.setfangxiang(3);
			this.myTank.xiangyou();
		}
		
		this.repaint();
		
		
	}
}

