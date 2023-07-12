import java.io.*;
import java.util.*;
class ticket
{
public static void main(String[] args)
{
int v1,v2,v3,ts,tl;
Scanner in=new Scanner(System.in);
System.out.println("Enter Rs.50 tickets sold:");
v1=in.nextInt();
System.out.println("Enter Rs.30 tickets sold:");
v2=in.nextInt();
System.out.println("Enter Rs.10 tickets sold:");
v3=in.nextInt();
ts=(v1*50)+(v2*30)+(v3*10);
tl=9000-ts;
System.out.println("The Total Amount Profit is:"+ts);
System.out.println("The Total Amount Loss is:"+tl);
}
}
