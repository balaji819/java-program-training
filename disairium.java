import java.io.*;
import java.util.*;
import java.lang.Math;
class disairium
{
public static void main(String[] args)
{
int r,n,x,num,digit=0;
double sum=0;
Scanner in=new Scanner(System.in);
System.out.print("Enter number:");
num=in.nextInt();
n=num;
x=n;
while(num>0)
{
digit++;
num=num/10;
}
while(n>0)
{
r=n%10;
sum=sum+Math.pow(r,digit);
n=n/10;
digit--;
}

if(x==sum)
{
System.out.print("The num is disarium");
}
else
{
System.out.print("The num is not disarium");
}
}
}
