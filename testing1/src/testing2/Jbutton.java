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
		an1=new Button("��");
		an2=new Button("��");
		an3=new Button("��");
		an4=new Button("��");
		an5=new Button("��");
		
		this.add(an1, BorderLayout.EAST);
		this.add(an2, BorderLayout.WEST);
		this.add(an3, BorderLayout.SOUTH);
		this.add(an4, BorderLayout.NORTH);
		this.add(an5, BorderLayout.CENTER);
		
		this.setTitle("�߽粼�ֹ�����BorderLayout");
		this.setSize(320,220);
		this.setLocation(450, 260);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
/*
 * �ܽ᣺
 * 		1���̳�JFrame��
 * 		2�������Ϸ��������
 * 		3���ڹ��췽���д������
 * 		4���ڹ��췽����������
 * 		5�����ô�������
 * 		6����ʾ����
 * 		7�����������д�������
 * */