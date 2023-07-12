import java.io.*;
import java.util.*;
class ebunit
{
public static void main(String[] args)
{
int pm,cm,r,s=0;
Scanner in=new Scanner(System.in);
System.out.print("Enter Privous Month Reading:");
pm=in.nextInt();
System.out.print("Enter Current Month Reading:");
cm=in.nextInt();
r=cm-pm;
if(r<=100)
{
s=r*1;
}
else if((r<=200)&&(r>100))
{
s=r*2;
}
else if((r<=300)&&(r>200))
{
s=r*3;
}
else if(r>300)
{
s=r*4;
}
System.out.print("Total Amount:"+s);
}
}
