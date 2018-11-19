package ATM;

import java.util.HashMap;

public class Refuge {
	private int five;
	private int ten;
	private int twenty;
	private int fifty;
	private int hundred;
	private int twohundred;
	private int fivehundred;
	public static int limit = 10000;
	public static int cashLimit=0;
	private int greenbackReturned;
	private int value;
	private int amount_five, amount_ten, amount_twenty, amount_fifty,
	amount_hundr, amount_twohundr, amount_fivehundr;
	private HashMap<Integer, Integer> rezult;

	public void getValue(int sum) {
		
		rezult = new HashMap<Integer, Integer>();
		value = sum;
		
		while (value > 0) {
			if ((value - 500) >= 0 && fivehundred - 500 >= 0) {
				value = value - 500;
				fivehundred = fivehundred - 500;
				amount_fivehundr++;
			} else if ((value - 200) >= 0 && twohundred - 200 >= 0) {
				value = value - 200;
				twohundred = twohundred - 200;
				amount_twohundr++;
			} else if ((value - 100) >= 0 && hundred - 100 >= 0) {
				value = value - 100;
				hundred = hundred - 100;
				amount_hundr++;
			} else if ((value - 50) >= 0 && fifty - 50 >= 0) {
				value = value - 50;
				fifty = fifty - 50;
				amount_fifty++;
			} else if ((value - 20) >= 0 && twenty - 20 >= 0) {
				value = value - 20;
				twenty = twenty - 20;
				amount_twenty++;
			} else if ((value - 10) >= 0 && ten - 10 >= 0) {
				value = value - 10;
				ten = ten - 10;
				amount_ten++;
			} else if ((value - 5) >= 0 && five - 5 >= 0) {
				value = value - 5;
				five = five - 5;
				amount_five++;
			}
		}

		rezult.put(5, amount_five);
		rezult.put(10, amount_ten);
		rezult.put(20, amount_twenty);
		rezult.put(50, amount_fifty);
		rezult.put(100, amount_hundr);
		rezult.put(200, amount_twohundr);
		rezult.put(500, amount_fivehundr);
		//displays the results
		for (HashMap.Entry<Integer, Integer> e : rezult.entrySet()) {
			System.out.print(e.getKey() + "   were   ");
			System.out.println(e.getValue());
		}

	}

	public void setValue(HashMap<Integer, Integer> value) {
		five = value.get(5) * 5;
		ten = value.get(10) * 10;
		twenty = value.get(20) * 20;
		fifty = value.get(50) * 50;
		hundred = value.get(100) * 100;
		twohundred = value.get(200) * 200;
		fivehundred = value.get(500) * 500;
		
		cashLimit=five+ten+twenty+fifty+hundred+twohundred+fivehundred;

	}

	public int getGreenback() {
		return greenbackReturned;
	}

}
