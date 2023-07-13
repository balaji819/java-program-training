import java.io.*;
import java.util.*;
class dosumofdigit
{
public static void main(String[] args)
{
int n,b,sum=0;
Scanner in=new Scanner(System.in);
System.out.print("Enter a number:");
n=in.nextInt();
do
{
b=n%10;
sum=sum+b;
n=n/10;
}while(n>0);
System.out.print("The Sum Of The Digit Is:"+sum);
}
}
