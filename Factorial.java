import java.util.Scanner;

class Fact
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
f=m*f;
m++;
}
System.out.print("Factorial of "+u+" is "+f);
}
else
System.out.print("Factorial of "+u+" is 1");
}
} 