// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		int currentValue= Math.abs(Integer.parseInt(args[0]));
		double rate= Double.parseDouble(args[1]);
		int years= Math.abs(Integer.parseInt(args[2]));
		double rate1 =(rate/100.0)+1;
		double futureval = currentValue * Math.pow(rate1, years);
		System.out.println("After " + years + " years, a $" +currentValue +" saved at " + (double)rate + "% will yield $" + (int)futureval);

	}
}
