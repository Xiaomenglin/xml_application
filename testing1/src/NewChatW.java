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
		bq2=new JLabel("QQ号码",JLabel.CENTER);
		bq3=new JLabel("QQ密码",JLabel.CENTER);
		bq4=new JLabel("忘记密码",JLabel.CENTER);
		bq4.setFont(new Font("宋体",Font.PLAIN,16));
		bq4.setForeground(Color.BLUE);
		bq5=new JLabel("<html><a href='password.qq.com'>申请密码保护</a>");
		bq5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//设置光标类型
		
		wbk=new JTextField();
		mmk=new JPasswordField();
		an4=new JButton("清除号码");
		
		fxk1=new JCheckBox("隐身登录");
		fxk2=new JCheckBox("记住密码");
		
		bq1=new JLabel(new ImageIcon("image/qqbackgound.jpg"));
		mb1=new JPanel();
		an1=new JButton("登录");//可以设置图片
		an2=new JButton("取消");
		an3=new JButton("向导");
		
		xxk=new JTabbedPane();
		mb2=new JPanel(); 
		mb3=new JPanel();
		mb3.setBackground(Color.BLUE);
		mb4=new JPanel();
		mb4.setBackground(Color.GREEN);
		
		xxk.add("普通登录", mb2);  xxk.addTab("QQ会员", mb3); xxk.add("管理员", mb4);
		
		mb2.setLayout(new GridLayout(3,3));
		
		mb1.add(an1); mb1.add(an2); mb1.add(an3);
		mb2.add(bq2); mb2.add(wbk); mb2.add(an4); mb2.add(bq3); mb2.add(mmk);
		mb2.add(bq4); mb2.add(fxk1); mb2.add(fxk2); mb2.add(bq5);
		
		this.add(mb1,BorderLayout.SOUTH);
		this.add(bq1, BorderLayout.NORTH);
		this.add(xxk, BorderLayout.CENTER);
		
		this.setIconImage((new ImageIcon("image/qq.jpg")).getImage());//左上角图标
		this.setTitle("用户登录");
		this.setSize(510, 330);
		this.setLocation(530, 320);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
	}

}
