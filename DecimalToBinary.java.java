import java.util.Scanner;

class DecimalToBinary
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
int d=s.nextInt();
int l=1000;
int[] a=new int[l];
int d1=d;
int b=0,r=0,q=0,t=0;

while(d1>1)
{
r=d1%2;
d1=d1/2;
a[b]=r;

if(d1<2)
{
System.out.print(d1+" ");
}
b++;
}

q=b-1;
while(q>=t)
{
System.out.print(a[q]+" ");

if(q==0)
t=q+1;

q--;
}
}
}
