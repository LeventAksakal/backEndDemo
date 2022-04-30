package com.onMyOwn.backEnd.Business;

import java.util.List;

import com.onMyOwn.backEnd.Entities.City;

public interface IServiceCity {
	
	List<City> selectAll();
	
	void add();
	
	void delete();
	
	void update();
	
}
