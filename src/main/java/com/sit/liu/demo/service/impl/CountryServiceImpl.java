package com.sit.liu.demo.service.impl;

import java.util.List;

import com.sit.liu.demo.dao.CountryMapper;
import com.sit.liu.demo.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sit.liu.demo.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryMapper countryDao;
	
	public List<Country> getCountryList() {
		return countryDao.getCountryList();
	}
	
}
