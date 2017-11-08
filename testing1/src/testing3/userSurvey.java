package testing3;
import java.awt.*;
import javax.swing.*;

public class userSurvey extends JFrame{
	JPanel mb1,mb2;
	JLabel bq1,bq2;
	JComboBox jgk;
	JList lb;
	JScrollPane gd;
	public static void main(String[] args){
		userSurvey as=new userSurvey();
	}
	public userSurvey() {
		// TODO Auto-generated constructor stub
		mb1=new JPanel();
		mb2=new JPanel();
		
		bq1=new JLabel("籍贯");
		bq2=new JLabel("学历");
		
		String[] jg={"北京","上海","广州","深圳"};
		jgk=new JComboBox(jg);
		
		String[] xl={"高中","大专","本科","硕士","博士"};
		lb=new JList(xl);
		lb.setVisibleRowCount(3);
		gd=new JScrollPane(lb);
		
		this.setLayout(new GridLayout(2,1));
		
		mb1.add(bq1);  mb1.add(jgk);
		mb2.add(bq2);  mb2.add(gd);
		
		this.add(mb1);
		this.add(mb2);
		
		
		this.setTitle("用户调查");
		this.setSize(280, 190);
		this.setLocation(480, 230);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
