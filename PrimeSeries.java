import java.util.Scanner;

class PrimeSeries
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
int u=s.nextInt();
int m=2,j=0;
System.out.println("The prime series upto "+u);
for(int i=2;i<=u;i++)
{
j=0;
m=2;
while(m<=i)
{
if((i%m)==0)
j++;
m++;
}
if(j==1)
{
System.out.println(i);
}
}
}
}