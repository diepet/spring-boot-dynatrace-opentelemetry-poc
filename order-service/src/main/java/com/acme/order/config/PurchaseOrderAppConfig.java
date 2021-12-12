package com.acme.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.acme.order.service.PurchaseOrderService;

@Configuration
class PurchaseOrderAppConfig {

	
	@Bean
	PurchaseOrderService purchaseOrderService() {
		return new PurchaseOrderService();
	}
	
	
	
}
