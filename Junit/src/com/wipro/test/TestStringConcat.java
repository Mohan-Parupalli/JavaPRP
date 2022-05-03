package com.wipro.test;
import com.wipro.task.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestStringConcat {

	@Test
	public void testDoStringConcat() {
		DailyTasks d=new DailyTasks();
		assertEquals("wip ro", d.doStringConcat("wip","ro"));
		//fail("Not yet implemented");
	}

//	@Test
//	public void testSortValues() {
//		int sorted[]= {1,2,3};
//		int unsorted[]= {3,2,1};
//		DailyTasks d=new DailyTasks();
//		assertArrayEquals(sorted,d.sortValues(unsorted));
//		
//		
//		//fail("Not yet implemented");
//	}
//
//	@Test
//	public void testCheckPresence() {
//		DailyTasks d=new DailyTasks();
//		assertEquals(true,d.checkPresence("Wipro", "r"));
//		//fail("Not yet implemented");
//	}

}
