import java.io.*;
import java.util.*;
class grade
{
public static void main(String[] args)
{
int m1,m2,m3,m4,m5,tot,avg;
Scanner in=new Scanner(System.in);
System.out.print("Enter Mark1:");
m1=in.nextInt();
System.out.print("Enter Mark2:");
m2=in.nextInt();
System.out.print("Enter Mark3:");
m3=in.nextInt();
System.out.print("Enter Mark4:");
m4=in.nextInt();
System.out.print("Enter Mark5:");
m5=in.nextInt();
tot=m1+m2+m3+m4+m5;
avg=tot/5;
System.out.println("Total:"+tot);
System.out.println("Average:"+avg);
if(avg>=90)
{
System.out.println("O Grade");
}
else if((avg>=75)&&(avg<90))
{
System.out.println("A Grade");
}
else if((avg>=60)&&(avg<75))
{
System.out.println("B Grade");
}
else if((avg>=45)&&(avg<60))
{
System.out.println("C Grade");
}        
else
{
System.out.println("D Grade");
}
}
}
