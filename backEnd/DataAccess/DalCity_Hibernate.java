package com.onMyOwn.backEnd.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onMyOwn.backEnd.Entities.City;

@Repository
public class DalCity_Hibernate implements IDalCity{
	private EntityManager entityManager;
	
	@Autowired
	public DalCity_Hibernate(EntityManager entityManager) {
			this.entityManager = entityManager;
		}

	@Override
	@Transactional
	public List<City> selectAll() {
		
		Session session =entityManager.unwrap(Session.class);
		List<City> cities = session.createQuery("select * from City").getResultList();
		return cities;
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
