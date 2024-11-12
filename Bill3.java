// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String diner1 = args[0];
        String diner2 = args[1];
        String diner3 = args[2];
        int totalBill = Integer.parseInt(args[3]);

        double share = Math.ceil(totalBill / 3.0);
        System.out.println("Dear " + diner3 + ", " + diner2 + ", and " + diner1 + ": pay " + share + " Shekels each");
	}
}
