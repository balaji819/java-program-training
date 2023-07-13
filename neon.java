import java.io.*;
import java.util.*;
class neon
{
public static void main(String[] args)
{
int n,a,b,sum=0;
Scanner in=new Scanner(System.in);
System.out.print("Enter a nember:");
n=in.nextInt();
a=n*n;
while(a>0)
{
b=a%10;
sum=sum+b;
a=a/10;
}
if(n==sum)
{
System.out.print("The number is neon");
}
else 
{
System.out.print("The number is not neon");
}
}
}
