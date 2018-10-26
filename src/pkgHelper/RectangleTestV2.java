package pkgHelper;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class RectangleTestV2 {

	@Test
	public void RecConstructTest() {
		Rectangle t = new Rectangle(1,2);
		assertEquals(1,t.getWidth());
		assertEquals(2,t.getLength());
	}
	@Test
	public void RecGetWidth() {
		Rectangle t =new Rectangle(1,2);
		assertEquals(1,t.getWidth());
		
	}
	@Test 
	public void RecGetLength() {
		Rectangle t = new Rectangle(1,2);
		assertEquals(2,t.getLength());
	}
	@Test
	public void RecSetLength() {
		Rectangle t = new Rectangle(1,2);
		t.setLength(3);
		assertEquals(3,t.getLength());
	}
	@Test
	public void RecSetWidth() {
		Rectangle t = new Rectangle(1,2);
		t.setWidth(3);
		assertEquals(3,t.getWidth());
	}
	@Test
	public void RecArea() {
		Rectangle t = new Rectangle(1,2);
		assertEquals(2,t.area(),0.05);
	}
	@Test
	public void RecPer() {
		Rectangle t = new Rectangle(1,2);
		assertEquals(6,t.perimeter(),0.05);
	}
	@Test
	public void RecCompare() {
		Rectangle t1 = new Rectangle(1,7);
		Rectangle t2 = new Rectangle(3,4);
		Rectangle t3 = new Rectangle(1,1);
		Rectangle t4 = new Rectangle(2,3);
		Rectangle t5 = new Rectangle(3,6);
		Rectangle t6 = new Rectangle(1,1);
		Rectangle[] answer = new Rectangle[6];
		answer[1] = t6;answer[0]= t3;answer[2]= t4;answer[3]= t1;
		answer[4]= t2;answer[5]= t5;
		ArrayList<Rectangle> recs = new ArrayList<Rectangle>();
		recs.add(t1);
		recs.add(t2);
		recs.add(t3);
		recs.add(t4);
		recs.add(t5);
		recs.add(t6);
		Collections.sort(recs);
		assertArrayEquals(answer,recs.toArray());
	}
	

}
