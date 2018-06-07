import java.util.Scanner;

class Tables
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("which table u want print");
int t=s.nextInt();
System.out.print("Upto which number u want to print");
int u=s.nextInt();
for(int i=1;i<=u;i++)
{
System.out.print(i+" * "+t+" = ");
System.out.println(i*t);
}
}
}