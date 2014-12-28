package projecteuler.problem31;

public class CoinSums {

	/**
	 * Author: James Norcross
	 * Date: 12/28/14
	 * Purpose: Project Euler problem 31
	 * Description: counts the number of ways to create 2 pounds from British coins with values
	 * of 2 pounds or less
	 */
	
	private static int count;
	
	public static void main(String[] args) {

	
		int[] cashDrawer = {1,2,5,10,20,50,100,200};
		int value=200, maxSlot=7;
		count = 0;
		
		// make change starting with every slot as max slot
		for (int i=maxSlot; i>=0; i--)
			makeChange(value, i, cashDrawer);
		
		System.out.println("The number of ways to make 2 pounds is " + count);
	
	}
	
	static void makeChange(int value, int maxSlot, int[] cashDrawer) {
		// add a bill to the change and calculate remainder
		value -= cashDrawer[maxSlot];
		
		// remaining value is zero then have successfully made change, increment count of number of ways
		if (value == 0) {
			count++;	
		}
		else {
			// if have remaining value try and make change for it with every slot as maximum available
			if (value > 0) {
				for (int i = maxSlot; i>=0; i--) {
					makeChange(value, i, cashDrawer);
				}
			}
			// if value is negative terminate without incrementing count
			else {
			}
		}
	}

}
