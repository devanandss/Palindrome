import java.util.Scanner;

class FactorialSeries
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
int u=s.nextInt();
int f=1,m=1;
if(u>=1)
{
while(m<=u)
{
f=f*m;
System.out.println("Factorial of "+m+" is "+f);
m++;
}
}
else if(u==0)
System.out.println("Factorial of 0 is 1");
else
System.out.println("unable to find factorial for "+u);
}
}