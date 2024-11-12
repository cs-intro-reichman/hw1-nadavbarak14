// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
        double interestRate = Double.parseDouble(args[1]) / 100.0;
        int durationYears = Integer.parseInt(args[2]);

        double futureValue = currentValue * Math.pow(1 + interestRate, durationYears);
        System.out.println("After " + durationYears + " years, a $" + currentValue
                           + " saved at " + (interestRate * 100) + "% will yield $"
                           + (int) futureValue);
    }
	
}