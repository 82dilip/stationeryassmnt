package com.epam.training.stationery.util;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.epam.training.stationery.domain.Stationery;

public class ChainedComparator implements Comparator<Stationery> {
	 
    private List<Comparator<Stationery>> listComparators;
 
    @SafeVarargs
    public ChainedComparator(Comparator<Stationery>... comparators) {
        this.listComparators = Arrays.asList(comparators);
    }
 
    @Override
    public int compare(Stationery obj1, Stationery obj2) {
        for (Comparator<Stationery> comparator : listComparators) {
            int result = comparator.compare(obj1, obj2);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }
}
