package ALg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coder {

	public static final int La = 3;
	public static final int Ba = 29;
	public static int j = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		String s = reader.readLine();
		char[] Gmas = s.toCharArray();
		int Gmaslen = Gmas.length;

		char[] Smas1 = new char[Gmaslen];

		for (int i = 0; i < Gmas.length; i++) {
			if (Gmas[i] >= 'a' && Gmas[i] <= 'm') {
				Smas1[j] = (char) (Gmas[i] - La);
				j++;
			} else if (Gmas[i] > 'm' && Gmas[i] <= 'z') {
				Smas1[j] = (char) (Gmas[i] - La);
				j++;
			} else if (Gmas[i] >= 'A' && Gmas[i] <= 'M') {
				Smas1[j] = (char) (Gmas[i] + Ba);
				j++;
			} else if (Gmas[i] > 'M' && Gmas[i] <= 'Z') {
				Smas1[j] = (char) (Gmas[i] + Ba);
				j++;
			}
		}

		int count = -1;
		for (int i = 0; i < Smas1.length; i++) {
			char ob = Smas1[i];
			for (int j = 0; j < Smas1.length; j++) {
				if (Smas1[j] == ob) {
					count++;
				}
			}
			while (count > 0) {
				Smas1[i] = (char) (Smas1[i] + 200);
				count--;
			}
			count = -1;
		}

		String torev = new String(String.valueOf((Smas1)));
		String rev=new StringBuffer(torev).reverse().toString();
		System.out.println(rev);
		    
		Decoder dec = new Decoder(rev);
		dec.Dec();
	}

}
