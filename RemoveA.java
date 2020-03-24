package junitepam;

public class RemoveA {

	public String remove(String input) {
		char firstchar, secondchar;
		int stringlength = input.length();
		if(stringlength >= 2) {
			firstchar = input.charAt(0);
			secondchar = input.charAt(1);
			if(firstchar == 'A') {
				if (secondchar == 'A') {
					return input.substring(2);
				}else {
					return input.substring(1);
				}
			}else if(secondchar == 'A') {
				return firstchar + input.substring(2);
			}else {
				return input;
			}
		}else if (stringlength == 1) {
			firstchar = input.charAt(0);
			if (firstchar == 'A') {
				return "";
			}else {
				return input;
			}
		}
		return "";
	}
}
