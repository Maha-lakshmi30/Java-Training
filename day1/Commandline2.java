public class Commandline2
{
public static void main(String args[])
{
if(args.length==2)
{
int num1=Integer.parseInt(args[0]);
int num2=Integer.parseInt(args[1]);
int sum=num1+num2;
System.out.println("sum is "+sum);
}
else
{
System.out.println("The input length is expected to be 2");
}
}
}