import java.io.*;
//»º³åÁ÷
public class Day0702 {
	public static void mian(String[] args) throws IOException{
		BufferedInputStream hcfz=new BufferedInputStream(new FileInputStream("C:/Users/asus/Downloads/fengjing.gif"));
		BufferedOutputStream hczt=new BufferedOutputStream(new FileOutputStream("D:/jing.gif"));
		byte[] hc=new byte[2048];
		int ff;
		ff=hcfz.read(hc);
		while(ff!=-1){
			hczt.write(hc, 0, ff);
			ff=hcfz.read(hc);
		}
		hczt.flush();
		hczt.close();
		hcfz.close();
		
	}
	public Day0702() {
		// TODO Auto-generated constructor stub
	}

}
