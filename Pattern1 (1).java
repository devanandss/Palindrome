import java.util.Scanner;

class Pattern1
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
int u=s.nextInt();
int m=u/2;
System.out.println("m= "+m);
System.out.print("\n");
int i=1;
int l=u-m;
while(i<=l)
{
for(int j=1;j<=m;j++)
System.out.print(" ");

for(int k=1;k<=u-(2*m);k++)
System.out.print("*");

System.out.print("\n");
m--;
i++;
}
int n=1;
int w=u-l;
int x=0;
while(n<=w)
{
for(int t=0;t<=x;t++)
{
System.out.print(" ");
}
for(int v=1;v<=l-(2*x);v++)
System.out.print("*");
System.out.print("\n");
n++;
x++;
}
}
}
