package com.epam.training.stationery.kit;

import java.util.List;

import com.epam.training.stationery.domain.Stationery;

public interface Kit {

	public void addItems(Stationery kit);
	
	public List<Stationery> sortByPrice();
	
	public List<Stationery> sortByName();
	
	public List<Stationery> sortByPriceAndName();
}
