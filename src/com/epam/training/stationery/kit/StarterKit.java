package com.epam.training.stationery.kit;

import java.util.Collections;
import java.util.List;

import com.epam.training.stationery.domain.Stationery;
import com.epam.training.stationery.util.ChainedComparator;
import com.epam.training.stationery.util.NameComparator;
import com.epam.training.stationery.util.PriceComparator;

public class StarterKit implements Kit {

	private List<Stationery> stationaryList;

	public StarterKit(List<Stationery> stationaryList) {
		
		this.stationaryList = stationaryList;
	}
	
	
	public List<Stationery> getStationaryList() {
		return stationaryList;
	}


	@Override
	public void addItems(Stationery kit) {
		stationaryList.add(kit);
		
	}


	@Override
	public List<Stationery> sortByPrice() {
		Collections.sort(stationaryList, new PriceComparator());
		return getStationaryList();
	}


	@Override
	public List<Stationery> sortByName() {
		Collections.sort(stationaryList, new NameComparator());
		return getStationaryList();
	}


	@Override
	public List<Stationery> sortByPriceAndName() {
		Collections.sort(stationaryList, 
				new ChainedComparator(new NameComparator(), new PriceComparator()));
		return getStationaryList();
	}


	
	
}
