package com.develogical;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class RecentlyUsedListTest {
	@Test 
	public void shouldBeEmptyWhenInitialised() {
		RecentlyUsedList rul = new RecentlyUsedList();
		assertThat(rul.length(), equalTo(0));
	}

}
