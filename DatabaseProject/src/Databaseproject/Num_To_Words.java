package Databaseproject;

public class Num_To_Words {
	private int ones;
	private int tens;
	private int ones_01;
	private int tens_01;
	private int hundreds;
	private int thousands;
	private int lakhs;
	private int crores;

	private String ones_words;
	private String tens_words;
	private String hundreds_words;
	private boolean flag = false;

	private int i = 0;

	public String getOnesForZero(int tens) {

		if (tens == 1)
			return " one";
		else if (tens == 2)
			return " Two";
		else if (tens == 3)
			return " Three";
		else if (tens == 4)
			return " Four";
		else if (tens == 5)
			return " Five";
		else if (tens == 6)
			return " Six";
		else if (tens == 7)
			return " Seven";
		else if (tens == 8)
			return " Eight ";
		else if (tens == 9)
			return " Nine ";
		return " ";

	}

	public String getOnesForOne(int tens) {

		if (tens == 0)
			return " Ten ";
		else if (tens == 1)
			return " Eleven ";
		else if (tens == 2)
			return " Twelve ";
		else if (tens == 3)
			return " Thirteen ";
		else if (tens == 4)
			return " Fourteen ";
		else if (tens == 5)
			return " Fifteen ";
		else if (tens == 6)
			return " Sixteen ";
		else if (tens == 7)
			return " Seventeen ";
		else if (tens == 8)
			return " Eighteen ";
		else if (tens == 9)
			return " Nineteen ";
		return " ";

	}

	public String getOnes(int ones) {

		if (ones == 2)
			return " Twenty ";
		else if (ones == 3)
			return " Thirty ";
		else if (ones == 4)
			return " Fourty ";
		else if (ones == 5)
			return " Fifty ";
		else if (ones == 6)
			return " Sixty ";
		else if (ones == 7)
			return " Seventy ";
		else if (ones == 8)
			return " Eighty ";
		else if (ones == 9)
			return " Ninety ";
		return " ";

	}

	public String getTens(int tens) {
		if (tens == 1)
			return " One ";
		else if (tens == 2)
			return " Two ";
		else if (tens == 3)
			return " Three ";
		else if (tens == 4)
			return " Four ";
		else if (tens == 5)
			return " Five ";
		else if (tens == 6)
			return " Six ";
		else if (tens == 7)
			return " Seven ";
		else if (tens == 8)
			return " Eight ";
		else if (tens == 9)
			return " Nine ";

		return "";
	}
	
	

	public String num_To_Words(int num) {
		boolean minus = false;

		if (num < 0) {
			num = (-1) * num;
			minus = true;

		}
		String word = " ";
		ones_01 = num % 10;
		tens_01 = (num / 10) % 10;
		hundreds = (num / 100) % 10;
		thousands = (num / 1000) % 100;
		lakhs = (num / 100000) % 100;
		crores = (num / 10000000) % 100;

		if (crores > 0) {
			ones = (crores / 10) % 10;
			tens = (crores % 10);
			if (ones == 0)
				word = word + getOnesForZero(tens) + " crore ";
			else if (ones == 1)
				word = word + getOnesForOne(tens) + " crore ";
			else
				word = word + getOnes(ones) + getTens(tens) + " crore ";
			flag = true;
		}

		if (lakhs > 0) {
			ones = (lakhs / 10) % 10;
			tens = (lakhs % 10);
			if (ones == 0)
				word = word + getOnesForZero(tens) + " lakh ";
			else if (ones == 1)
				word = word + getOnesForOne(tens) + " lakh ";
			else
				word = word + getOnes(ones) + getTens(tens) + " lakh ";
			flag = true;
		}

		if (thousands > 0) {

			ones = (thousands / 10) % 10;
			tens = (thousands % 10);

			if (ones == 0)
				word = word + getOnesForZero(tens) + " thousand ";
			else if (ones == 1)
				word = word + getOnesForOne(tens) + " thousand ";
			else
				word = word + getOnes(ones) + getTens(tens) + " thousand ";
			flag = true;
		}
		if (hundreds > 0) {
			word = word + getTens(hundreds) + " hundred ";
			flag = true;
		}

		if ((tens_01 != 0 || ones_01 != 0) && flag == true) {

			if (tens_01 == 0)
				word = word + " and " + getOnesForZero(ones_01);
			else if (tens_01 == 1)
				word = word + " and " + getOnesForOne(ones_01);
			else
				word = word + " and " + getOnes(tens_01) + getTens(ones_01);
			flag = false;

		} else if (ones_01 == 0 && tens_01 == 0)
			word = word;
		else if ((tens_01 != 0 || ones_01 != 0) && flag == false) {
			if (tens_01 == 0)
				word = word + getOnesForZero(ones_01);
			else if (tens_01 == 1)
				word = word + getOnesForOne(ones_01);
			else
				word = word + getOnes(tens_01) + getTens(ones_01);
		}
		
		
		
		
		
		if (minus) {
			word = "minus" + word;
			return word.trim();
		} else
			return word;
	}

}
