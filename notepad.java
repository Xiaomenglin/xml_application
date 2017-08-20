package mapping_and_event;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class notepad extends JFrame implements ActionListener{
	JMenuBar mbar;
	JMenu menu1,menu2;
	JMenuItem option1,option2;
	JScrollPane gdt;
	JTextArea wby;
	public static void main(String[] args){
		notepad n=new notepad();
	}
	public notepad() {
		mbar=new JMenuBar();
		menu1=new JMenu("�ļ���F��");
		menu1.setMnemonic('F');
		menu2=new JMenu("�ļ���E��");
		menu2.setMnemonic('E');
		
		option1=new JMenuItem("��");
		option1.addActionListener(this);
		option1.setActionCommand("open");
		
		option2=new JMenuItem("����");
		option2.addActionListener(this);
		option2.setActionCommand("save");
		
		
		wby=new JTextArea();
		gdt=new JScrollPane(wby);
		
		menu1.add(option1);  menu1.add(option2);
		
		mbar.add(menu1); mbar.add(menu2);
		
		this.setJMenuBar(mbar); this.add(gdt);
		
		this.setTitle("���±�");
		this.setSize(800,600);
		this.setLocation(150, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("open")){//���ļ�
			//System.out.println("��");
			JFileChooser wjxz=new JFileChooser();
			wjxz.setDialogTitle("�ļ���");
			wjxz.showOpenDialog(null);
			wjxz.setVisible(true);
			
			String wjlj=wjxz.getSelectedFile().getAbsolutePath();
			//��һ���ǵõ��û������ȫ·��
			FileReader wjl=null; BufferedReader hcl=null;
			try{
				wjl=new FileReader(wjlj);
				hcl=new BufferedReader(wjl);
				String s="",zfc="";
				while((s=hcl.readLine())!=null){
					zfc+=(s+"\n");
				}
				wby.setText(zfc);
			}
			catch(Exception aa){}
			finally{
				try{
					wjl.close();
					hcl.close();
				}catch(Exception ss){}
			}
			
		}
		else if(e.getActionCommand().equals("save")){
			//System.out.println("����");
			JFileChooser ljxz=new JFileChooser();
			ljxz.setDialogTitle("���Ϊ");
			ljxz.showSaveDialog(null);
			ljxz.setVisible(true);
			
			String bclj=ljxz.getSelectedFile().getAbsolutePath();
			try{
				PrintStream p1=new PrintStream(bclj);
				System.setOut(p1);
				System.out.println(this.wby.getText());
			}catch(Exception ss){}
		
			
			
		}
		// TODO Auto-generated method stub
		
	}

}


