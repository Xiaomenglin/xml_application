package testing2;
import java.awt.*;
import javax.swing.*;

public class gridLayout extends JFrame {
		Button[] an={null,null,null,null,null,null,null,null,null};
		int s=9;
	public static void main(String[] args){
		gridLayout gl=new gridLayout();
	}
	public gridLayout() {
		// TODO Auto-generated constructor stub
		an[0]=new Button("7");
		an[1]=new Button("8");
		an[2]=new Button("9");
		an[3]=new Button("4");
		an[4]=new Button("5");
		an[5]=new Button("6");
		an[6]=new Button("1");
		an[7]=new Button("2");
		an[8]=new Button("3");
		
		this.setLayout(new GridLayout(3,3,15,15));
		
		for(int i=0;i<s;i++){
			this.add(an[i]);
		}
		this.setTitle("网格布局管理器GridLayout");
		this.setSize(320, 210);
		this.setLocation(490, 230);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
