import java.util.*;
import java.io.*;

public class Day070901 {
	public static void main(String[] args){
		PrintStream srzq=null;
		PrintStream srcw=null;
		Scanner ss=null;
		try{
			srzq=new PrintStream("d:/aaa.txt");
			srcw=new PrintStream("d:/bbb.txt");
			ss=new Scanner(System.in);
			int shuzi;
			System.setOut(srzq);
			System.setErr(srcw);
			while(true){
				shuzi=ss.nextInt();
				System.out.println(shuzi);
			}
		}catch(Exception e){
			System.err.println(" ‰»Î”–ŒÛ");
		}
	}
	

}
