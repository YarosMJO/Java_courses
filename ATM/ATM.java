package ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ATM {

	public static void main(String[] args) throws IOException {
		
		Parser a = new Parser();
		String readSum = null;
		int sum = 0;
		boolean notNumber = false;

		Refuge ref = new Refuge(); 
		HashMap<Integer, Integer> cash = new HashMap<Integer, Integer>();

		cash.put(500, 2);
		cash.put(200, 5);
		cash.put(100, 7);
		cash.put(50, 8);
		cash.put(20, 10);
		cash.put(10, 15);
		cash.put(5, 21);

		ref.setValue(cash);//put cash in bank

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		while (!notNumber) {//verify

			System.out.println("Enter sum:");
			readSum = reader.readLine();
			try {
				sum = Integer.parseInt(readSum);
				if (a.validator(sum)) {
					notNumber = true;
				} else
					throw new NumberFormatException();

			} catch (NumberFormatException e) {
				System.out.println("Sum is not correct!");
			}

		}
		ref.getValue(sum);// say how much to take

	}

}
