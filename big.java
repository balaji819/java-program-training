import java.io.*;
import java.util.*;
class big
{
public static void main(String[] args)
{
int a,b,c;
Scanner in=new Scanner(System.in);
System.out.print("Enter A's Number:");
a=in.nextInt();
System.out.print("Enter B's Number:");
b=in.nextInt();
System.out.print("Enter C's Number:");
c=in.nextInt();
if(a>b)
{
if(a>c)
{
System.out.println("A is Bigger");
}
else 
{
System.out.println("C is bigger");
}

}
else if(b>c)
{
System.out.println("B is Bigger");
}
else 
{
System.out.println("C is bigger");
}
}
}
