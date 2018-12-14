
public class RectangleOfAnObject {
 public double length;
 public double bredth;
 	public RectangleOfAnObject(int length,int bredth)
 	{
 		this.length=length;
 		this.bredth=bredth;
 		
 	}
	public  double isAreaOne() {
		return length*bredth;
	}
	public boolean compareAreaOfObject(RectangleOfAnObject rectangleOne, RectangleOfAnObject rectangleTwo) {
		boolean result=false;
		if(rectangleOne.isAreaOne()==rectangleTwo.isAreaOne())
			result = true;
		else
			result = false;
		return result;
	}
}
