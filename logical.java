import java.io.*;
import java.util.*;
class logical
{
public static void main(String[] args)
{
int a,b,c;
boolean d,e,f;
Scanner in=new Scanner(System.in);
System.out.println("Enter a:");
a=in.nextInt();
System.out.println("Enter b:");
b=in.nextInt();
System.out.println("Enter c:");
c=in.nextInt();
d=(a>b)&&(a>c);
e=(a>b)||(a>c);
f=!(a>b);
System.out.println("The d is "+d);
System.out.println("The e is "+e);
System.out.println("The f is "+f);
}
}
