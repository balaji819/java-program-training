import java.io.*;
import java.util.*;
class inswap
{
public static void main(String[] args)
{
int a,b,temp;
Scanner in=new Scanner(System.in);
System.out.print("a=");
a=in.nextInt();
System.out.print("b=");
b=in.nextInt();
temp=a;
a=b;
b=temp;
System.out.print("After Swap");
System.out.print("a="+a);
System.out.print("b="+b);
}
}
