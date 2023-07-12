import java.io.*;
import java.util.*;
class secbig1
{
public static void main(String[] args)
{
int a=0,b=0,c=0,d=0;
Scanner in=new Scanner(System.in);
System.out.print("Enter First Number:");
a=in.nextInt();
System.out.print("Enter Second Number:");
b=in.nextInt();
System.out.print("Enter Third Number:");
c=in.nextInt();
System.out.print("Enter Fourth Number:");
d=in.nextInt();
if(((a<b)&&(a>c)&&(a>d))||((a<c)&&(a>b)&&(a>d))||((a<d)&&(a>b)&&(a>c)))
{
System.out.print("The Second Biggest Number Is:"+a);
}
else if(((b<a)&&(b>c)&&(b>d))||((b<c)&&(b>a)&&(b>d))||((b<d)&&(b>a)&&(b>c)))
{
System.out.print("The Second Biggest Number Is:"+b);
}
else if(((c<a)&&(c>b)&&(c>d))||((c<b)&&(c>a)&&(c>d))||((c<d)&&(c>a)&&(c>b)))
{
System.out.print("The Second Biggest Number Is:"+c);
}
else if(((d<a)&&(d>b)&&(d>c))||((d<b)&&(d>a)&&(d>c))||((d<c)&&(d>a)&&(d>b)))
{
System.out.print("The Second Biggest Number Is:"+d);
}
}
}
