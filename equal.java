import java.io.*;
import java.util.*;
class equal
{
public static void main(String[] args)
{
int a,b,c;
Scanner in=new Scanner(System.in);
System.out.print("Enter A:");
a=in.nextInt();
System.out.print("Enter B:");
b=in.nextInt();
System.out.print("Enter C:");
c=in.nextInt();
if((a==b)&&(a==c))
{
System.out.print("Three Numbers Are Equal");
}
else if((a==b)&&(a>c))
{
System.out.print("A and B are Equal");
}
else if((a==c)&&(a>b))
{
System.out.print("A and C are Equal");
}
else if((b==c)&&(b>a))
{
System.out.print("B and C are Equal");
}
else if((a>b)&&(a>c))
{
System.out.print("A is Big");
}
else if((b>c)&&(b>a))
{
System.out.print("B is Big");
}
else if((c>a)&&(c>b))
{
System.out.print("C is big");
}
}
}
