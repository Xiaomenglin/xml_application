package testing2;
import java.awt.*;
import javax.swing.*;
public class Jbutton extends JFrame {
		Button an1,an2,an3,an4,an5;
	public static void main(String[] args){
		Jbutton but=new Jbutton();
	}
		
		
	public Jbutton() {
		// TODO Auto-generated constructor stub
		an1=new Button("东");
		an2=new Button("西");
		an3=new Button("南");
		an4=new Button("北");
		an5=new Button("中");
		
		this.add(an1, BorderLayout.EAST);
		this.add(an2, BorderLayout.WEST);
		this.add(an3, BorderLayout.SOUTH);
		this.add(an4, BorderLayout.NORTH);
		this.add(an5, BorderLayout.CENTER);
		
		this.setTitle("边界布局管理器BorderLayout");
		this.setSize(320,220);
		this.setLocation(450, 260);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
/*
 * 总结：
 * 		1、继承JFrame类
 * 		2、在最上方定义组件
 * 		3、在构造方法中创建组件
 * 		4、在构造方法中添加组件
 * 		5、设置窗体属性
 * 		6、显示窗体
 * 		7、在主函数中创建对象
 * */