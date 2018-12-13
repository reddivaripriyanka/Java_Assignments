
public class OccuranceOfGivenString {

	public int isOccuacenof(String[] names, String searchedString) {
		int occurance=0;
		for(int counter=0;counter<names.length;counter++)
		{
			if(names[counter]==searchedString)
				occurance++;
		}
		return occurance;
	}

}
