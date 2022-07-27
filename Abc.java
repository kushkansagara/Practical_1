

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t > 0) {
            int a, b, m ,dist1,dist2;
            a = sc.nextInt();
            b = sc.nextInt();
            m = sc.nextInt();
            // dist1 = positive(a - b);
            // dist2 = positive(m+a - b);
            if(a>b)
            dist1 = minimum((a-b),(m+b-a));
            else
            dist1 = minimum((b-a),(m+a-b));
            
            System.out.println(dist1);
            t--;
        }
    }
    public static int minimum(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }
		
	}