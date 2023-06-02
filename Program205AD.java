import java.util.*;
public class Program205AD
{
public static void main(String args[])
{
char ch;
System.out.println("enter a character:");
Scanner sc=new  Scanner(System.in);
ch=sc.next().charAt(0);
System.out.println();
if((ch>='0'&& ch<='9'))
System.out.println(ch+"is an digit");
else if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
System.out.println(ch+" is an alphabet");
else
System.out.println(ch+"is a special character");
}}