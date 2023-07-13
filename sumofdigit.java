import java.io.*;
import java.util.*;
class sumofdigit
{
public static void main(String[] args)
{
int b,n,sum=0;
Scanner in=new Scanner(System.in);
System.out.print("Enter the digit:");
n=in.nextInt();
while(n>0)
{
b=n%10;
sum=sum+b;
n=n/10;
}
System.out.print("The sum of the digit="+sum);
}
}
