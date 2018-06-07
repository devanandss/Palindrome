import java.util.Scanner;

class Palindrome
{
public static void main(String[]args)
{

Scanner s=new Scanner(System.in);
System.out.println("Enter the no. of digits");
int n=s.nextInt();
int[] a=new int[n];
System.out.println("Enter the Value");

for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int k=n-1;
int p=0;
for(int j=0;j<n;j++)
{
if(a[j]==a[k])
p++;

k--;
}

if(p==n)
System.out.println("Entered no. is a palindrome");
else
{
System.out.println("Entered no. is not a palindrome");
}
}
}