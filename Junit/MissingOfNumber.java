
public class MissingOfNumber {

	public int findMissing(int[] missingNumber) {
		int currentTotal = 0;
		for(int counter = 0;counter < missingNumber.length ; counter++){
			currentTotal = currentTotal+missingNumber[counter];
			
		}
		int expectedTotal= (missingNumber.length*(missingNumber.length+1))/2;
		int result = expectedTotal - currentTotal;
		return result;
		}	

}
