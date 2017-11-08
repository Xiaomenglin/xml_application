package com.XiaomengLin.project.Tank_app;

import java.lang.Thread;

/**
 * Tank_app--Tank
 *Author:XiaomengLin
 *Since:2017/10/31
 */
class Tank{//坦克类
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




 
