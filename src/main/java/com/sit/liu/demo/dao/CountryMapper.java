package com.sit.liu.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sit.liu.demo.model.Country;

/**
 * interface name need equal to mapper
 * @author wwypa
 * @param <T>
 *
 */
@Mapper
public interface CountryMapper{

//	@Select(value = { "select * from country" })
	public List<Country> getCountryList();
	
}
