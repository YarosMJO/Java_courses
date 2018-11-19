package ATM;

public class Parser {
	
	//class which makes checking
	
	private int sum = 0;
	private boolean check;

	public boolean validator(int sum) {
		if (sum > 4 && sum <= Refuge.limit && sum<=Refuge.cashLimit && (sum % 2 == 0 || sum % 5 == 0)) {
			check = true;
			setSum(sum);
		}
		return check;
	}

	public int getSum() {
		return this.sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
}
