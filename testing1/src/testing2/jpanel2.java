package testing2;
import java.awt.*;
import javax.swing.*;

public class jpanel2 extends JFrame {
	JPanel mb1,mb2;
	JButton an1,an2,an3,an4,an5;
	public static void main(String[] args){
		jpanel2 jp=new jpanel2();
	}
	public jpanel2() {
		// TODO Auto-generated constructor stub
		mb1=new JPanel();
		mb2=new JPanel();
		
		an1=new JButton("����");
		an2=new JButton("����");
		an3=new JButton("��Ȫˮ");
		an4=new JButton("ơ��");
		an5=new JButton("����");
		
		mb1.add(an1);
		mb1.add(an2);
		mb2.add(an3);
		mb2.add(an4);
		
		this.add(mb1,BorderLayout.SOUTH);
		this.add(mb2,BorderLayout.NORTH);
		this.add(an5);
		
		this.setTitle("ʹ�����ı߽粼�ֹ�����");
		this.setSize(280, 200);
		this.setLocation(490, 290);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
