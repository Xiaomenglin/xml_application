import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NoteBook extends JFrame {
	JMenuBar cd;
	JMenu cd1,cd2,cd3,cd4,cd5;
	JMenuItem cdx2,cdx3,cdx4,cdx5,cdx6,cdx7;
	JMenu ej;   JMenuItem ej1,ej2;
	
	JToolBar gjt;
	JButton an1,an2,an3,an4,an5,an6;
	
	JTextArea wby;
	JScrollPane gdt;
	public static void main(String[] args){
		NoteBook nb=new NoteBook();
	}
	
	public NoteBook() {
		// TODO Auto-generated constructor stub
		gjt=new JToolBar();
		an1=new JButton("新建");
		an1.setToolTipText("新建");
		an2=new JButton("打开");
		an2.setToolTipText("打开");
		an3=new JButton("保存");
		an3.setToolTipText("保存");
		an4=new JButton("复制");
		an4.setToolTipText("复制");
		an5=new JButton("剪切");
		an5.setToolTipText("剪切");
		an6=new JButton("粘贴");
		an6.setToolTipText("粘贴");
		
		cd=new JMenuBar();
		cd1=new JMenu("文件(F)");
		cd1.setMnemonic('F');
		cd2=new JMenu("编辑(E)");
		cd2.setMnemonic('E');
		cd3=new JMenu("格式(O)");
		cd3.setMnemonic('O');
		cd4=new JMenu("查看(V)");
		cd4.setMnemonic('V');
		cd5=new JMenu("帮助(H)");
		cd5.setMnemonic('H');
		
		ej=new JMenu("新建");
		ej1=new JMenuItem("文件");
		ej2=new JMenuItem("模板");
		
		cdx2=new JMenuItem("打开");
		cdx3=new JMenuItem("保存(S)");
		cdx3.setMnemonic('S');
		cdx4=new JMenuItem("另存为");
		cdx5=new JMenuItem("页面设置");
		cdx6=new JMenuItem("打印");
		cdx7=new JMenuItem("退出");
		
		wby=new JTextArea();
		gdt=new JScrollPane(wby);
		
		gjt.add(an1);  gjt.add(an2);  gjt.add(an3);  
		gjt.add(an4);  gjt.add(an5);  gjt.add(an6);
		
		ej.add(ej1);   ej.add(ej2);
		
		cd1.add(ej);  cd1.add(cdx2);  cd1.add(cdx3);  cd1.add(cdx4);
		cd1.addSeparator();
		cd1.add(cdx5);  cd1.add(cdx6);
		cd1.addSeparator();
		cd1.add(cdx7);
		
		cd.add(cd1);  cd.add(cd2);  cd.add(cd3);
		cd.add(cd4);  cd.add(cd5);  
		
		this.setJMenuBar(cd);
		this.add(gjt,BorderLayout.NORTH);
		this.add(gdt);
		
		this.setIconImage((new ImageIcon("image/plan.jpg")).getImage());
		this.setTitle("记事本");
		this.setSize(800, 570);
		this.setLocation(150, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	
	}

}
