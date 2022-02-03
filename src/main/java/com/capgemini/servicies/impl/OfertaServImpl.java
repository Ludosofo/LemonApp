package com.capgemini.servicies.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.IOfertaDao;
import com.capgemini.entities.Oferta;
import com.capgemini.servicies.IOfertaServ;

@Service
public class OfertaServImpl implements IOfertaServ {
	
	@Autowired
	private IOfertaDao daoOferta;

	@Override
	public List<Oferta> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Oferta findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(Oferta oferta) {
		// TODO Auto-generated method stub
		
	}

}
