import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
public class NewChatW extends JFrame {
	JLabel bq1;
	JButton an1,an2,an3; JPanel mb1;
	JTabbedPane xxk;
	JPanel mb2,mb3,mb4;
	JLabel bq2,bq3,bq4,bq5;
	JTextField wbk;
	JPasswordField mmk;
	JButton an4;
	JCheckBox fxk1,fxk2;
	public static void main(String[] args){
		NewChatW cw=new NewChatW();
	}
	
	
	public NewChatW() {
		// TODO Auto-generated constructor stub
		bq2=new JLabel("QQ����",JLabel.CENTER);
		bq3=new JLabel("QQ����",JLabel.CENTER);
		bq4=new JLabel("��������",JLabel.CENTER);
		bq4.setFont(new Font("����",Font.PLAIN,16));
		bq4.setForeground(Color.BLUE);
		bq5=new JLabel("<html><a href='password.qq.com'>�������뱣��</a>");
		bq5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//���ù������
		
		wbk=new JTextField();
		mmk=new JPasswordField();
		an4=new JButton("�������");
		
		fxk1=new JCheckBox("�����¼");
		fxk2=new JCheckBox("��ס����");
		
		bq1=new JLabel(new ImageIcon("image/qqbackgound.jpg"));
		mb1=new JPanel();
		an1=new JButton("��¼");//��������ͼƬ
		an2=new JButton("ȡ��");
		an3=new JButton("��");
		
		xxk=new JTabbedPane();
		mb2=new JPanel(); 
		mb3=new JPanel();
		mb3.setBackground(Color.BLUE);
		mb4=new JPanel();
		mb4.setBackground(Color.GREEN);
		
		xxk.add("��ͨ��¼", mb2);  xxk.addTab("QQ��Ա", mb3); xxk.add("����Ա", mb4);
		
		mb2.setLayout(new GridLayout(3,3));
		
		mb1.add(an1); mb1.add(an2); mb1.add(an3);
		mb2.add(bq2); mb2.add(wbk); mb2.add(an4); mb2.add(bq3); mb2.add(mmk);
		mb2.add(bq4); mb2.add(fxk1); mb2.add(fxk2); mb2.add(bq5);
		
		this.add(mb1,BorderLayout.SOUTH);
		this.add(bq1, BorderLayout.NORTH);
		this.add(xxk, BorderLayout.CENTER);
		
		this.setIconImage((new ImageIcon("image/qq.jpg")).getImage());//���Ͻ�ͼ��
		this.setTitle("�û���¼");
		this.setSize(510, 330);
		this.setLocation(530, 320);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
	}

}
