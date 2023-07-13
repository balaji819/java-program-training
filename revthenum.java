import java.io.*;
import java.util.*;
class revthenum
{
public static void main(String[] args)
{
int b,n,rev=0;
Scanner in=new Scanner(System.in);
System.out.print("Enter the digit:");
n=in.nextInt();
while(n>0)
{
b=n%10;
rev=rev*10+b;
n=n/10;
}
System.out.print("The Reversed digit="+rev);
}
}
