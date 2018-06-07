import java.util.Scanner;

class Prime
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
int p=s.nextInt();
int m=2,j=0;
if(p>=2)
{
while(m<=p)
{
if((p%m)==0)
j++;
m++;
}
if(j==1)
{
System.out.print(p+" is a prime number");
}
else
System.out.print(p+" is not a prime number");
}
else if(p==1)
{
System.out.print(" 1 is a Prime number");
}
}
}