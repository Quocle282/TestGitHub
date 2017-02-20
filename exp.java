package hw1;
import java.util.Scanner;
public class exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("inputs the number interger x: ");
		int numberX= sc.nextInt(); double z;
		 z=(double)Math.pow(Math.E,numberX+Math.sin(2*numberX)-Math.pow(numberX, 5));
		 System.out.println("Z= "+z );
	}

}
