package com.XiaomengLin.project.Tank_app;

import java.util.Vector;

/**
 * Tank_app--MyTank
 *Author:XiaomengLin
 *Since:2017/11/08
 */
class MyTank extends Tank {//我的坦克类
	Vector<Zidan> aa=new Vector<Zidan>();//因为子弹是跟着坦克走的，所以子弹的功能大多跟坦克有关
	Zidan zd=null;
	
	public MyTank(int X,int Y){
		super(X,Y);
	}
	
	public void fszd(){//发射子弹
		switch(this.fangxiang){
		case 0:
			zd=new Zidan(X+10,Y,0);
			aa.add(zd);
			break;
		case 1:
			zd=new Zidan(X,Y+10,1);
			aa.add(zd);
			break;
		case 2:
			zd=new Zidan(X+10,Y+30,2);
			aa.add(zd);
			break;
		case 3:
			zd=new Zidan(X+30,Y+10,3);
			aa.add(zd);
			break;
		}
		Thread t=new Thread(zd);
		t.start();
	}
	
	public void xiangshang(){
		Y-=sudu;
	}
	
	public void xiangzuo(){
		X-=sudu;
	}
	
	public void xiangxia(){
		Y+=sudu;
	}
	
	public void xiangyou(){
		X+=sudu;
	}
}
