// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int randomnum= Integer.parseInt(args[0]);
		int ran1 =(int) ((1 + randomnum) * Math.random());
		int ran2 =(int) ((1 + randomnum) * Math.random());
		int ran3 =(int) ((1 + randomnum) * Math.random());
		int min = Math.min(Math.min(ran1, ran2), ran3);
		int mid = Math.min(Math.max(ran1, ran2), ran3);
		int max = Math.max(Math.max(ran1, ran2), ran3);
		System.out.println(min);
		System.out.println(mid);
		System.out.println(max);




	}
}
