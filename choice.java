import java.io.*;
import java.util.*;
class choice
{
public static void main(String[] args)
{
int pm,cm,r,c,amt;
Scanner in=new Scanner(System.in);
System.out.print("Enter Previous Month Reading:");
pm=in.nextInt();
System.out.print("Enter Current Month Reading:");
cm=in.nextInt();
System.out.print("Enter Choice:");
c=in.nextInt();
r=cm-pm;
System.out.println("Reading is:"+r);
switch(c)
{
case 1:
System.out.println("Home Current");
if(r<=100)
{
System.out.println("Nil");
}
else if(r>100&&r<=200)
{
amt=r*1;
System.out.println("The Amount Is:"+amt);
}
else if(r>200&&r<=300)
{
amt=r*2;
System.out.println("The Amount Is:"+amt);
}
else if(r>300&&r<=400)
{
amt=r*3;
System.out.println("The Amount Is:"+amt);
}
else if(r>400)
{
amt=r*4;
System.out.println("The Amount Is:"+amt);
}
break;
case 2:
System.out.println("Commercial Current");
if(r<=100)
{
amt=r*3;
System.out.println("The Amount Is:"+amt);
}
else if(r>100&&r<=200)
{
amt=r*4;
System.out.println("The Amount Is:"+amt);
}
else if(r>200&&r<=300)
{
amt=r*5;
System.out.println("The Amount Is:"+amt);
}
else if(r>300&&r<=400)
{
amt=r*6;
System.out.println("The Amount Is:"+amt);
}
else if(r>400)
{
amt=r*10;
System.out.println("The Amount Is:"+amt);
}
break;
case 3:
System.out.println("Research");
if(r<=100)
{
amt=r*1;
System.out.println("The Amount Is:"+amt);
}
else if(r>100&&r<=200)
{
amt=r*2;
System.out.println("The Amount Is:"+amt);
}
else if(r>200&&r<=300)
{
amt=r*3;
System.out.println("The Amount Is:"+amt);
}
else if(r>300&&r<=400)
{
amt=r*4;
System.out.println("The Amount Is:"+amt);
}
else if(r>400)
{
amt=r*5;
System.out.println("The Amount Is:"+amt);
}
break;
}
}
}
