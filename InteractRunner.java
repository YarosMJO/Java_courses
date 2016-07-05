import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class InteractRunner {

	private double result = 0;
	private double data = 0;
	private boolean povtor1 = false;
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	ArrayList<Double> list = new ArrayList<Double>();

	public void first() throws IOException {
		try {
			Double first = Double.parseDouble(reader.readLine());
			list.clear();
			list.add(first);
			if (povtor1 == false) {
				// povtor1=true;

				symbol();

			}
			if (povtor1 != true) {
				povtor1 = false;

				symbol();

			}
		} catch (NumberFormatException err) {
			System.out.println("You have entered incorrect data1!");
		}
	}

	public void second() throws IOException {

		try {
			double second = Double.parseDouble(reader.readLine());
			list.add(second);

		} catch (NumberFormatException err) {
			System.out.println("You have entered incorrect data2!");
		}
	}

	public void symbol() throws IOException {
		try {
			String symbols = reader.readLine();
			char saa = symbols.charAt(0);
			if (saa == '=') {
				if (povtor1 == true) {
					System.out.println(data);
				} else
					System.out.println(result);
				System.exit(0);
			}
			if (povtor1 == true) {
				first();
				// symbol();
			}
			while (true) {
				switch (saa) {
				case '+':

					if (povtor1 == true) {
						plus();
					}
					second();
					plus();
					list.clear();
					break;
				case '-':
					if (povtor1 == true) {
						minus();
					}
					second();
					minus();
					list.clear();
					break;
				case '*':
					if (povtor1 == true) {
						mult();
					}
					second();
					mult();
					list.clear();
					break;
				case '/':
					if (povtor1 == true) {
						divide();
					}
					second();
					divide();
					list.clear();
					break;

				}
				if (symbols.matches("[0-9]*") || symbols.matches("[a-zA-Z]+$")) {

					if (symbols.matches("exit")) {
						System.exit(0);
					}

					System.out.println("You have entered incorrect data3!");
					break;

				}
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("retry the request please! ss");
		}

		catch (Exception err) {
			System.out.println("retry the request please! ");

		}
	}

	public void plus() throws IOException {
		if (povtor1 == true) {
			data = data + list.get(0);
			symbol();
		} else {
			result = list.get(0) + list.get(1);
			data = result;
			povtor1 = true;
			symbol();

		}

	}

	public void minus() throws IOException {
		if (povtor1 == true) {
			data = data - list.get(0);
			symbol();
		} else {
			result = list.get(0) - list.get(1);
			data = result;
			povtor1 = true;
			symbol();

		}
	}

	public void mult() throws IOException {
		if (povtor1 == true) {
			data = data * list.get(0);
			symbol();
		} else {
			result = list.get(0) * list.get(1);
			data = result;
			povtor1 = true;
			symbol();

		}
	}

	public void divide() throws IOException {
		if (povtor1 == true) {
			data = data / list.get(0);
			symbol();
		} else {
			result = list.get(0) / list.get(1);
			data = result;
			povtor1 = true;
			symbol();

		}
	}

	public double getResult() {
		return this.result;
	}
}