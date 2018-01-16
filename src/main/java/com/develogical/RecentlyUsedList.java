package com.develogical;

public class RecentlyUsedList {

    private int length;

    RecentlyUsedList() {
        length=0;
    }

    public void add (int term) {
        length++;
    }
    public int getLength() {
		return length;
	}
}
