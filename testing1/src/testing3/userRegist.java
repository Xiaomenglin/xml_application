package testing3;
import java.awt.*;
import javax.swing.*;

public class userRegist extends JFrame{
	JPanel mb1,mb2,mb3;//���
	JButton an1,an2;//��ť
	JLabel bq1,bq2;//��ǩ�����ܰ���
	JCheckBox fxk1,fxk2,fxk3;//��ѡ��ť
	JRadioButton dxk1,dxk2;//��ѡ��ť
	ButtonGroup dxz;//��ѡ��
	
	public static void main(String[] args){
		userRegist ur=new userRegist();
	}
	
	public userRegist() {
		// TODO Auto-generated constructor stub
		mb1=new JPanel();
		mb2=new JPanel();
		mb3=new JPanel();
		
		an1=new JButton("ע��");
		an2=new JButton("ȡ��");
		bq1=new JLabel("�Ա�");
		bq2=new JLabel("����");
		dxk1=new JRadioButton("��");
		dxk2=new JRadioButton("Ů");
		fxk1=new JCheckBox("����");
		fxk2=new JCheckBox("����");
		fxk3=new JCheckBox("��ë��");
		
		dxz=new ButtonGroup();
		dxz.add(dxk1);dxz.add(dxk2);
		
		this.setLayout(new GridLayout(3,1));
		
		mb1.add(bq1);  mb1.add(dxk1);  mb1.add(dxk2);
		mb2.add(bq2);  mb2.add(fxk1);  mb2.add(fxk2);  mb3.add(fxk3);
		mb3.add(an1);  mb3.add(an2);
		
		this.add(mb1);
		this.add(mb2);
		this.add(mb3);
		
		this.setTitle("�û�ע��");
		this.setSize(280, 190);
		this.setLocation(480,230);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
