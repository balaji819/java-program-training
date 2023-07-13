import java.io.*;
import java.util.*;
class spltwodig
{
public static void main(String[] args)
{
int n,sum=0,mul=1,x;
Scanner in=new Scanner(System.in);
System.out.print("Enter a number:");
n=in.nextInt();
x=n;
while(n>0)
{
int b=n%10;
sum=sum+b;
mul=mul*b;
n=n/10;
}
int e=sum+mul;
if(x==e)
{
System.out.print("The num is spl two dig num");
}
else
{
System.out.print("The num is not spl two dig num");
}
}
}
