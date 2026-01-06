package PracticePgms.Java67;

public class RomantoInteger {

	public static void main(String args[]) {
		String s = "CMXVI";
		System.out.print(romanToDecimal(s));
	}

	public static int romanToDecimal(String s) {
		char[] a = s.toCharArray();
		int strlength = s.length();
		int result = 0;
		int afterNo = 0;

		for (int i = 0; i <= strlength - 1; i++) {

			// System.out.println(i);
			// System.out.println(a[i]);

			int firstNo = storeRoman(a[i]);
			// System.out.println(temp);
			if (strlength == 1)
				result += firstNo;
			else if (i == strlength - 1)
				result += firstNo;
			else {
				afterNo = storeRoman(a[i + 1]);
				// System.out.println(afterNo);
				// System.out.println(temp);

				if (firstNo < afterNo)
					result -= firstNo;
				else
					result += firstNo;

			}
			// System.out.println(result);
		}
		return result;

	}

	public static int storeRoman(char n) {
		int value = 0;

		switch (n) {
		case 'I':
			value = 1;
			break;
		case 'V':
			value = 5;
			break;
		case 'X':
			value = 10;
			break;
		case 'L':
			value = 50;
			break;
		case 'C':
			value = 100;
			break;
		case 'D':
			value = 500;
			break;
		default:
			value = 1000;
			break;

		}
		return value;

	}
}