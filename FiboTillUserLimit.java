import java.util.Scanner;

class FiboTillUserLimit
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
int u=s.nextInt();
int a=0,b=1,sum=b;
if(u>=a)
System.out.print(a+" ");
while(sum<=u)
{
System.out.print(sum+" ");
sum=a+b;
a=b;
b=sum;
}
}
}