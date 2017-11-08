package com.XiaomengLin.project.Tank_app;

/**
 * Tank_app--Zidan
 *Author:XiaomengLin
 *Since:2017/11/08
 */
class Zidan implements Runnable{//子弹类
	int x;
	int y;
	int fangxiang;
	int sudu=2;
	boolean shengming=true;
	
	public Zidan(int x,int y,int fangxiang){
		this.x=x;
		this.y=y;
		this.fangxiang=fangxiang;
	}
	public void run() {
		// TODO Auto-generated method stub
		while(true){//凡是线程下面的死循环里都要有个睡眠
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
				break;
			}
			if(x<0||x>400||y<0||y>300){
				this.shengming=false;
				break;
			}
		}
	}
}