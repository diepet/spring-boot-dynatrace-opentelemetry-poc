package com.acme.order.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.acme.order.controller.model.PurchaseOrder;
import com.acme.order.repository.PurchaseOrderRepository;
import com.acme.order.util.Util;

@Transactional
public class PurchaseOrderService {

	private static final Logger LOGGER = LoggerFactory.getLogger(PurchaseOrderService.class);
	
	@Autowired
	private PurchaseOrderRepository purchaseOrderRepository;
	
	public PurchaseOrder createPurchaseOrder(PurchaseOrder purchaseOrder) {
		
		LOGGER.info("Started transaction for creating purchase order {}", purchaseOrder);
		
		Util.sleepForAWhile();
		
		PurchaseOrder savedPurchaseOrder = purchaseOrderRepository.save(purchaseOrder);
		
		LOGGER.info("Saved purchase order {}", savedPurchaseOrder);
		
		return savedPurchaseOrder;
		
	}
	
	@Transactional(readOnly = true)
	public PurchaseOrder getPurchaseOrder(long id) {

		Util.sleepForAWhile();

		return purchaseOrderRepository.findById(id).get();
	}
	
}
