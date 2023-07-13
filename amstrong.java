import java.io.*;
import java.util.*;
import java.lang.Math;
class amstrong
{
public static void main(String[] agrs)
{
double sum=0,b,x;
double c;
int n;
Scanner in=new Scanner(System.in);
System.out.print("Enter a number:");
n=in.nextInt();
x=n;
while(n>0)
{
b=n%10;
c=Math.pow(b,3);
sum=sum+c;
n=n/10;
}
System.out.print(sum);
if(sum==x)
{
System.out.print("It is Amstrong number");
}
else
{
System.out.print("It is not Amstrong number");
}
}
}
