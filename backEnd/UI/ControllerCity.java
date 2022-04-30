package com.onMyOwn.backEnd.UI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onMyOwn.backEnd.Business.IServiceCity;
import com.onMyOwn.backEnd.Entities.City;

@RestController
@RequestMapping("/api")
public class ControllerCity {
	private IServiceCity iServiceCity;

	@Autowired
	public ControllerCity(IServiceCity iServiceCity) {
		this.iServiceCity = iServiceCity;
	}
	
	@RequestMapping("/cities")
	public List<City> get(){
		return iServiceCity.selectAll();
	}
}

