package com.epam.training.stationery.util;

import java.util.Comparator;

import com.epam.training.stationery.domain.Stationery;

public class PriceComparator implements Comparator<Stationery> {

	@Override
	public int compare(Stationery stationeryObj1, Stationery stationeryObj2) {
		
		return stationeryObj1.getPrice() - stationeryObj2.getPrice();
	}

}
