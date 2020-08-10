package com.sit.liu.demo.service;

import java.util.List;

import com.sit.liu.demo.model.Country;
import org.springframework.stereotype.Service;

@Service
public interface CountryService {
	
	public List<Country> getCountryList();
	
	

}
