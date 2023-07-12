import java.io.*;
import java.util.*;
class perfect
{
public static void main(String[] args)
{
int n,i,sum=0;
Scanner in=new Scanner(System.in);
System.out.print("Enter a Number:");
n=in.nextInt();
for(i=1;i<n;i++)
{
if(n%i==0)
{
sum=sum+i;
}
}
if(sum==n)
{
System.out.print("The Given Number Is Perfect");
}
else
{
System.out.print("The Given Number Is Not Perfect");
}
}
}
