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
		an1=new JButton("�½�");
		an1.setToolTipText("�½�");
		an2=new JButton("��");
		an2.setToolTipText("��");
		an3=new JButton("����");
		an3.setToolTipText("����");
		an4=new JButton("����");
		an4.setToolTipText("����");
		an5=new JButton("����");
		an5.setToolTipText("����");
		an6=new JButton("ճ��");
		an6.setToolTipText("ճ��");
		
		cd=new JMenuBar();
		cd1=new JMenu("�ļ�(F)");
		cd1.setMnemonic('F');
		cd2=new JMenu("�༭(E)");
		cd2.setMnemonic('E');
		cd3=new JMenu("��ʽ(O)");
		cd3.setMnemonic('O');
		cd4=new JMenu("�鿴(V)");
		cd4.setMnemonic('V');
		cd5=new JMenu("����(H)");
		cd5.setMnemonic('H');
		
		ej=new JMenu("�½�");
		ej1=new JMenuItem("�ļ�");
		ej2=new JMenuItem("ģ��");
		
		cdx2=new JMenuItem("��");
		cdx3=new JMenuItem("����(S)");
		cdx3.setMnemonic('S');
		cdx4=new JMenuItem("���Ϊ");
		cdx5=new JMenuItem("ҳ������");
		cdx6=new JMenuItem("��ӡ");
		cdx7=new JMenuItem("�˳�");
		
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
		this.setTitle("���±�");
		this.setSize(800, 570);
		this.setLocation(150, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	
	}

}
