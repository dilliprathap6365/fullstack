import java.util.*;
public class Program2{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("enter the number:");
n=sc.nextInt();
if(n%2*2==0)
{
System.out.print("Even/n");
System.out.print(n+"is even/n");
}
else
{
System.out.println("odd/n");
System.out.println(n+"is odd/n");
}}}