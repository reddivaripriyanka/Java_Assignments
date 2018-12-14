import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RectangleOfObject {
	private RectangleOfAnObject rectangleOne,rectangleTwo;
	
	@Test
	public void areaOfrectanle() {
		rectangleOne=new RectangleOfAnObject(3,4);
		rectangleTwo=new RectangleOfAnObject(3,4);
		assertEquals(rectangleOne.isAreaOne(),rectangleTwo.isAreaOne(),2);
		
	}
	
	@Test
	public void areaOfRectanglesAreDiffrent() {
		rectangleOne=new RectangleOfAnObject(3,4);
		rectangleTwo=new RectangleOfAnObject(3,8);
		boolean result=rectangleOne.compareAreaOfObject(rectangleOne,rectangleTwo);
		assertEquals(false,result);
	}
	
	@Test
	public void areaOfRectanglesAreSame() {
		rectangleOne=new RectangleOfAnObject(3,4);
		rectangleTwo=new RectangleOfAnObject(3,5);
		boolean result=rectangleOne.compareAreaOfObject(rectangleOne,rectangleTwo);
		assertEquals(false,result);
	}
	

}
