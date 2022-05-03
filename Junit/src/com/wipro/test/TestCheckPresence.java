package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence {

	@Test
	public void testCheckPresence() {
		DailyTasks d=new DailyTasks();
		assertTrue(d.checkPresence("Wipro", "r"));
		//fail("Not yet implemented");
	}

}
