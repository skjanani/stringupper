package janani;
import java.util.Scanner;
public class Stringupper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int i,l;
		System.out.println("enter the string");
		Scanner ja=new Scanner(System.in);
		str=ja.nextLine();
		String str1[]=str.split("\\s");
		l=str1.length;
		for(i=0;i<l;i++){
			str1[i]=str1[i].substring(0,1).toUpperCase()+str1[i].substring(1);
			System.out.print(str1[i]+" ");
		}
	}

}
