import java.io.*;
import java.util.*;
class day
{
public static void main(String[] args)
{
int date,mon,day;
Scanner in=new Scanner(System.in);
System.out.print("Enter Date:");
date=in.nextInt();
System.out.print("Enter Month:");
mon=in.nextInt();
if(mon==1)
{
System.out.print("Days="+date);
}
else if(mon==2)
{
day=31+date;
System.out.print("Days="+day);
}
else if(mon==3)
{
day=59+date;
System.out.print("Days="+day);
}
else if(mon==4)
{
day=90+date;
System.out.print("Days="+day);
}
else if(mon==5)
{
day=120+date;
System.out.print("Days="+day);
}
else if(mon==6)
{
day=151+date;
System.out.print("Days="+day);
}
else if(mon==7)
{
day=181+date;
System.out.print("Days="+day);
}
else if(mon==8)
{
day=212+date;
System.out.print("Days="+day);
}
else if(mon==9)
{
day=243+date;
System.out.print("Days="+day);
}
else if(mon==10)
{
day=273+date;
System.out.print("Days="+day);
}
else if(mon==11)
{
day=304+date;
System.out.print("Days="+day);
}
else if(mon==12)
{
day=334+date;
System.out.print("Days="+day);
}
}
}
