import java.io.*;
import java.util.*;
class month
{
public static void main(String[] args)
{
int m,y;
Scanner in=new Scanner(System.in);
System.out.print("Enter Month:");
m=in.nextInt();
System.out.print("Enter Year:");
y=in.nextInt();
if(m==1)
{
System.out.print("Jan,31 Days");
}
else if(m==2)
{
if(y%4==0)
{
System.out.print("Feb,29 days");
}
else
{
System.out.print("Feb,28 days");
}
}
else if(m==3)
{
System.out.print("Mar,31days");
}
else if(m==4)
{
System.out.print("Apr,30 days");
}
else if(m==5)
{
System.out.print("May,31 days");
}
else if(m==6)
{
System.out.print("Jun,30 days");
}
else if(m==7)
{
System.out.print("Jul,31 days");
}
else if(m==8)
{
System.out.print("Aug,31 days");
}
else if(m==9)
{
System.out.print("Sep,30 days");
}
else if(m==10)
{
System.out.print("Oct,31 days");
}
else if(m==11)
{
System.out.print("Nov,30 days");
}
else if(m==12)
{
System.out.print("Dec,31 days");
}
}
}
