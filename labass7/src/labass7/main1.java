package labass7;


import java.io.File;

import java.io.IOException;
import java.util.Scanner;


public class main1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File obj=new File("D:\\radhika\\labass7\\r1.txt");
	    Scanner rt=new Scanner(obj);
	     String str=" ";
	     String r=rt.nextLine();
	     for(int i=0;i<r.length();i++)
	     {
	    	 if(r.charAt(i)!=' ') 
	    	 {
	    		 str+=r.charAt(i);
	    	 }
	    	 else
	    	 {
	    		if(str.length()>5)
	    			System.out.println(str+" ");
	    		str=" "; 
	    	 }
	     }
	     rt.close();
		}
	}


