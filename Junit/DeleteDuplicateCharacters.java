
public class DeleteDuplicateCharacters {

	public String isString(String string) {
		String result = "";
	    for (int i = 0; i < string.length(); i++) {
	        if(!result.contains(String.valueOf(string.charAt(i)))) {
	            result += String.valueOf(string.charAt(i));
	        }
	    }
	    return result;
	}
	    }

