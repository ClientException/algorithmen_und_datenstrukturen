package de.clientexception.listen;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import de.clientexception.listen.List.ElemTest;

/**
* @author ClientException
* @project Listen
* @package de.clientexception.listen
*
* @date 03.04.2025
* @time 17:06:22
*
*
* @web www.worldcrafter.de
* @mail development@worldcrafter.de
*
*/

class ListTest {
	
	private List list;
	
	@Before
	public void init() {
		list = new List();
	}
	
	@Test
	void testInsert() {
		System.out.println("Test");
		assertTrue(false);
		
//		assertEquals(5, 7);
		
	}
	
	@Test
	void testDelete() {
		Pos p0 = list.insert(list, 0);
		
		Pos p1 = list.insert(list.front(), 1);
		Pos p2 = list.next(p1);
		list.insert(p2, 2);
		
		List l = list.delete(p1);
		assertTrue(l.find(new ElemTest() {
			
			@Override
			public boolean check(int l) {
				return l == 1;
			}
		}) == null);
		
		assertTrue(list.front() != null);
		assertTrue(list.next(list.front()) != null);
		
	}

}



