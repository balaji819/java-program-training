import java.io.*;
import java.util.*;
class fact
{
public static void main(String[] args)
{
int fact=1,i,n;
Scanner in=new Scanner(System.in);
System.out.print("Enter The Number:");
n=in.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.print("The Fact Of"+n+"="+fact);
}
}

