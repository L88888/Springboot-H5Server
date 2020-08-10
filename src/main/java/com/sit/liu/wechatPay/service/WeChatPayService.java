package com.sit.liu.wechatPay.service;

import java.util.Map;

public interface WeChatPayService {

	public String testWeChatPay(String bill_create_ip, Double realAmount);
	
	public boolean orderQuery(Map<String, Object> reqData);
	
}
