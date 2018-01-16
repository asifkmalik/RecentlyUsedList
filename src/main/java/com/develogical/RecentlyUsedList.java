package com.develogical;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class RecentlyUsedList {

    private LinkedList<Integer> list;

    RecentlyUsedList() {

        list = new LinkedList<Integer>();
    }

    public void add (int term) {
        list.add(new Integer (term));
    }

    public int getLength() {
        return list.size();
	}

	public int retrieve () {
        return list.get(list.size()-1).intValue();
    }
}
