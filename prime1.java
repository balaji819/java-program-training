import java.io.*;
import java.util.*;
class prime1
{
public static void main(String[] args)
{
int i,j,n;
Scanner in=new Scanner(System.in);
System.out.print("Enter a Number:");
n=in.nextInt();
System.out.println("The Prime Numbers are:");
for(i=1;i<=n;i++)
{
int b=0;
for(j=2;j<i;j++)
{
if(i%j==0)
{
b++;
}
}
if(b==0)
{
System.out.print("\t"+i);
}
}
}
}
