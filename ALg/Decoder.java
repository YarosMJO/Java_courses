package ALg;

public class Decoder {
	String rev;
	int Gmaslen;
	public Decoder(String rev) {
		this.rev = new StringBuffer(rev).reverse().toString();
		Gmaslen = rev.length();
	}

	

	public String Dec() {
		
		 final int La = 3;
		 final int Ba = 29;
		 int j = 0;
		 
		char Gmas[] = rev.toCharArray();	

		char[] Smas1 = new char[Gmaslen];

		for (int i = 0; i < Gmas.length; i++) {
			if (Gmas[i] >= 'a' && Gmas[i] <= 'm') {
				Smas1[j] = (char) (Gmas[i] + La);
				j++;
			} else if (Gmas[i] > 'm' && Gmas[i] <= 'z') {
				Smas1[j] = (char) (Gmas[i] + La);
				j++;
			} else if (Gmas[i] >= 'A' && Gmas[i] <= 'M') {
				Smas1[j] = (char) (Gmas[i] - Ba);
				j++;
			} else if (Gmas[i] > 'M' && Gmas[i] <= 'Z') {
				Smas1[j] = (char) (Gmas[i] - Ba);
				j++;
			}
		}

		int count = -1;
		for (int i = 0; i < Smas1.length; i++) {
			char ob = Smas1[i];
			for (int g = 0; g < Smas1.length; g++) {
				if (Smas1[g] == ob+50) {
					Smas1[i]=Smas1[g];
					//count++;
				}
			}
//			while (count > 0) {
//				Smas1[i] = (char) (Smas1[i] - 1);
//				count--;
//			}
//			count = -1;
		}

		String torev = new String(String.valueOf((Smas1)));
		System.out.println(torev);
		return torev;

}
}
