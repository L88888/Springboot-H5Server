package com.sit.liu.demo.controller;

import com.sit.liu.demo.model.Country;
import com.sit.liu.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CountryController {

	@Autowired
	private CountryService countryService;
	
	@RequestMapping("/getCountryList")
	public List<Country> getCountryList() {
		return countryService.getCountryList();
	}

	/**
	 * http://127.0.0.1:8080/server-track/testpay
	 * @return
	 */
	@RequestMapping(value = "server-track/testpay", method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Map testpay() {
		// 开始计算费用并支付
		System.out.println("testpay");
		Map payMapData = new LinkedHashMap(3);
		payMapData.put("data","success");
		return payMapData;
	}
	
}
