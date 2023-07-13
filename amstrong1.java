import java.io.*;
import java.util.*;
import java.lang.Math;
class amstrong1
{
public static void main(String[] args)
{
int n,b,sum,x,i;
for(i=1;i<=1000;i++)
{
n=i;
sum=0;
while(n>0)
{
b=n%10;
sum=sum+(b*b*b);
n=n/10;
}
if(sum==i)
{
System.out.println(i);
}
}
}
}
