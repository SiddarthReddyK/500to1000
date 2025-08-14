import java.util.*;
import java.lang.*;
import java.io.*;

class minPizza
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if((n*x)%4==0)
            {
                System.out.println((n*x)/4);
            }
            else
            {
                System.out.println(((n*x)/4)+1);
            }
        }
	}
}