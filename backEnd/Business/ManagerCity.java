package com.onMyOwn.backEnd.Business;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onMyOwn.backEnd.DataAccess.IDalCity;
import com.onMyOwn.backEnd.Entities.City;

@Service
public class ManagerCity implements IServiceCity{
	
	private IDalCity iDalCity;
	@Autowired
	public ManagerCity(IDalCity iDalCity) {
		this.iDalCity = iDalCity;
	}

	@Override
	@Transactional
	public List<City> selectAll() {
		return iDalCity.selectAll();	
	}

	@Override
	public void add() {
		iDalCity.add();
	}

	@Override
	public void delete() {
		iDalCity.delete();
	}

	@Override
	public void update() {
		iDalCity.update();
	}

}
