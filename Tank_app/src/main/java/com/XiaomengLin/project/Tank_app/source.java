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
class MyTank extends Tank{//自己的坦克
	public MyTank(int X,int Y){
		super(X,Y);
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

class zidan{
	int x;
	int y;
	public zidan(int x,int y){
		this.x=x;
		this.y=y;
	}
}

 