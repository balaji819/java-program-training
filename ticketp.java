import java.io.*;
import java.util.*;
class ticketp
{
public static void main(String[] args)
{
int v1,v2,v3,a,b,c,ta,ts,tl;
Scanner in=new Scanner(System.in);
System.out.println("Enter Rs.50 Sold Tickets:");
v1=in.nextInt();
System.out.println("Enter Rs.30 Sold Tickets:");
v2=in.nextInt();
System.out.println("Enter Rs.10 Sold Tickets:");
v3=in.nextInt();
a=(400*40)/100;
b=(400*30)/100;
c=(400*30)/100;
ta=(a*50)+(b*30)+(c*10);
ts=(v1*50)+(v2*30)+(v3*10);
tl=ta-ts;
System.out.println("Total Amount:"+ta);
System.out.println("Total Sold:"+ts);
System.out.println("Total Loss:"+tl);
}
}
