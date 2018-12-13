
public class DistinctOfArrayElements {

	public boolean isDistictValue(int[] distinctArray, int k) 
	{
		int counter,counterOne,difference = 0;
		for(counter=0;counter<distinctArray.length;counter++)
		{
			for(counterOne=counter+1;counterOne<distinctArray.length;counterOne++)
			{
				if(distinctArray[counter]==distinctArray[counterOne])
				{
					difference=counterOne-counter;
				}
			}
		}
		
		if(difference<=k)
		return true;
		else
		return false;
	}

}
