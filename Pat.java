import java.util.Scanner;

class Pat
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
int u=s.nextInt();
int m=1;
for(int k=1;k<=u;k++)
{

for(int i=1;i<=u-m;i++)
System.out.print(" ");

for(int j=1;j<=m;j++)
System.out.print("*");

System.out.print("\n");
m++;
}
}
}