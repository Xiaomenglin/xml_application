package testing2;
import java.awt.*;
import javax.swing.*;
public class Jframe1 extends JFrame {
		JButton an1=null;
	public Jframe1() {
		// TODO Auto-generated constructor stub
		this.setTitle("�û�����");//�������
		this.setSize(350, 200);//���ô�С��λ��
		this.setLocation(480, 230);//���ô��ڵ�λ��
		an1=new JButton("��¼");//�������
		this.add(an1);//������
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رս���
		this.setVisible(true);
	}
	public static void main(String[] args){
		Jframe1 jfm=new Jframe1();
	}

}

