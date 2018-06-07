import java.util.Scanner;

class Palindrome1
{
public static void main(String[]args)
{
Scanner s= new Scanner(System.in);
System.out.println("Enter the no. of digits");
int l=s.nextInt();
System.out.println("Enter the number");
int n=s.nextInt();
int j=0,k=n;
int i=0;
int[] d=new int[l];
while(k>=j)
{
d[i]=k%10;
System.out.println(d[i]);
k=k/10;
i++;
if(k==0)
j=k+1;
}


i=i-1;
int q=i;
int nv=0,m=0;

while(m<=q)
{

int u=0,y=1;
while(u<i)
{
y=10*y;
u++;
}

nv+=(y*d[m]);

i--;
m++;
}

if(n==nv)
System.out.print(n+" is a palindrome number");
else
System.out.print(n+" is not a palindrome number");
}
}