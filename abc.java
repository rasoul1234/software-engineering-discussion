import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      		System.out.println("the smallest number is "+smallest()+"\n");
		isOdd();
	}
	static double smallest() {
		Scanner input=new Scanner(System.in);
		System.out.println("enter your first number"+"\n");
		double x=input.nextDouble();
		System.out.println("enter your second number"+"\n");
		double y=input.nextDouble();
		System.out.println("enter your third number"+"\n");
		double z=input.nextDouble();
		System.out.println("enter your second number"+"\n");
		double f=input.nextDouble();
		System.out.println("enter your third number"+"\n");
		double o=input.nextDouble();
		return Math.min(Math.min(x, y), Math.min(Math.min(f, o), z));
	}

	public static int minFunction(int n1, int n2) {
		int min;
		if(n1>n2) 
			 min=n2;
		
		else 
			min=n1;
			
		
		return min;
	}

// is Odd function added
	static int isOdd() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = input.nextInt();
		do {
			x=input.nextInt();
			if(x%2!=0)
				System.out.println("the number is odd");
			else 
				System.out.println("the number is even");
		}while(x!=-1);
		return x;
	}

}


