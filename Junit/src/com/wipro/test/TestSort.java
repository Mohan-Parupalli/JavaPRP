package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestSort {

	@Test
	public void testSortValues() {
		int sorted[]= {1,2,3};
		int unsorted[]= {3,2,1};
		DailyTasks d=new DailyTasks();
		assertArrayEquals(sorted,d.sortValues(unsorted));
		//fail("Not yet implemented");
	}

}
