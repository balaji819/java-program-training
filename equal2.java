import java.io.*;
import java.util.*;
class equal2
{
public static void main(String[] args)
{
int a,b,c,d;
Scanner in=new Scanner(System.in);
System.out.print("Enter A:");
a=in.nextInt();
System.out.print("Enter B:");
b=in.nextInt();
System.out.print("Enter C:");
c=in.nextInt();
System.out.print("Enter D:");
d=in.nextInt();
if((a==b)&&(a==c)&&(a==d))
{
System.out.print("Four Numers are Equal");
}
else if((a==b)&&(a==c)&&(a>d))
{
System.out.print("A , B and c are equal");
}
else if((a==b)&&(a==d)&&(a>c))
{
System.out.print("A , B and D are equal");
}
else if((a==c)&&(a==d)&&(a>b))
{
System.out.print("A , C and D are equal");
}
else if((b==c)&&(b==d)&&(b>a))
{
System.out.print("B , C and D are equal");
}
else if((a==b)&&(a>c)&&(a>d))
{
System.out.print("A and B are equal");
}
else if((a==c)&&(a>b)&&(a>d))
{
System.out.print("A and C are equal");
}
else if((a==d)&&(a>b)&&(a>c))
{
System.out.print("A and D are equal");
}
else if((b==c)&&(b>a)&&(b>d))
{
System.out.print("B and C are equal");
}
else if((b==d)&&(b>a)&&(b>c))
{
System.out.print("B and D are equal");
}
else if((c==d)&&(c>a)&&(c>b))
{
System.out.print("C and D are equal");
}
else if((a>b)&&(a>c)&&(a>d))
{
System.out.print("A is Big");
}
else if((b>a)&&(b>c)&&(b>d))
{
System.out.print("B is Big");
}
else if((c>a)&&(c>b)&&(c>d))
{
System.out.print("C is Big");
}
else if((d>a)&&(d>b)&&(d>c))
{
System.out.print("D is Big");
}
}
}
