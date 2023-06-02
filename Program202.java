import java.util.*;
public class Program202{
public static boolean isEvent(int n)
{return((n/2)*2==n);}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("enter the number:");
n=sc.nextInt();
if(isEven(n))
System.out.print("Even/n");
System.out.print(n+"is even/n");
else
System.out.println("odd/n");
System.out.println(n+"is odd/n");
}}