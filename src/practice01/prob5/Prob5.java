package practice01.prob5;

public class Prob5 {
	public static void main (String args[]) {
		for(int i=1; i<=99; i++) {
			String number = Integer.toString(i);
			String clap = "짝짝짝짝짝";
			int count = 0;

			if(number.contains("3") || number.contains("6") || number.contains("9")) {
				for(int j=0; j<=number.length()-1; j++) {
					if((number.charAt(j) == '3') || 
						(number.charAt(j) == '6') || 
						(number.charAt(j) == '9')) {
						count += 1;
					}
				}
				System.out.println(number +" "+ clap.substring(0, count));
			}
		}
	}
}
