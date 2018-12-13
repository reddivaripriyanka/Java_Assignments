
public class DeleteBySpecifiedString {

	public String isDelete(String s, String k, int p) {
			 s =s.trim().replaceAll(" +", " ");
			 String splitArray[]=s.split(" ");
			 String newSentence="";
			 for(int position=0;position<splitArray.length;position++){
				// System.out.println(splitArray[position]);
				 if(position==p){
					 continue;
				 }else{
					 if(position==splitArray.length-1)
						 newSentence=newSentence.concat(splitArray[position]);
					 else
						 newSentence=newSentence.concat(splitArray[position]+" ");
						
				 }
			 }
			return newSentence;
			
	}

}
