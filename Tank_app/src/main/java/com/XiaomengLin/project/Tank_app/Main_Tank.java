package com.XiaomengLin.project.Tank_app;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * Tank_app
 *Author:XiaomengLin
 *Since:2017/09/03
 */
public class Main_Tank extends JFrame{
	MyPanel myPanel=null;
	
	
	
    public static void main( String[] args )//主函数
    {
    	Main_Tank tank1=new Main_Tank();
    }
    public Main_Tank(){
    	myPanel=new MyPanel();//主面板
    	this.add(myPanel);
    	this.addKeyListener(myPanel);
    	
    	Thread t=new Thread(myPanel);//###重点启动线程
		t.start();
    	
    	this.setSize(400, 300);
    	this.setLocation(300, 280);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
    }
}

