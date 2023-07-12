import java.io.*;
import java.util.*;
class tables1
{
public static void main(String[] args)
{
int i,j,k,l;
Scanner in=new Scanner(System.in);
System.out.print("Enter The Limit:");
j=in.nextInt();
System.out.print("Enter Table:");
k=in.nextInt();
for(i=1;i<=j;i++)
{
l=i*k;
System.out.println(+i+"*"+k+"="+l);
}
}
}
