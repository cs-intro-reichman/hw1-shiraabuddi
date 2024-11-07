// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int orignum= Integer.parseInt(args[0]);
		int hundreds = orignum/100;
		int tens = (orignum/10)%10;
		int ones =(orignum%10)%10;

		System.out.println("hundreds " + hundreds + tens + ones);
	}
}
