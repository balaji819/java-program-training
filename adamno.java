import java.io.*;
import java.util.*;
class adamno
{
public static void main(String[] args)
{
int n,b,sum=0,a,c,rev=0;
Scanner in=new Scanner(System.in);
System.out.print("Enter a number:");
n=in.nextInt();
b=n*n;
while(b>0)
{
a=b%10;
sum=sum*10+a;
b=b/10;
}
while(n>0)
{
int d=n%10;
rev=rev*10+d;
n=n/10;
}
int f=rev*rev;
if(sum==f)
{
System.out.print("The Number Is Adam");
}
else
{
System.out.print("The Number Is  Not Adam");
}
}
}
