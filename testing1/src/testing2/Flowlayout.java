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
		an[0]=new Button("��÷1");
		an[1]=new Button("��÷2");
		an[2]=new Button("��÷3");
		an[3]=new Button("��÷4");
		an[4]=new Button("��÷5");
		an[5]=new Button("��÷6");
		an[6]=new Button("��÷7");
		an[7]=new Button("��÷8");
		
		//this.setLayout(new FlowLayout());
		//this.setLayout(new FlowLayout(FlowLayout.LEFT));//�������
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));//���Ҷ���
		
		this.add(an[0]);
		this.add(an[1]);
		this.add(an[2]);
		this.add(an[3]);
		this.add(an[4]);
		this.add(an[5]);
		this.add(an[6]);
		this.add(an[7]);
		
		this.setTitle("��ʽ���ֹ�����FlowLayout");
		this.setSize(320, 210);
		this.setLocation(450, 280);
		this.setResizable(false);//���ܸı䴰���С
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}
