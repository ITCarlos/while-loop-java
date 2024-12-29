import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		int sum = 0;
		while (x != 0) {
			sum = sum + x;
			x = input.nextInt();
		}
		
		System.out.println(sum);
		
		input.close();

	}

}
