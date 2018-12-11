
public class PalindromeOfNumber {

	public boolean checkPalindrome(int i) {
		int temp=i;
		int sum=0;
		if(i>=10)
		{
		while(i!=0)
		{
			int remainder=i%10;
			sum=sum*10+remainder;
			i=i/10;
		}
		return sum==temp;
		}
		return false;
	}

}
