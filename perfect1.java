import java.io.*;
import java.util.*;
class perfect1
{
public static void main(String[] args)
{
int n,i,j,b;
Scanner in=new Scanner(System.in);
System.out.print("Enter a Number:");
n=in.nextInt();
System.out.println("The Perfect Numbers are:");
for(i=1;i<n;i++)
{
b=0;
for(j=1;j<i;j++)
{
if(i%j==0)
{
b=b+j;
}
}
if(b==i)
{
System.out.print("\t"+i);
}
}
}
}

