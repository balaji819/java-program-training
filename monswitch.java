import java.io.*;
import java.util.*;
class monswitch
{
public static void main(String[] args)
{
int mon,y=0;
Scanner in=new Scanner(System.in);
System.out.print("Enter Month:");
mon=in.nextInt();
System.out.print("Enter Year:");
y=in.nextInt();
switch(mon)
{
case 1:
System.out.print("Jan,31 Days");
break;
case 2:
if(y%4==0)
{
System.out.print("Feb,29 days");
}
else
{
System.out.print("Feb,28 days");
}
break;
case 3:
System.out.print("Mar,31days");
break;
case 4:
System.out.print("Apr,30 days");
break;
case 5:
System.out.print("May,31 days");
break;
case 6:
System.out.print("Jun,30 days");
break;
case 7:
System.out.print("Jul,31 days");
break;
case 8:
System.out.print("Aug,31 days");
break;
case 9:
System.out.print("Sep,30 days");
break;
case 10:
System.out.print("Oct,31 days");
break;
case 11:
System.out.print("Nov,30 days");
break;
case 12:
System.out.print("Dec,31 days");
break;
default:
System.out.print("Wrong Month Entered");
break;
}
}
}
