import java.awt.*;
import javax.swing.*;
public class Chat extends JFrame{
	JTextArea wby;
	JPanel mb;
	JComboBox box;
	JButton an;
	JTextField wbk;
	JScrollPane gd;
	public static void main(String[] args){
		Chat c=new Chat();
	}
	
	public Chat() {
		// TODO Auto-generated constructor stub
		wby=new JTextArea();
		mb=new JPanel();
		String[] lt={"��ɮ","�����","�˽�","ɳ����"};
		box=new JComboBox(lt);
		wbk=new JTextField(10);
		an=new JButton("����");
		gd=new JScrollPane(wby);
		
		mb.add(box); mb.add(wbk); mb.add(an);
		this.add(gd); this.add(mb,BorderLayout.SOUTH);
		
		this.setTitle("���촰��");
		this.setSize(530, 350);
		this.setIconImage((new ImageIcon("image/qq.jpg")).getImage());
		this.setLocation(550, 300);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}


}
