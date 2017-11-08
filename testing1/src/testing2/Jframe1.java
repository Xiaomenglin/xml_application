package testing2;
import java.awt.*;
import javax.swing.*;
public class Jframe1 extends JFrame {
		JButton an1=null;
	public Jframe1() {
		// TODO Auto-generated constructor stub
		this.setTitle("用户界面");//定义标题
		this.setSize(350, 200);//设置大小和位置
		this.setLocation(480, 230);//设置窗口的位置
		an1=new JButton("登录");//设置组件
		this.add(an1);//添加组件
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭进程
		this.setVisible(true);
	}
	public static void main(String[] args){
		Jframe1 jfm=new Jframe1();
	}

}

