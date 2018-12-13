
public class MultidimensionalOfArray {

	public boolean isSearchElement(int[][] matrix, int searchElement) {
		int counter,counterOne;
		boolean isValue=false;
	 for(counter=0;counter<matrix.length;counter++)
	 {
		 for(counterOne=0;counterOne<matrix[counter].length;counterOne++)
		 {
			 if(matrix[counter][counterOne]==searchElement)
				 isValue=true;
		 }
	 }
		return isValue;
	}

}
