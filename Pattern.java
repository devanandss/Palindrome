import java.util.Scanner;

class Pattern
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of stars");
int u=s.nextInt();
for(int i=0;i<u;i++)
{
int j=0;
while(j<=i)
{
System.out.print("* ");
j++;
}
System.out.print("\n");
}
}
}