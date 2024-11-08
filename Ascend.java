// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int randomnum= Integer.parseInt(args[0]);
		int ran1 =(int) ((1 + randomnum) * Math.random());
		int ran2 =(int) ((1 + randomnum) * Math.random());
		int ran3 =(int) ((1 + randomnum) * Math.random());
		System.out.println(ran1 + " " +ran2 + " " +ran3);
		int min = Math.min(Math.min(ran1, ran2), ran3);
		int max = Math.max(Math.max(ran1, ran2), ran3);
		int mid = (ran1 + ran2 + ran3) - (min +max);
		System.out.println(min + " " + mid + " " +max);




	}
}
