import java.util.Scanner;

class PalindromeWithoutArray
{
public static void main(String[]args)
{

Scanner s=new Scanner(System.in);
System.out.println("Enter the numerical value");
int n=s.nextInt();
int b=n;
int i=0;

while(b>0)
{
b=b/10;
i++;
}

System.out.println("No. of digits is "+i);

int g=n;
int c=i-1,d=0;
while(c>=0)
{
b=g%10;
g=g/10;

int e=1,f=c;
while(f>=1)
{
e*=10;
f--;
}

d+=b*e;

c--;
}

if(n==d)
{
System.out.print(n+" is a palindrome number");
}
else
System.out.print(n+" is not a palindrome number");
}
}