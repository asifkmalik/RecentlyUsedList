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
		assertThat(rul.getLength(), equalTo(1));
	}

	@Test
	public void shouldRetrieveThingsFromList() {
		RecentlyUsedList rul = new RecentlyUsedList();

		rul.add(77);
		assertThat(rul.retrieve(), equalTo(77));
	}

	@Test
	public void mostRecentItemShouldbeFirst() {
		RecentlyUsedList rul = new RecentlyUsedList();

		rul.add(77);
		rul.add(80);
		rul.add(81);

		assertThat(rul.retrieve(), equalTo(81));
	}

	@Test
	public void nthRecentItem() {
		RecentlyUsedList rul = new RecentlyUsedList();

		rul.add(77);
		rul.add(66);
		rul.add(55);

		assertThat(rul.retrieve(1), equalTo(66));
	}

	@Test
	public void duplicateInsertionsMovedRatherThanAdded () {

		RecentlyUsedList rul = new RecentlyUsedList();

		rul.add(77);
		rul.add(66);
		rul.add(77);

		assertThat(rul.retrieve(0), equalTo(77));
		assertThat(rul.retrieve(1), equalTo(66));

	}
}
