import java.util.Scanner;

class mango{
	public static void main (String args[]){
		Scanner duck = new Scanner(System.in);
		double dnum, anum, answer;
		System.out.println("Enter different num: ");
		dnum = duck.nextDouble();
		System.out.println("Enter another num: ");
		anum = duck.nextDouble();
		answer = dnum + anum;
		System.out.println(answer);

	}	
}