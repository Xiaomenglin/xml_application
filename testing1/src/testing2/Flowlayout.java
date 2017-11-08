package testing2;
import java.awt.*;
import javax.swing.*;

public class Flowlayout extends JFrame {
		Button[] an={null,null,null,null,null,null,null,null};
	public static void main(String[] args){
		Flowlayout  fl=new Flowlayout();
	}
	public Flowlayout() {
		// TODO Auto-generated constructor stub
		an[0]=new Button("话梅1");
		an[1]=new Button("话梅2");
		an[2]=new Button("话梅3");
		an[3]=new Button("话梅4");
		an[4]=new Button("话梅5");
		an[5]=new Button("话梅6");
		an[6]=new Button("话梅7");
		an[7]=new Button("话梅8");
		
		//this.setLayout(new FlowLayout());
		//this.setLayout(new FlowLayout(FlowLayout.LEFT));//向左对齐
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));//向右对齐
		
		this.add(an[0]);
		this.add(an[1]);
		this.add(an[2]);
		this.add(an[3]);
		this.add(an[4]);
		this.add(an[5]);
		this.add(an[6]);
		this.add(an[7]);
		
		this.setTitle("流式布局管理器FlowLayout");
		this.setSize(320, 210);
		this.setLocation(450, 280);
		this.setResizable(false);//不能改变窗体大小
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}
