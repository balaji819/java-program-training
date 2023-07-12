import java.io.*;
import java.util.*;
class simple
{
public static void main(String[] args)
{
int p,n,r,si;
Scanner in=new Scanner(System.in);
System.out.print("Principle Amount:");
p=in.nextInt();
System.out.print("No Of Years:");
n=in.nextInt();
System.out.print("Rate Of Interest:");
r=in.nextInt();
si=(p*n*r)/100;
System.out.print("Simple Interest:"+si);
}
}


