/*Write a program to find the total number of a primes number in a given interval.

Given two integers S and E, count all primes between S and E*/

import java.util.* ;
import java.io.*; 
import java.util.Scanner;
class CountPrime
{
	// Write your totalPrime function here
    public int totalPrime(int s,int e)
    {
        int count=0;
        if(s>e)
        {
            return 0;
        }
        boolean[] isPrime = new boolean[e+1];
        for (int i=0;i<=e;i++)
        {
            isPrime[i] = true;
        }
        isPrime[0]=isPrime[1] = false;
        for (int i = 2; i * i<=e; i++)
        {
            if (isPrime[i])
            {
                for (int j = i * i; j <= e; j += i)
                {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = Math.max(2,s); i <= e; i++)
        {
            if (isPrime[i])
            {
                count++;
            }
        }
        return count;
    }
}

class Solution
{
	public static void main(String args[])
    {
		
		CountPrime obj = new CountPrime();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(obj.totalPrime(s, e));
	}
}
