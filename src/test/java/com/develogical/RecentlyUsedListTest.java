package com.develogical;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class RecentlyUsedListTest {
	@Test 
	public void shouldBeEmptyWhenInitialised() {
		RecentlyUsedList rul = new RecentlyUsedList();
		assertThat(rul.getLength(), equalTo(0));
	}

	@Test
	public void shouldAddThingsToList() {
		RecentlyUsedList rul = new RecentlyUsedList();
		rul.add(1);
		assertThat(rul.getLength(), equalTo(1));
		rul.add(1);
		assertThat(rul.getLength(), equalTo(2));
	}
}
