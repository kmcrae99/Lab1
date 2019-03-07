package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void doesElementExist_Test1() {
		
		int [] arr = {1,2,3,4,5};
		int iValue = 5;
		boolean bExpected = true;
		boolean bActual = LatinSquare.doesElementExist(arr, iValue);
		
		assertEquals(bExpected,bActual);
		
		
	}
	
	@Test
	public void doesElementExist_Test2() {
		
		int [] arr = {1,2,3,4,5};
		int iValue = 5;
		boolean bExpected = false;
		boolean bActual = LatinSquare.doesElementExist(arr, iValue);
		
		assertEquals(bExpected,bActual);
		
		
	}
	
	@Test
	public void hasDuplicates_Test1() {
		
		int [] arr = {1,2,3,4,5};
		
		boolean bExpected = false;
		boolean bActual = LatinSquare.hasDuplicates(arr);
		
		assertEquals(bExpected,bActual);
		
		
	}
	
	@Test
	public void hasDuplicates_Test2() {
		
		int [] arr = {1,2,1,4,5};
		
		boolean bExpected = true;
		boolean bActual = LatinSquare.hasDuplicates(arr);
		
		assertEquals(bExpected,bActual);
		
		
	}
	
	@Test
	public void hasDuplicates_Test3() {
		
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = {1,2,3,4,5};

		
		boolean bExpected = true;
		boolean bActual = LatinSquare.hasDuplicates(arr1);
		
		assertEquals(bExpected,bActual);
		
		assertTrue(0, Arrays.compare(arr1, arr2));
		
		
	}

}
