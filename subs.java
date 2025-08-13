import java.util.*;
import java.lang.*;
import java.io.*;

class subs
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0)
        {
            int n = ss.nextInt();
            int x = ss.nextInt();
            if(n%6==0) System.out.println(n/6*x);
            else System.out.println((n/6+1)*x);
        }
	}
}
