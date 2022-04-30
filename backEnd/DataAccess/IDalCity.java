package com.onMyOwn.backEnd.DataAccess;

import java.util.List;

import com.onMyOwn.backEnd.Entities.City;

public interface IDalCity {
	
	List<City> selectAll();
	
	void add();
	
	void delete();
	
	void update();
	
}
