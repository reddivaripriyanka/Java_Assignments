
public class PalindromeOfString {

	public String[] isPalindrome(String[] palindromeArray) {
		 int counter;
			int i=0;
			int worldlentgh;
			for(counter=0;counter<palindromeArray.length;counter++)
			{
				String reverseString1="";
				String temp=palindromeArray[counter];
				int length=temp.length();
				for(worldlentgh=length-1;worldlentgh>=0;worldlentgh--)
				{
					reverseString1=reverseString1+temp.charAt(worldlentgh);
				}
			
				if(temp.equals(reverseString1))
				{
					palindromeArray[i]=palindromeArray[counter];
					i++;
				}
			}
			String[] s=new String[i];
			for(int j=0;j<s.length;j++)
			{
				s[j]=palindromeArray[j];
			}
			return s;
		}

	public int[] isLength(String[] answer)
	{
		int s[]=new int[answer.length];
		for(int i=0;i<s.length;i++)
		{
			s[i]=answer[i].length();
		}
	  return s;
	}
}
