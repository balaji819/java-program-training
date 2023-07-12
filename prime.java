import java.io.*;
import java.util.*;
class prime
{
public static void main(String[] args)
{
int n,i,j=0;
Scanner in=new Scanner(System.in);
System.out.print("Enter a number:");
n=in.nextInt();
for(i=2;i<n;i++)
{
if(n%i==0)
{
j++;
}
}
if(j==0)
{
System.out.println("The Give Number Is Prime");
}
else
{
System.out.println("The Give Number Is Not a Prime");
}
}
}
