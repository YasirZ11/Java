import java.util.Scanner;
public class ExQues {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num,sum;
		sum=in.nextInt();
		num=sum;
		while (num!=-1) {
			num=in.nextInt();
			sum=sum+2*num;
			System.out.println("Sum ="+sum);
		}
		
	}
}
