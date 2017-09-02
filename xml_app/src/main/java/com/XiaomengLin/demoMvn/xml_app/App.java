package com.XiaomengLin.demoMvn.xml_app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        String zfc="23333333333";
		System.out.println(zfc);
		
		BufferedReader zfl=new BufferedReader(new InputStreamReader(System.in));
		zfc=zfl.readLine();//如果直接回车，字符串就是空字符串，没有开辟内存空间，没有指向
		
		System.out.println("---------------------------------------");
		System.out.println(zfc+"aaaaaaaaaa");
		System.out.println(zfc.equals(""));
		System.out.println(zfc.equals(null));
    }
}
