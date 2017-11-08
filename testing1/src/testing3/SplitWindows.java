package testing3;
import java.awt.*;
import javax.swing.*;

public class SplitWindows extends JFrame {
	JSplitPane sp;
	JLabel bq;
	JList lb;
	public static void main(String[] args){
		SplitWindows sw=new SplitWindows();
	}
	public SplitWindows() {
		// TODO Auto-generated constructor stub
		String[] kmk={"科目一","科目二","科目三","科目四","终极考试"};
		lb=new JList(kmk);
		
		bq=new JLabel(new ImageIcon("image/plane.jpg"));
		
		sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,lb,bq);
		sp.setOneTouchExpandable(true);
		
		this.add(sp);
		this.setTitle("驾照考试");
		this.setSize(960, 660);
		this.setLocation(30, 10);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}
