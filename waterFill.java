import java.util.*;
import java.lang.*;
import java.io.*;

class waterFill
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int[] a = new int[3];
            int count=0;
            for(int i=0;i<3;i++)
            {
                a[i] = sc.nextInt();
                if(a[i]==0)
                {
                    count++;
                }
            }
            if(count<2)
            {
                System.out.println("Not now");
            }
            else
            {
                System.out.println("Water filling time");
            }
        }
	}
}
