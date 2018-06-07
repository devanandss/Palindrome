import java.util.Scanner;

class BinaryToDecimal1
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
int b=s.nextInt();
int c=b/10,d=0,r=0,r1=0;

while(c>0)
{
r=c%10;
c=c/10;
r1+=r;
r1*=2;
}

d=r1+(b%10);
System.out.println("Decimal value for "+b+" is "+d);
}
}