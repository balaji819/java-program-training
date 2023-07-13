import java.io.*;
import java.util.*;
class adamno1
{
public static void main(String[] args)
{
int e,d,n,b,i,sum,a,c,rev=0;
for(i=1;i<=100;i++)
{
sum=0;
rev=0;
e=i;
d=i*i;
while(d>0)
{
n=d%10;
sum=sum*10+n;
d=d/10;
}
while(e>0)
{
c=e%10;
rev=rev*10+c;
e=e/10;
}
a=rev*rev;
if(sum==a)
{
System.out.print("\t"+i);
}
}
}
}
