package com.acme.order.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.acme.order.controller.model.PurchaseOrder;
import com.acme.order.repository.PurchaseOrderRepository;

@Transactional
public class PurchaseOrderService {

	@Autowired
	private PurchaseOrderRepository purchaseOrderRepository;
	
	public PurchaseOrder createPurchaseOrder(PurchaseOrder purchaseOrder) {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return purchaseOrderRepository.save(purchaseOrder);
		
	}
	
	@Transactional(readOnly = true)
	public PurchaseOrder getPurchaseOrder(long id) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return purchaseOrderRepository.findById(id).get();
	}
	
}
