import java.io.*;
import java.util.*;
class days
{
public static void main(String[] args)
{
int date,mon,day=0,week;
Scanner in=new Scanner(System.in);
System.out.print("Enter Date:");
date=in.nextInt();
System.out.print("Enter Month:");
mon=in.nextInt();
if(mon==1)
{
week=date/7;
day=date;
System.out.print("Days="+day);
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
if(day%7==0)
{
System.out.print("Sunday");
}
else if(day%7==1)
{
System.out.print("Monday");
}
else if(day%7==2)
{
System.out.print("Tuesday");
}
else if(day%7==3)
{
System.out.print("Wednesday");
}
else if(day%7==4)
{
System.out.print("Thursday");
}
else if(day%7==5)
{
System.out.print("Friday");
}
else if(day%7==6)
{
System.out.print("Saturday");
}
}
}
