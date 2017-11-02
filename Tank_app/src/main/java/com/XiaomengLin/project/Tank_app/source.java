package com.XiaomengLin.project.Tank_app;

/**
 * Tank_app--source
 *Author:XiaomengLin
 *Since:2017/10/31
 */
class Tank{
	int X=0;int Y=0;
	int fangxiang=0;
	int sudu=1;
	public void setX(int X){
		this.X=X;
	}
	
	public int getX(){
		return X;
	}
	
	public void setY(int Y){
		this.Y=Y;
	}
	
	public int getY(){
		return Y;
	}
	
	public void setfangxiang(int fangxiang){
		this.fangxiang=fangxiang;
	}
	
	public int getfangxiang(){
		return fangxiang;
	}
	
	public void setsudu(int sudu){
		this.sudu=sudu;
	}
	
	public int getsudu(int sudu){
		return sudu;
	}
	public Tank(int X,int Y){
		this.X=X;
		this.Y=Y;
	}
}
class MyTank extends Tank {//自己的坦克
	zidan zd=null;
	
	public MyTank(int X,int Y){
		super(X,Y);
	}
	
	public void fszd(){//发射子弹
		switch(this.fangxiang){
		case 0:
			zd=new zidan(X+10,Y,0);
			break;
		case 1:
			zd=new zidan(X,Y+10,1);
			break;
		case 2:
			zd=new zidan(X+10,Y+30,2);
			break;
		case 3:
			zd=new zidan(X+30,Y+10,3);
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

class DiTank extends Tank{//敌人坦克
	public DiTank(int x,int y){
		super(x,y);
	}
}

class zidan implements Runnable{
	int x;
	int y;
	int fangxiang;
	int sudu=2;
	public zidan(int x,int y,int fangxiang){
		this.x=x;
		this.y=y;
		this.fangxiang=fangxiang;
	}
	public void run() {
		// TODO Auto-generated method stub
		while(true){//凡是线程下面的死循环都要有个睡眠
			try{
				Thread.sleep(50);
			}
			catch(Exception e) {}
			
			switch(fangxiang){
			
			case 0:
				y-=sudu;
				break;
			case 1:
				x-=sudu;
				break;
			case 2:
				y+=sudu;
				break;
			case 3:
				x+=sudu;
			}
		}
	}
}

 
