package testing1;

import java.util.*;


public class fanxin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList<Sp> all=new ArrayList<Sp>();//通过泛型将类型丁下来
		Sp sp1=new Sp("apple",12,"001");
		all.add(sp1);
		Sp sp2=all.get(0);*/
		Bh<String> all=new Bh<String>("你好");
		all.lxmc();
	}

}
class Bh<L>{
	private L l;
	Bh(L l){
		this.l=l;
	}
	void lxmc(){
		System.out.println("类型是："+l.getClass().getName());
	}
}
class Sp{
	private String minCheng;
	private int jiaGe;
	private String bianHao;
	Sp(String minCheng,int jiaGe,String bianHao){
		this.minCheng=minCheng;
		this.jiaGe=jiaGe;
		this.bianHao=bianHao;
	}
	public void setMinCheng(String MinCheng){
		this.minCheng=MinCheng;
	}
	public String getMinCheng(){
		return this.minCheng;
	}
	public void setjiaGe(int jiaGe){
		this.jiaGe=jiaGe;
	}
	public int getjiaGe(){
		return this.jiaGe;
	}
	public void setbianHao(String bianHao){
		this.bianHao=bianHao;
	}
	public String getbianHao(){
		return this.bianHao;
	}
}
class Yl{
	private String bianHao;
	private String minCheng;
	private String yanSe;
	private float jiaGe;
	 Yl(String bianHao,String minCheng,String yanSe,float jiaGe){
		this.bianHao=bianHao;
		this.minCheng=minCheng;
		this.yanSe=yanSe;
		this.jiaGe=jiaGe;
	}
}
