package testing3;
import java.awt.*;
import javax.swing.*;

public class userRegist extends JFrame{
	JPanel mb1,mb2,mb3;//面板
	JButton an1,an2;//按钮
	JLabel bq1,bq2;//标签，不能按动
	JCheckBox fxk1,fxk2,fxk3;//复选按钮
	JRadioButton dxk1,dxk2;//单选按钮
	ButtonGroup dxz;//单选组
	
	public static void main(String[] args){
		userRegist ur=new userRegist();
	}
	
	public userRegist() {
		// TODO Auto-generated constructor stub
		mb1=new JPanel();
		mb2=new JPanel();
		mb3=new JPanel();
		
		an1=new JButton("注册");
		an2=new JButton("取消");
		bq1=new JLabel("性别");
		bq2=new JLabel("爱好");
		dxk1=new JRadioButton("男");
		dxk2=new JRadioButton("女");
		fxk1=new JCheckBox("篮球");
		fxk2=new JCheckBox("足球");
		fxk3=new JCheckBox("羽毛球");
		
		dxz=new ButtonGroup();
		dxz.add(dxk1);dxz.add(dxk2);
		
		this.setLayout(new GridLayout(3,1));
		
		mb1.add(bq1);  mb1.add(dxk1);  mb1.add(dxk2);
		mb2.add(bq2);  mb2.add(fxk1);  mb2.add(fxk2);  mb3.add(fxk3);
		mb3.add(an1);  mb3.add(an2);
		
		this.add(mb1);
		this.add(mb2);
		this.add(mb3);
		
		this.setTitle("用户注册");
		this.setSize(280, 190);
		this.setLocation(480,230);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
