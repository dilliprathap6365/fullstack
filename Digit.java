import java.util.*;
public class Digit
{
public static void main(String args[])
{
char ch;
System.out.println("enter a digit:");
Scanner sc=new  Scanner(System.in);
ch=sc.next().charAt(0);
System.out.println();
if((ch>='0'&&ch<='9'))
System.out.println(dg+"is an digit");
else
System.out.println(dg+"is not digit");
}}