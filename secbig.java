import java.io.*;
import java.util.*;
class secbig
{
public static void main(String[] args)
{
int a=0,b=0,c=0;
Scanner in=new Scanner(System.in);
System.out.print("Enter First Number:");
a=in.nextInt();
System.out.print("Enter Second Number:");
b=in.nextInt();
System.out.print("Enter Third Number:");
c=in.nextInt();
if(((a>b)&&(a<c))||((a>c)&&(a<b)))
{
System.out.print("The Second Biggest Number Is:"+a);
}
else if(((b>a)&&(b<c))||((b>c)&&(b<a)))
{
System.out.print("The Second Biggest Number Is:"+b);
}
else if(((c>a)&&(c<b))||((c>b)&&(c<a)))
{
System.out.print("The Second Biggest Number Is:"+c);
}
}
}
