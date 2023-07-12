import java.io.*;
import java.util.*;
class biggest2
{
public static void main(String[] args)
{
int a,b,c;
Scanner in=new Scanner(System.in);
System.out.print("Enter A's Value:");
a=in.nextInt();
System.out.print("Enter B's Value:");
b=in.nextInt();
System.out.print("Enter B's Value:");
c=in.nextInt();
if((a>b)&&(a>c))
{
System.out.println("A is Bigger");
}
else if((b>a)&&(b>c))
{
System.out.println("B is Bigger");
}
else
{
System.out.println("C is Bigger");
}
}
}
