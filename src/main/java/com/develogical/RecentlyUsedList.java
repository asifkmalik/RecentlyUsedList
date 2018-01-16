package com.develogical;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class RecentlyUsedList {

    private LinkedList<Integer> list;

    RecentlyUsedList() {

        list = new LinkedList<Integer>();
    }

    public void add (int term) {
        for (Integer x : list) {
            if (x.intValue() == term) {
                list.remove(x);
                list.addFirst(new Integer(term));
                return;
            }
        }

        list.addFirst(new Integer (term));
    }

    public int getLength() {
        return list.size();
	}

	public int retrieve () {
        return list.get(0).intValue();
    }

    public int retrieve(int nth) {
        return list.get(nth).intValue();
    }
}
