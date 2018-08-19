package janani;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,n,n1;
System.out.println("enter the number");
Scanner ja=new Scanner(System.in);
n=ja.nextInt();
n1=ja.nextInt();
a=(int)Math.pow(n,n1);
System.out.println(a);
}
}
