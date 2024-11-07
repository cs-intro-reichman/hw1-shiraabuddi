// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		int currentValue= Math.abs(Integer.parseInt(args[0]));
		int rate= Integer.parseInt(args[1]);
		int years= Math.abs(Integer.parseInt(args[2]));
		double rate1 =(rate/100.0)+1;
		System.out.println(rate1);
		double furureval = currentValue * Math.pow(rate1, years);
		System.out.println(furureval);

	}
}
