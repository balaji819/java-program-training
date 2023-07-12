import java.io.*;
import java.util.*;
class biggest
{
public static void main(String[] args)
{
int a,b;
Scanner in=new Scanner(System.in);
System.out.print("Enter A's number:");
a=in.nextInt();
System.out.print("Enter B's number:");
b=in.nextInt();
if(a>b)
{
System.out.println("A is biggest number");
}
else
{
System.out.println("B is biggest");
}
}
}
