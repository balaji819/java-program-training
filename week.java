import java.io.*;
import java.util.*;
class week
{
public static void main(String[] args)
{
int date,mon,day,week;
Scanner in=new Scanner(System.in);
System.out.print("Enter Date:");
date=in.nextInt();
System.out.print("Enter Month:");
mon=in.nextInt();
if(mon==1)
{
week=date/7;
System.out.print("Days="+date);
System.out.print("\nNo Of Weeks Completed="+week);
}
else if(mon==2)
{
day=31+date;
week=day/7;
System.out.print("Days="+day);
System.out.print("\nNo Of Weeks Completed="+week);
}
else if(mon==3)
{
day=59+date;
week=day/7;
System.out.print("Days="+day);
System.out.print("\nNo Of Weeks Completed="+week);
}
else if(mon==4)
{
day=90+date;
week=day/7;
System.out.print("Days="+day);
System.out.print("\nNo Of Weeks Completed="+week);
}
else if(mon==5)
{
day=120+date;
week=day/7;
System.out.print("Days="+day);
System.out.print("\nNo Of Weeks Completed="+week);
}
else if(mon==6)
{
day=151+date;
week=day/7;
System.out.print("Days="+day);
System.out.print("\nNo Of Weeks Completed="+week);
}
else if(mon==7)
{
day=181+date;
week=day/7;
System.out.print("Days="+day);
System.out.print("\nNo Of Weeks Completed="+week);
}
else if(mon==8)
{
day=212+date;
week=day/7;
System.out.print("Days="+day);
System.out.print("\nNo Of Weeks Completed="+week);
}
else if(mon==9)
{
day=243+date;
week=day/7;
System.out.print("Days="+day);
System.out.print("\nNo Of Weeks Completed="+week);
}
else if(mon==10)
{
day=273+date;
week=day/7;
System.out.print("Days="+day);
System.out.print("\nNo Of Weeks Completed="+week);
}
else if(mon==11)
{
day=304+date;
week=day/7;
System.out.print("Days="+day);
System.out.print("\nNo Of Weeks Completed="+week);
}
else if(mon==12)
{
day=334+date;
week=day/7;
System.out.print("Days="+day);
System.out.print("\nNo Of Weeks Completed="+week);
}
}
}
