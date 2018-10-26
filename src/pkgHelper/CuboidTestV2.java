package pkgHelper;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class CuboidTestV2 {

	@Test
	public void CuboidConstructTest(){
		Cuboid c = new Cuboid (1,2,3);
		assertEquals(3,c.getDepth());
		assertEquals(2,c.getLength());
		assertEquals(1,c.getWidth());
		assertTrue(c instanceof Cuboid);
	}
	@Test
	public void GetDepthTest() {
		Cuboid c = new Cuboid(1,2,3);
		assertEquals(3,c.getDepth());
	}
	@Test
	public void SetDepthTest() {
		Cuboid c = new Cuboid(1,2,3);
		c.setDepth(4);
		assertEquals(4,c.getDepth());
	}
	@Test
	public void CubeAreaTest() {
		Cuboid c = new Cuboid(1,2,3);
		assertEquals(22,c.area(),0.05);
	}
	@Test(expected=UnsupportedOperationException.class)
	public void CubePerTest() {
		Cuboid c = new Cuboid(1,2,3);
		c.perimeter();
	}
	@Test
	public void CubeVolTest() {
		Cuboid c = new Cuboid(1,2,3);
		assertEquals(6,c.volume(),0.05);
	}
	@Test
	public void SBATest() {
		Cuboid c1 = new Cuboid(1,1,1);
		Cuboid c2 = new Cuboid(2,2,2);
		Cuboid c3 = new Cuboid(3,3,3);
		Cuboid c4 = new Cuboid(4,4,4);
		Cuboid[] answer = new Cuboid[4];
		answer[0] = c1;answer[1]=c2;answer[2]=c3;answer[3]=c4;
		ArrayList<Cuboid> cubes = new ArrayList<Cuboid>();
		cubes.add(c2);cubes.add(c1);cubes.add(c4);cubes.add(c3);
		
		System.out.println();
		Collections.sort(cubes, new Cuboid.SortByArea());
		
		assertArrayEquals(answer,cubes.toArray());
		}
	
	@Test
	public void SBVTest() {
		Cuboid c1 = new Cuboid(1,1,1);
		Cuboid c2 = new Cuboid(2,2,2);
		Cuboid c3 = new Cuboid(3,3,3);
		Cuboid c4 = new Cuboid(4,4,4);
		Cuboid[] answer = new Cuboid[4];
		answer[0] = c1;answer[1]=c2;answer[2]=c3;answer[3]=c4;
		ArrayList<Cuboid> cubes = new ArrayList<Cuboid>();
		cubes.add(c2);cubes.add(c1);cubes.add(c4);cubes.add(c3);
		
		System.out.println();
		Collections.sort(cubes, new Cuboid.SortByVolume());
		
		assertArrayEquals(answer,cubes.toArray());
		}
	

}
