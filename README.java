import java.io.*;
import java.util.*;
class Strreverse
{
  public static void main(String args[])
   {
	Scanner input=new Scanner(System.in);
	String a=input.nextLine();
	String rev="";
	int length=a.length();
	for(int i=length-1;i>=0;i--)
	{
		rev=rev+a.charAt(i);
	}
       System.out.println(rev);
 }
}
