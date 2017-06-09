package com.epam.training.stationery.main;

import java.util.ArrayList;

import com.epam.training.stationery.domain.File;
import com.epam.training.stationery.domain.Folder;
import com.epam.training.stationery.domain.Marker;
import com.epam.training.stationery.domain.Pen;
import com.epam.training.stationery.domain.Pencil;
import com.epam.training.stationery.domain.StickNotes;
import com.epam.training.stationery.kit.Kit;
import com.epam.training.stationery.kit.StarterKit;

public class AppStart {

	public static void main(String[] args) {
		Kit sKit = new StarterKit(new ArrayList<>());
		
		
		sKit.addItems(new Folder("FOLDER", 2));
		sKit.addItems(new File("FILE", 1));
		sKit.addItems(new Marker("MARKER", 5));
		sKit.addItems(new Pen("PEN", 3));
		sKit.addItems(new StickNotes("NOTES", 4));
		sKit.addItems(new Pencil("PENCIL", 4));
		
		System.out.println(((StarterKit) sKit).getStationaryList());

		System.out.println("After sorting by Name");
		System.out.println(sKit.sortByName());
		System.out.println("After sorting by Price");
		System.out.println(sKit.sortByPrice());
		System.out.println("After sorting by Price and Name");
		System.out.println(sKit.sortByPriceAndName());
	}

}
